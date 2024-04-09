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
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                            1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15502");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test15503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15503");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("h!4H!4IIh4I4h4IIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15504");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test15505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15505");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15506");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 100, 0);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test15507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("h!4H!4IIh4I4h4IIh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!4H!4IIh4I4h4IIh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15509");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi! hi! hi!1.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15510");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("h!4H!4IIh4I4h4IIh", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test15511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15511");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15512");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100#100#1#-1#1#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-1#1#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15513");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi! hi! hi!1.0 0.0hi!   hi! hi!1.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15514");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test15515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1004100414-1414-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1004100414-1414-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15516");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 1, (int) (short) 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test15517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15517");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) (short) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test15518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15518");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test15519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97#1#-1#1#100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97#1#-1#1#100#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15520");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15521");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (byte) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15522");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test15523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15523");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!1.00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!1.00.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15524");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!   hi! hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15525");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1HI!   HI! HI!1.0 0.0100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15526");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test15527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15527");
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
    public void test15528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15528");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(817, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test15529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15529");
        long[] longArray5 = new long[] { 10, (short) 0, 10L, 100L, 1 };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, 0, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a0a10a100a1" + "'", str9, "10a0a10a100a1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15530");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test15531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15531");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                            1.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15532");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 100, (int) '4');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100414041004524-1" + "'", str11, "100414041004524-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100#1#0#100#52#-1" + "'", str13, "100#1#0#100#52#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test15533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15533");
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
    public void test15534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15534");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (-1.41041039E14f), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15535");
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
    public void test15536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15536");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100 -1 1 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15537");
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
    public void test15538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15538");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15539");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) (short) 100, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15540");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test15541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15541");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-141041041404100", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-141041041404100L) + "'", long2 == (-141041041404100L));
    }

    @Test
    public void test15542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15542");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!   hi! ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15543");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!   hi! hi!1.0 0.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test15544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15544");
        int[] intArray2 = new int[] { '#', (byte) -1 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, -1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test15545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15545");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#0.0" + "'", str6, "1.0#0.0");
    }

    @Test
    public void test15546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15546");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1hi!   hi! hi!1.0 0.0100 1 0 100 52 -1", (float) 1L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test15547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15547");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444444444444444444444444444444444444497#1#-1#1#100#10", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test15548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15548");
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
    public void test15549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15549");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!ih !ih   !ih!ih !ih   !ih!ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15550");
        float[] floatArray2 = new float[] { (short) 0, 0.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test15551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15551");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#11", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test15552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15552");
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
    public void test15553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15553");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test15554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15554");
        float[] floatArray2 = new float[] { (short) 1, (-1.0f) };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
    }

    @Test
    public void test15555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15555");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test15556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15557");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test15558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15558");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test15559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15559");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!hi!   hi! hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15560");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10L, (long) '4', (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test15561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15561");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (-1L), (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test15562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15562");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#11");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test15563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15563");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, 0.0f, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test15564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15564");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Hi!   hi! hi!1.0 0.0            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15565");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, 0.0d, (double) 817L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15566");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test15567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15567");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1hi!hi!hi!1.00.01001010052-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15568");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.040.0" + "'", str6, "1.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test15569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15569");
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
    public void test15570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15570");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test15571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15571");
        long[] longArray6 = new long[] { 100, (short) 1, (short) 0, (short) 100, '4', (-1L) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[100, 1, 0, 100, 52, -1]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100 1 0 100 52 -1" + "'", str8, "100 1 0 100 52 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
    }

    @Test
    public void test15572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15572");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi! hi! hi!1.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! hi! \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15573");
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
    public void test15574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15574");
        int[] intArray6 = new int[] { (byte) 1, (short) 100, ' ', '4', (byte) 10, (short) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[1, 100, 32, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test15575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15575");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hii4H4i4Hii4!h4!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hii4H4i4Hii4!h4!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15576");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-141041041404100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test15577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15577");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0#0.0", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15578");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (int) (short) 0, 300);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 300 + "'", int3 == 300);
    }

    @Test
    public void test15579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4!4hi4!4   4hi4!4 4hi4! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15580");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (float) '#', (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test15581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15582");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100#100#1#-!IH !IH   !IH!IH !IH   !IH!IH 100#100#1#-", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test15583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15583");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1.040.", (long) 817);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 817L + "'", long2 == 817L);
    }

    @Test
    public void test15584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15584");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, (int) (byte) 10, 1164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test15585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15585");
        long[] longArray3 = new long[] { (byte) -1, ' ', 1L };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, 32, 1]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
    }

    @Test
    public void test15586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15586");
        double[] doubleArray2 = new double[] { 1L, (byte) 0 };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 0.0" + "'", str5, "1.0 0.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0a0.0" + "'", str8, "1.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
    }

    @Test
    public void test15587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15587");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 -1 1 10 1" + "'", str9, "100 -1 1 10 1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test15588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15588");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1.0 35.0 -1.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15589");
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
    public void test15590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15590");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#-1#-1#1" + "'", str12, "10#-1#-1#-1#1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test15591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15591");
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
    public void test15592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10a-1a-1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 1 0 100 52 -");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100 1 0 100 52 - is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15594");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) ' ', (long) 817);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 817L + "'", long3 == 817L);
    }

    @Test
    public void test15595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15595");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!hi!hi!1.00.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15596");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10A0A10A100A1", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15597");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 10, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 10, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 -1 1 10 1" + "'", str7, "100 -1 1 10 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a-1a1a10a1" + "'", str9, "100a-1a1a10a1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#-1#1#10#1" + "'", str12, "100#-1#1#10#1");
    }

    @Test
    public void test15598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15598");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0 0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15599");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1004100414-1414-1!ih!ih!ih!ih!ih!ih!ih01 001 1 1- 1 79aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15600");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100100#-1#1#1-1100#-1#1#11100#-1#1#110100#-1#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15601");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (short) 10, (int) (byte) 1);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test15602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15602");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!IH !IH   !IH!IH !IH   !IH!IH ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test15603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15603");
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
    public void test15604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15604");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("97 1 -1 1 100 10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test15605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15605");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("!ih !ih   !ih!ih !ih   !ih!ih ", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test15606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15606");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test15607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15607");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih!ih !ih   !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15608");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1hi!   hi! hi!100 1 0 100 52 -1100 -1 1 1", 1.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test15609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15609");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 100, 0);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test15610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15610");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test15611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15611");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("!IH !IH   !IH!IH !IH   !IH!IH ", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test15612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15612");
        long[] longArray4 = new long[] { 'a', (short) 0, 1, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[97, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test15613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15613");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test15614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15614");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, 0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test15615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15615");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test15616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15616");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" hi!hi!   hi! hi!hi!   hi! hi!", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test15617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15617");
        float[] floatArray4 = new float[] { (byte) 0, (byte) 10, 0L, (byte) -1 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) (byte) 10, (int) (byte) -1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[0.0, 10.0, 0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test15618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15618");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hII4h4I4hII4!H4!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hII4h4I4hII4!H4!h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15619");
        int[] intArray6 = new int[] { 'a', (short) 1, (short) -1, (byte) 1, (short) 100, (byte) 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 1, -1, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97#1#-1#1#100#10" + "'", str9, "97#1#-1#1#100#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test15620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15620");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15621");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, 817.0d, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test15622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15622");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 -1 1 1-1100 -1 1 11100 -1 1 110100 -1 1 11", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test15623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15623");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, (int) (short) -1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test15624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15624");
        short[] shortArray4 = new short[] { (short) -1, (byte) 10, (byte) 100, (byte) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 0, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 10, 100, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a10a100a100" + "'", str11, "-1a10a100a100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1a10a100a100" + "'", str13, "-1a10a100a100");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test15625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100 -1 1 10 1!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 -1 1 10 1!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test15626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15626");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a10.0", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test15627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15627");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) 817, (long) 797);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 817L + "'", long3 == 817L);
    }

    @Test
    public void test15628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15628");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#1#0#100#52#-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test15629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15629");
        short[] shortArray5 = new short[] { (short) 10, (short) -1, (byte) -1, (short) -1, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 100, (int) (byte) 1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 797, (int) (short) 1);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, -1, -1, -1, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1a-1a-1a1" + "'", str12, "10a-1a-1a-1a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test15630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest31.test15630");
        int[] intArray2 = new int[] { (short) 10, 'a' };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, (int) (short) -1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }
}

