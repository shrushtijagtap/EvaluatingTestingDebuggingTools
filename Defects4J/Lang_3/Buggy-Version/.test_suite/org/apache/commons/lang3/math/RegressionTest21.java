package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("354-14040");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#00.0A0.0A0.1-", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (short) 10, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (short) 100, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaa#479#25#001#01#1-#001aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaa#479#25#001#01#1-#001aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100a0a-1a100a1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', 100L, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100a135#-1", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444#-#4#-#4#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
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
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("7920AA....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#a", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 1L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaa#479#25#001#01#1-#001aaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#100#-11.0 0.0 0.0-1.0A0.0A0.0", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#100#-11.0 0.0 0.0-1.0A0.0A0.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AA ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 'a', 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 0, (double) (byte) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#0#-1#100#1#1", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0 0.0 0.0", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "7920AA....                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 7920AA....                                                                                         ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) -1, 1.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -35#-1#0#00.0A0.0A0.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("c");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0A0.0A0. ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0A0. \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100a1-1.0A0.0A0.", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100a1-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) ' ', (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 0, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100 ", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) (short) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) ' ', (double) (byte) -1, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1004-14104100452497", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0 -1.0", (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (-1L), (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("7925001...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, 1L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0#0.0#0.1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1, (float) (byte) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, (float) '4', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1-4001401");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" .14 .14 1.14 .141.14 1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010", 100.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (float) (-1), (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("        0.0A0.0A0.1-1a001       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#100#-11.0 0.0 0.0-1.0A0.0A0.0", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("       100a1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaa#479#25#001#01#1-#001aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (short) 0, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100a-1a10a100a52a97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 0, (double) 1.0f, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.041.0410.041.040.0410.0444435#-1#0#00.0A0.0A0.1-444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1004-14104100452497", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, (float) 0, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1.A.A.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("354-14040");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (short) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10, (double) (byte) 0, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("H35#-1#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100a1-1.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1-4001401100a135#-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#0", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, (double) 'a', (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (double) 100, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1041004-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, (long) (short) -1, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("925001011-001444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("       100a1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("7920AA....                                                                                         100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7920AA....                                                                                         100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("7920AA....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray0, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray0, '4', (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100404-141004141" + "'", str12, "100404-141004141");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, 0.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444435#-1#0#00.0A0.0A0.1-444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0a0.0a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a0.0a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhH", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (float) (byte) -1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) (short) -1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0A0.0A0.", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("h35#-1#0#", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (byte) 1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100, (float) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444#-#4#-#4#", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) (byte) 1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa010100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4 A", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("7925001...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) (short) 0, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10.0 10.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0 0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10041");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10041 + "'", int1 == 10041);
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"c\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 10L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("        0.0A0.0A0.1-1a001       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        0.0A0.0A0.1-1a001       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100 10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("        0.0A0.0A0.1-1a001       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("### 1###                       ", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 10, (int) (short) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 10041L + "'", long1 == 10041L);
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35 -1 0 0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) '#', (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("354-14040");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "4aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4aa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) (short) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0-1.0-1-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0-1.0-10 .14 .14 1.14 .141.14 1.1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100 0 -1 100 1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, (float) (byte) 1, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A0.0A0.0100 1", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 10L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0a10.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#100#-1" + "'", str11, "10#100#-1");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) '#', 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0#0.0#0.1-", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100#-#0#-#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 100.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444444444444444444444444 0.0 0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                             .0A0.0A0.                                              ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("H35#-1#0#100 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("h35#-1#0#100 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 0, (double) (byte) 1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("35#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("H");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4 a.0A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) (short) 0, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                          100a0a-1a100a1a1                                          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("H35#-1#0#", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("925001011-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0L, (float) '4', (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 1L, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0A0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) (short) -1, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 0, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100a1-1.0A0.0A0.0", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) (short) 0, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0A.A0AAA0A.A0AAA0A.A1A-AAA10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010AAA100A A10AAA10AAA100AAA-A1AAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                          100a0a-1a100a1a1                                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaa100#-1#10#100#52#974#aaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("        0.0A0.0A0.1-1a001       ", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a#a100.0a1a4 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 0L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) 100L, (double) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, (double) 1L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100a10hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a10hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 0.0f, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#100#-11.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, 10.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 100, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 10041, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100a10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100a10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("H35#-1#0#100 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100 0 -1 100 1 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', (int) (byte) -1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) (short) 10, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10a100a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a100a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("7920AA....                                                                                         ", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444435#-1#0#00.0A0.0A0.1-444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444435#-1#0#00.0A0.0A0.1-444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '4', 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa4", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, 0.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100 7920AA....                                                                                          1-4001401");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 1, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#100#-1" + "'", str20, "10#100#-1");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0A0.0A0.1-1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a35.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444 0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444 0.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1000100035#-1#0#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10100a10100a10100a10100a10100a10100a10100a10100a10100", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a#479#25#001#01#1-#001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) ' ');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 32.0f + "'", float2 == 32.0f);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0A.A0AAA0A.A0AAA0A.A1A-AAA10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010AAA100A A10AAA10AAA100AAA-A1AAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10041");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10041.0f + "'", float1 == 10041.0f);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("        0.0A0.0A0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, (double) (byte) 1, (double) 10041L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (double) '#', (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 10100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0A0.0A0.1-1a", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 10100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1### 1###", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 0.0 0.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                             .0A0.0A0.                                              ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("7920AA....                                                                                         100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0 0.0 0.01### 1###                       ", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1007920##....", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("       100a1-1.0A0.0A0.0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       100a1-1.0A0.0A0.0        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10041L, 1L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa4 a a a ", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) ' ', (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#10#100#52#974#a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aa4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hhhhhhhhhh");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) (-1L), (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10041, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', (double) (byte) 10, (double) 10041L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10041.0d + "'", double3 == 10041.0d);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) (short) 100, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("h35#-1#0#100", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a135");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a135\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100a10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 0.0 0.0", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, (-1L), (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a100a-1" + "'", str13, "10a100a-1");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1L, (float) ' ', (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a#a100.0a1a4 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 67, (float) 100, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), (float) (short) 0, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "4 #                             ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4 #                             ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1007920##....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"920##....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A0.0A0.", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10041L, (float) 100L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 1.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0", 10041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10041 + "'", int2 == 10041);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) -1, (float) ' ', (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("925001011-001444444444444444444444444444444444444444100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#100#-11.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1### 1###", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), (long) ' ', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1### 1###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1### 1###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), 0.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" aa4 a a a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aa4 a a a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444445E66d + "'", double2 == 4.444444444444445E66d);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', (long) 1, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a#479#25#0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 0.0 0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10.0f, 0.0d, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AA4 A A A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray0, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray0, '4', (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("79#25#001#01#1-#001aaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 0, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #aHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #aHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) (short) 1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100a1-1.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("354-14040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (short) -1, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a1", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                100 ", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) (-1L), (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("AA ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1100 10-100 104001401");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, (double) 10.0f, 10041.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("H35#-1#0#100 ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1.0f), (double) 10041.0f, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10041.0d + "'", double3 == 10041.0d);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("        0.0A0.0A0.1-1A001       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-1A001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "a135");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a135");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100#0#-1#100#1#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.041.0410.041.040.0410.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.041.0410.041.040.0410.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100#10");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("          100a1-1.0A0.0A0.0                35 -1 0 0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), (long) (short) 10, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0410.0" + "'", str17, "10.0410.0");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100#-1#10#100#52#974#ah35#-1#0#100 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AA ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a1.A.A.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0.", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0L, (float) (short) -1, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4 #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4 # is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1041004-10.0 0.0 0.1-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) 0L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.040.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.Class<?> wildcardClass16 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) 1, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0" + "'", str11, "100.0");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }
}

