package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 627, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 114, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 627, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 155, 464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 155");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3883, 655, 727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 655 + "'", int3 == 655);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "lass [Ljava.lang.String;class [S925001011-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: lass [Ljava.lang.String;class [S925001011-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1041004-1" + "'", str19, "1041004-1");
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhA#479#25#001#01#1-#001", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a", (float) 10100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10100.0f + "'", float2 == 10100.0f);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                  a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
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
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1068, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) 100, 258);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0a0.0a0.0" + "'", str23, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#          100a1-1.0a0.0a0.0        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1" + "'", str9, "100#1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10041" + "'", str14, "10041");
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a#4");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444#-#4#-#4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 444#-#4#-#4# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1429, 115);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1429 + "'", int3 == 1429);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 1042, 149);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354-14040" + "'", str11, "354-14040");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("        0.0A0.0A0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:         0.0A0.0A0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 200, 1042);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 200");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1051.0f, 500.0f, (float) 1072);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 500.0f + "'", float3 == 500.0f);
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10a#a100.0a1a4 354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. aa4 a a a ", 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(961, 155, 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 961 + "'", int3 == 961);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int28 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1004-14104100452497" + "'", str26, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a1" + "'", str14, "100a1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                      -1                       ###1 ###10.0 0.0 0.1-HHHHHHHHHHH-1.0A0.0A0.00#0#1-#53", 179);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 179 + "'", int2 == 179);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0#-1.0.10.0a10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("79#25#001#01#1-#001A1.A.A.354-140403444444444444444444444444444444444444444444100A10h...354-14040100#-1#10#100#52#97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#001A1.A.A.354-140403444444444444444444444444444444444444444444100A10h...354-140403");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#10#100#52#97" + "'", str17, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100A0A-1A100A1A1                                          35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100A0A-1A100A1A1                                          35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A.0.A.0", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #AhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".100 7920AA....                                                                                          a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a354-14040", (float) 199);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 199.0f + "'", float2 == 199.0f);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-35#-1#0#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 310, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 310 + "'", int3 == 310);
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(258, 4323, 630);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4323 + "'", int3 == 4323);
    }

    @Test
    public void test14536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14536");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test14537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14537");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0#0.0#0.0" + "'", str14, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 0.0 0.0" + "'", str16, "-1.0 0.0 0.0");
    }

    @Test
    public void test14538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14538");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14539");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14540");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 149, 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test14541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14541");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                  35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A                                                                  ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14542");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, (int) (short) 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double25 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0#0.0#0.0" + "'", str22, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1.0 0.0 0.0" + "'", str24, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
    }

    @Test
    public void test14543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14543");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("925001011-00110#100#-11.0 0.01004-1410410045249");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14544");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1733L, (double) 500L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test14545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14545");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 627, (double) 1618L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1618.0d + "'", double3 == 1618.0d);
    }

    @Test
    public void test14546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14546");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1068, (float) (short) 0, (float) 546);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1068.0f + "'", float3 == 1068.0f);
    }

    @Test
    public void test14547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14547");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14548");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 200, (long) '4', (long) 210);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 210L + "'", long3 == 210L);
    }

    @Test
    public void test14549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14549");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10.0a10.0" + "'", str6, "10.0a10.0");
    }

    @Test
    public void test14550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14550");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test14551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14551");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100 0 -1 100 1 1111100103");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14552");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10041" + "'", str12, "10041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test14553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14553");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("32 0 0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32 0 0 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14554");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 229, (int) (byte) 100);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test14555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14555");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       4444435#-1#0#00.35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a4444435#-1#0#00.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14556");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4AA0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4AA0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14557");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("11004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.011004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14558");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444 0.0 0.100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4a44444444444444444444444444444444444444444444 0.0 0.100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test14559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14559");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                            4#aaaaaaaa                             aaaaaa100#-1#10#100#52#974444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14560");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1052, 1061, 2419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2419 + "'", int3 == 2419);
    }

    @Test
    public void test14561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14561");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".00.00.-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0354-14040..A1...A1...A1...A1...A1...A1...A1...A1...35#-1#0#00.0A0.0A0.1-4444444 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14562");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("41004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404              A#479#25#001#01#1-#001");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14563");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 207, (int) 'a');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
    }

    @Test
    public void test14564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14564");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354-14040" + "'", str11, "354-14040");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "354-14040" + "'", str14, "354-14040");
    }

    @Test
    public void test14565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14565");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                                                                            0A0.A0.0A0.A0.0A0.A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                             0A0.A0.0A0.A0.0A0.A0.0A0.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141404104041" + "'", str14, "-141404104041");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test14566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14566");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1.0h0.0h0.0100#1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0h0.0h0.0100#1");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#100#-1" + "'", str24, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 100 + "'", byte25 == (byte) 100);
    }

    @Test
    public void test14567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14567");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#A#A0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh35 -1 0 0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14568");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) -1, (int) (byte) -1);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 1042, (int) '#');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double30 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0a0.0a0.0" + "'", str22, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1.0#0.0#0.0" + "'", str29, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
    }

    @Test
    public void test14569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14569");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14570");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("  ###1 ###", (long) 10001000);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10001000L + "'", long2 == 10001000L);
    }

    @Test
    public void test14571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14571");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("        0.0A0.0A0.1-1001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14572");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 967, (long) 1066, (long) 1068);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1068L + "'", long3 == 1068L);
    }

    @Test
    public void test14573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14573");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 490, (long) 114, (long) 1618);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1618L + "'", long3 == 1618L);
    }

    @Test
    public void test14574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14574");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1072, 699L, (long) 4326);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 699L + "'", long3 == 699L);
    }

    @Test
    public void test14575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14575");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 1066, (long) 528);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14576");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 727, 132L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 727L + "'", long3 == 727L);
    }

    @Test
    public void test14577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14577");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 528, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test14578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14578");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#10#100#52#97" + "'", str17, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test14579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14579");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 1061, 4230);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test14580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14580");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1035#-1#0#0#35#-1#0#0100.035#-1#0#0135#-1#0#04 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1035#-1#0#0#35#-1#0#0100.035#-1#0#0135#-1#0#04 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14581");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test14582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14582");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00.00.01###1###4A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.00aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14583");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 1, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35#-1#0#0" + "'", str18, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35a-1a0a0" + "'", str20, "35a-1a0a0");
    }

    @Test
    public void test14584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14584");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) 'a', (int) 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a100a-1" + "'", str17, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test14585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14585");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', (float) 4323, (float) 4230L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4323.0f + "'", float3 == 4323.0f);
    }

    @Test
    public void test14586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14586");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 310L, (double) 500L, (double) 770L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 770.0d + "'", double3 == 770.0d);
    }

    @Test
    public void test14587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14587");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14588");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14589");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test14590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14590");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 678, 0);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14591");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (short) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test14592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14592");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                          100A0A-1A100A1A1                                        #####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                          100A0A-1A100A1A1                                        #####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14593");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(727L, 171L, 482L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 727L + "'", long3 == 727L);
    }

    @Test
    public void test14594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14594");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0A0.0A0.0100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A0.0A0.0100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14595");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '#', (int) ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a-1" + "'", str15, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1041004-1" + "'", str20, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
    }

    @Test
    public void test14596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14596");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("Aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0aa0a1-a5311a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a001 100A10h...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14597");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaa#aaa#aaaaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaaaa#aaa00#10100                                           ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14598");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a10a100a52a97" + "'", str15, "100a-1a10a100a52a97");
    }

    @Test
    public void test14599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14599");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 227, (double) 177, (double) 1.00110096E8f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 177.0d + "'", double3 == 177.0d);
    }

    @Test
    public void test14600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14600");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 905, (int) ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test14601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14601");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                   100a1-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14602");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
    }

    @Test
    public void test14603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14603");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 10, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 10041, 10041);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 1072, 210);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 2433, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) -1 + "'", byte24 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test14604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 3883L, (float) 546, 1.0001E7f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 546.0f + "'", float3 == 546.0f);
    }

    @Test
    public void test14605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14605");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1, (float) 3867, (float) 482);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test14606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14606");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("...1005297hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (long) 290);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 290L + "'", long2 == 290L);
    }

    @Test
    public void test14607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14607");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 592, 2419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2419 + "'", int3 == 2419);
    }

    @Test
    public void test14608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14608");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 500, 0);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#100#-1" + "'", str13, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test14609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14609");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, 1066);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1041004-1" + "'", str6, "1041004-1");
    }

    @Test
    public void test14610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14610");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 220, 276);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#100#-1" + "'", str9, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#100#-1" + "'", str11, "10#100#-1");
    }

    @Test
    public void test14611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14611");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 996L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 996.0f + "'", float2 == 996.0f);
    }

    @Test
    public void test14612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("32 0 0 a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32 0 0 a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1                                                                                      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14614");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14615");
        float[] floatArray2 = new float[] { (-1), 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 114, 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 4330, 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14616");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 1429);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test14617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14617");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 634, 905L, (long) 179);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 179L + "'", long3 == 179L);
    }

    @Test
    public void test14618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14618");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                    hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4444435#-1#0#00.0A0.0A0.1-444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14619");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1041004-1" + "'", str16, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
    }

    @Test
    public void test14620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14620");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("H0.0H0.0100#0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           -1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-1#1#0#10#0#1-10.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100            ", (double) 634);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 634.0d + "'", double2 == 634.0d);
    }

    @Test
    public void test14621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14621");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("--a--0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14622");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444440.0 0.0 0.1-h.0A0.0A0. hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14623");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(243L, 171L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 243L + "'", long3 == 243L);
    }

    @Test
    public void test14624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14624");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 694, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test14625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14625");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0-1.0#-1.0-1.0#-1.0-14aa                                          100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14626");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("        0.0A0.0A0.1-1A001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14627");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("925001011-001444444444444444444444444444444444444444100 10                                          #####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-001444444444444444444444444444444444444444100 10                                          #####################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14629");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1733L, (float) 207, (float) 276);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 207.0f + "'", float3 == 207.0f);
    }

    @Test
    public void test14630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14630");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A313A3133A3A#A ###################################HHHHHHHHHHH#13A3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14631");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 179, (int) (short) -1);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10041" + "'", str12, "10041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14632");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1066, 206, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1066 + "'", int3 == 1066);
    }

    @Test
    public void test14633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14633");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("925001011-001444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-001444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14634");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, (double) 678L, (double) 627.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 678.0d + "'", double3 == 678.0d);
    }

    @Test
    public void test14635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14635");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1051, 678, 4326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4326 + "'", int3 == 4326);
    }

    @Test
    public void test14636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14636");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0 0.0 0.01### 1##0.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 0.0 0.01### 1##0.0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14637");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 206, (long) 114, (long) 967);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 967L + "'", long3 == 967L);
    }

    @Test
    public void test14638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14638");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 4323, 0);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 10 + "'", byte14 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1#1#0#10#0#1" + "'", str16, "-1#1#0#10#0#1");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test14639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14639");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10041, (float) 634, (float) 599L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test14640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14640");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "44444444444444444444444444444444444444444444 4a4 4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444444444444444444444444444444444444444 4a4 4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a-1" + "'", str15, "10a100a-1");
    }

    @Test
    public void test14641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14641");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1429L, 4.4444444444444445E228d, 967.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444444445E228d + "'", double3 == 4.4444444444444445E228d);
    }

    @Test
    public void test14642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14642");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a1.A.A.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14643");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1072, (int) (short) 1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 272, 3883);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 272");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test14644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14644");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a0.0a0.0" + "'", str12, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a0.0a0.0" + "'", str14, "-1.0a0.0a0.0");
    }

    @Test
    public void test14645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14645");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 159, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14646");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("H0.0H0.0100#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14647");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 272, (long) 159);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14648");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("41004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 40");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14649");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0 0.0 0.0" + "'", str18, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test14650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14650");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 0, 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 494 + "'", int3 == 494);
    }

    @Test
    public void test14651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14651");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (byte) 10, 4330);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35" + "'", str17, "35");
    }

    @Test
    public void test14652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14652");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 200, (long) (byte) 1, (long) 115);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 200L + "'", long3 == 200L);
    }

    @Test
    public void test14653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14653");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("925001011-001444444444444444444444444444444444444444100 10                                          A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14654");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 229, 100);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354-14040" + "'", str11, "354-14040");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test14655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14655");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a10a100a52a97" + "'", str15, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 10 100 52 97" + "'", str19, "100 -1 10 100 52 97");
    }

    @Test
    public void test14656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14656");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 199.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 199.0d + "'", double2 == 199.0d);
    }

    @Test
    public void test14657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14657");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4...", (long) 727);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 727L + "'", long2 == 727L);
    }

    @Test
    public void test14658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14658");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 10001000, (int) (byte) 1);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 1072, 699);
        byte byte33 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10#100#-1" + "'", str28, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + byte33 + "' != '" + (byte) -1 + "'", byte33 == (byte) -1);
    }

    @Test
    public void test14659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14659");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) -1, (int) (byte) -1);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) ' ', (int) ' ');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double28 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1.0#0.0#0.0" + "'", str27, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
    }

    @Test
    public void test14660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##########################################100A10h...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14661");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(114, 678, 1733);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1733 + "'", int3 == 1733);
    }

    @Test
    public void test14662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14662");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + Double.POSITIVE_INFINITY + "'", double1 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test14663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14663");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 627, (float) 258, (float) 10100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 258.0f + "'", float3 == 258.0f);
    }

    @Test
    public void test14664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14664");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14665");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1004-14104100452497" + "'", str18, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100#-1#10#100#52#97" + "'", str20, "100#-1#10#100#52#97");
    }

    @Test
    public void test14666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14666");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (byte) 100, 0);
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test14667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14667");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#100#-1" + "'", str15, "10#100#-1");
    }

    @Test
    public void test14668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14668");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a100a-1" + "'", str17, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 100 -1" + "'", str20, "10 100 -1");
    }

    @Test
    public void test14669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("7920AA....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14670");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4230, 10L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test14671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14671");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhh100a1-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14672");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.04#0#1-#5");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14673");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4.444444444444445E661.0-11068");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14674");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (-1L), (double) 149L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test14675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14675");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 662, 492);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 0, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35#-1#0#0" + "'", str11, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test14676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14676");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) -1, (int) (byte) -1);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0#0.0#0.0" + "'", str23, "-1.0#0.0#0.0");
    }

    @Test
    public void test14677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14677");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 1044, 177);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10#100#-1" + "'", str23, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10a100a-1" + "'", str25, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10 100 -1" + "'", str27, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test14678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14678");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14679");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 132, 487);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 132");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14680");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 10041, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 61, 662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 61");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35#-1#0#0" + "'", str15, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14681");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101100A1-1.0A0.0A0.", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test14682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14682");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("h                                                                                                                                                                                                       ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14683");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.3H.A.A.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14684");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1059, 210);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0#0.0#0.0" + "'", str21, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test14685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14685");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100A1-1.0A0.0A0.", (float) 177);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 177.0f + "'", float2 == 177.0f);
    }

    @Test
    public void test14686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14686");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1733L, 74.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1733.0f + "'", float3 == 1733.0f);
    }

    @Test
    public void test14687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14687");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4444435#-1#0#00.0A0.0A0.1-44444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh4444435#-1#0#00.0A0.0A0.1-44444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14688");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14689");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 662, 492);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35#-1#0#0" + "'", str11, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test14690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14690");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 10, (int) (short) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#100#-1" + "'", str17, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test14691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14691");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0#-1.0" + "'", str6, "-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0 -1.0" + "'", str9, "-1.0 -1.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test14692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14692");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a1.A.A.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14693");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        -HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH0.041.040.0410.444#-#4#-#4#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14694");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 0, 627);
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
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0 10.0" + "'", str18, "10.0 10.0");
    }

    @Test
    public void test14695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14695");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1, (int) (byte) 1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14696");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35#-1#0#0" + "'", str19, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35a-1a0a0" + "'", str22, "35a-1a0a0");
    }

    @Test
    public void test14697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14697");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3883, 111100103L, (long) 177);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 111100103L + "'", long3 == 111100103L);
    }

    @Test
    public void test14698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14698");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10#100#-1100#-1#10#100#52#9#479#210#100#-1100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A0 0A0 .0.000.       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA.0.0.0.0.00...0.0.0.0.00.0 00..0.0.0.0.00...0.0.0.0.00.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa30 000 000 .00.  .  . . .  .. . . 0 000 000 .00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0 0A0 .0.000.       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA.0.0.0.0.00...0.0.0.0.00.0 00..0.0.0.0.00...0.0.0.0.00.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa30 000 000 .00.  .  . . .  .. . . 0 000 000 .00\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14700");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1042, 770);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#-1#10#100#52#97" + "'", str18, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100a-1a10a100a52a97" + "'", str27, "100a-1a10a100a52a97");
    }

    @Test
    public void test14701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14701");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '#', 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 0, (int) (short) 1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0" + "'", str15, "10.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 10.0f + "'", float17 == 10.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10.0 10.0" + "'", str19, "10.0 10.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 10.0f + "'", float20 == 10.0f);
    }

    @Test
    public void test14702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14702");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14703");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14704");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(4230, (int) ' ', 2419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4230 + "'", int3 == 4230);
    }

    @Test
    public void test14705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14705");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 3883L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3883.0d + "'", double2 == 3883.0d);
    }

    @Test
    public void test14706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14706");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa10100a10100a10100a10100a10100a10100a10100a10100a10100hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100a1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14707");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 10041, 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0" + "'", str17, "100.0");
    }

    @Test
    public void test14708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14708");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("          41004A414-414.404A404.404A404.404                4354 4-414 404 40");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14709");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0-1.041.0410.041.040.0410.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14710");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1007920AA....");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14711");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 0.0 0.0" + "'", str11, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14712");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("2#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0A0.1-AA479A25A001A01A1-A0010.0A0.0AA0A1-A5311A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A0011A001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14713");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14714");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 74, 276);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 74");
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14715");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 290L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14716");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 811, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 487, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, 115);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32 0 0 1" + "'", str13, "32 0 0 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14717");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 500, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 1061, 4322);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#100#-1" + "'", str13, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14718");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) 'a', (int) 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 1072, 1424);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test14719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14719");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 599, 179);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14720");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("h35-10", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14721");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14722");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35#-1#0#0" + "'", str19, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 35L + "'", long20 == 35L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test14723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14723");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#10.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test14724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14724");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4230L, 699.0f, (float) 293);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4230.0f + "'", float3 == 4230.0f);
    }

    @Test
    public void test14725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("H35#-1#0#100 0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H35#-1#0#100 0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14726");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 1, 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "354-14040" + "'", str20, "354-14040");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35#-1#0#0" + "'", str22, "35#-1#0#0");
    }

    @Test
    public void test14727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14727");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14728");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 177, (float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 177.0f + "'", float3 == 177.0f);
    }

    @Test
    public void test14729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14729");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0435.0" + "'", str6, "-1.0435.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 35.0f + "'", float7 == 35.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test14730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14730");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        java.lang.Class<?> wildcardClass19 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 -1 10 100 52 97" + "'", str18, "100 -1 10 100 52 97");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test14731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14731");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                       CLASS3[LJAVA.LANG.STRING;CLASS3[S");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14732");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 1424, 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test14733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14733");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35#-1#0#03##########################################100A10h...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14734");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            hhhhhh", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14735");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 4326, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test14736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14736");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (short) 100, (int) (short) 1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test14737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14737");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.040.040.0" + "'", str8, "-1.040.040.0");
    }

    @Test
    public void test14738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14738");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test14739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14739");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 0, 1584);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14740");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 500.0f, (double) 0L, (double) 301001111L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.01001111E8d + "'", double3 == 3.01001111E8d);
    }

    @Test
    public void test14741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1a1a001a1-a0a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1a001a1-a0a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14742");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAhi!100101001010010100101100 010100101001010010100101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAhi!100101001010010100101100 010100101001010010100101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14743");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) 'a', 10);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 694, 171);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14744");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10041L, 546.0f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test14745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14745");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4AAHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14746");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, (double) 654, (double) 74L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14747");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #4100#10010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#0010.0 0.0 0.1- #479#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14748");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0435.0" + "'", str7, "-1.0435.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0435.0" + "'", str9, "-1.0435.0");
    }

    @Test
    public void test14749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14749");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1059, 905);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test14750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14750");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35a-1a0a0" + "'", str16, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35 -1 0 0" + "'", str18, "35 -1 0 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35a-1a0a0" + "'", str20, "35a-1a0a0");
    }

    @Test
    public void test14751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14751");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14752");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10aa100.0a1a4 a10aa100.0a1a4 a10aa100.00.0 0.0 0.1-10aa100.0a1a4 a10aa100.0a1a4 a10aa100.0a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14753");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("###################################################################################################################################################################################################################################################", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test14754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14754");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 10041, 10041);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 100 -1" + "'", str8, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 100 -1" + "'", str15, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
    }

    @Test
    public void test14755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14755");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 220, (float) 179L, 155.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 155.0f + "'", float3 == 155.0f);
    }

    @Test
    public void test14756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14756");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 500, (long) 10001000);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10001000L + "'", long3 == 10001000L);
    }

    @Test
    public void test14757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14757");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 229, (float) 2433, (float) 1044);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2433.0f + "'", float3 == 2433.0f);
    }

    @Test
    public void test14758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14758");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0A0.0A0. aa4 a 35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## a.0A0.0A0. aa4", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test14759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14759");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 10001000, 1068);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 35.0f + "'", float4 == 35.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
    }

    @Test
    public void test14760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14760");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 678, 149);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 100 -1" + "'", str8, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14761");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a-1a10a100a52a97" + "'", str21, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test14762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14762");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14763");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.040.040.0" + "'", str12, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14765");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 1, (byte) 10, (byte) -1, (short) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, -1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 10 1 10 -1 1" + "'", str9, "0 10 1 10 -1 1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0410414104-141" + "'", str13, "0410414104-141");
    }

    @Test
    public void test14766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14766");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) '4', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a100a-1" + "'", str19, "10a100a-1");
    }

    @Test
    public void test14767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14767");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
    }

    @Test
    public void test14768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14768");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 0);
        byte byte29 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#100#-1" + "'", str24, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + byte29 + "' != '" + (byte) 100 + "'", byte29 == (byte) 100);
    }

    @Test
    public void test14769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14769");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 61, 0L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14770");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("35-1010100-0-0100-0-0100.0100-0-01100-0-04 Ahi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14771");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a0.0a0.0" + "'", str12, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a0.0a0.0" + "'", str14, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.040.040.0" + "'", str16, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test14772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14772");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1618, (double) 293, 1059.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 293.0d + "'", double3 == 293.0d);
    }

    @Test
    public void test14773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14773");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a#aaa ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14774");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 290L, 1066.0d, (double) 837);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1066.0d + "'", double3 == 1066.0d);
    }

    @Test
    public void test14775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14775");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                      0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14776");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 10, 0);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100.0" + "'", str22, "100.0");
    }

    @Test
    public void test14777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14777");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 199, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14778");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100#10100#10100#10100#10100#10100#10100#10100#10100#10100                                           ", 967L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 967L + "'", long2 == 967L);
    }

    @Test
    public void test14779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14779");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#-1#10#100#52#97" + "'", str18, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test14780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14780");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1584, (float) 210, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14781");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(770.0d, (double) 155L, (double) 811);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 155.0d + "'", double3 == 155.0d);
    }

    @Test
    public void test14782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14782");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a1.A.A.1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test14783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14783");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100101001010010100101001010010100101001010010100aaaaaa100-11010052974aaaaaaaa", (float) 1066);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1066.0f + "'", float2 == 1066.0f);
    }

    @Test
    public void test14784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14784");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 100 -1" + "'", str8, "10 100 -1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test14785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14785");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 35.0" + "'", str6, "-1.0 35.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0435.0" + "'", str8, "-1.0435.0");
    }

    @Test
    public void test14786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14786");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 60, (long) 243, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test14787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14787");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass15 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100404-141004141" + "'", str12, "100404-141004141");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test14788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14788");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', (int) (byte) 10, 2419);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test14789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14789");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35a-1a0a10100a-a0a-a0aa100a-a0a-a0a100.0100a-a0a-a0a1100a-a0a-a0a4 A10a100a-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14790");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100AhhhhhhhhhhH-1.0A0.0A0.00#0#1-#53", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14791");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test14792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14792");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a1.A.A.1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test14793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14793");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 10, (int) (short) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 1" + "'", str17, "100 1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
    }

    @Test
    public void test14794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14794");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) ' ', 0.0f, (float) 1042L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1042.0f + "'", float3 == 1042.0f);
    }

    @Test
    public void test14795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14795");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(528.0f, (float) 227L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 528.0f + "'", float3 == 528.0f);
    }

    @Test
    public void test14796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14796");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1004-1410410045249735-1000.0A0.0A0.1-35-1000.0                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14797");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-110135a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010######################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-110135a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010110-11010######################################################################################################################################################################################################################################################################################################################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test14798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14798");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', (int) (byte) 100, (int) (byte) 1);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 996, 808);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test14799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14799");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
    }

    @Test
    public void test14800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14800");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) (byte) 100, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100#-1#10#100#52#97" + "'", str25, "100#-1#10#100#52#97");
    }

    @Test
    public void test14801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14801");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(599, 10, 200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 599 + "'", int3 == 599);
    }

    @Test
    public void test14802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14802");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 630L, 0.0d, 546.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 10H35a-1a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 10H35a-1a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14804");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) ' ', 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 482, 0);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1072, 1061);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test14805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14805");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a1.A.A.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14806");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14807");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(". 0        .a.a.1-1a1", (double) 546L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 546.0d + "'", double2 == 546.0d);
    }

    @Test
    public void test14808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14808");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 1061, 464);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test14809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14809");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) -1, (double) 500, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test14810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14810");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10001000L, (double) 74.0f, 1.11100104E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 74.0d + "'", double3 == 74.0d);
    }

    @Test
    public void test14811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14811");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, 630);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
    }

    @Test
    public void test14812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14812");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("35-100.0A0.0A0. aa4 a a a ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test14813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14813");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a0.001aaa01a 4a1a0.001aaa01a 4a1a0.001aaa01-1.0 0.0 0.00.001aaa01a 4a1a0.001aaa01a 4a1a0.001aaa0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14814");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14815");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 808, 0.0d, (double) 1042.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14816");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1004-14104100452497" + "'", str27, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "100 -1 10 100 52 97" + "'", str29, "100 -1 10 100 52 97");
    }

    @Test
    public void test14817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14817");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) 74L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test14818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14818");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 258, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.040.040.0" + "'", str10, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14819");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 1052, 996);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1052 + "'", int3 == 1052);
    }

    @Test
    public void test14820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14820");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 10001000L, (long) 502);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14821");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 0.0 0.0" + "'", str11, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a0.0a0.0" + "'", str13, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test14822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14822");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.Class<?> wildcardClass11 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#100#-1" + "'", str10, "10#100#-1");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14823");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 100, (int) (byte) 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
    }

    @Test
    public void test14824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14824");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 10, (int) (short) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test14825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("######################################################################################################################################################################################################################################################################################################################100A1-1.0A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######################################################################################################################################################################################################################################################################################################################100A1-1.0A0.0A0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14826");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 0, (int) (short) 1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0" + "'", str17, "-1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test14827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14827");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 1, 1052);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100 -1 10 100 52 97" + "'", str24, "100 -1 10 100 52 97");
    }

    @Test
    public void test14828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14828");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test14829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14829");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 100, (int) (byte) 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 210, 1051);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 210");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test14830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14830");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test14831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14831");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4 a#0#-1#H35", (double) 3.0100112E8f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0100112E8d + "'", double2 == 3.0100112E8d);
    }

    @Test
    public void test14832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14832");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', (int) '#', 199);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test14833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14833");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test14834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14834");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 0, 220);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test14835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14835");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(4330L, (long) (byte) 1, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test14836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("925001011-0014444444444444444444444444444444444444440.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-0014444444444444444444444444444444444444440.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14837");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100a10AAAAAAAAAAAAAAAAAAAA", (float) 1051);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1051.0f + "'", float2 == 1051.0f);
    }

    @Test
    public void test14838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14838");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test14839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14839");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14840");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 100, 3883);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 0.0 0.0" + "'", str16, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a0.0a0.0" + "'", str18, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a0.0a0.0" + "'", str20, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0#0.0#0.0" + "'", str22, "-1.0#0.0#0.0");
    }

    @Test
    public void test14841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14841");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 200L, (float) 1371, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test14842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14842");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14843");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "354-14040" + "'", str14, "354-14040");
    }

    @Test
    public void test14844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14844");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal bigDecimal3 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10041");
        java.math.BigDecimal bigDecimal5 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal bigDecimal7 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100");
        java.math.BigDecimal bigDecimal9 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100");
        java.math.BigDecimal bigDecimal11 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100");
        java.math.BigDecimal[] bigDecimalArray12 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal3, bigDecimal5, bigDecimal7, bigDecimal9, bigDecimal11 };
        java.math.BigDecimal[][] bigDecimalArray13 = new java.math.BigDecimal[][] { bigDecimalArray12 };
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(bigDecimalArray13);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimal9);
        org.junit.Assert.assertNotNull(bigDecimal11);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigDecimalArray13);
    }

    @Test
    public void test14845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14845");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("##########################################################################################.0A0.0A0.#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14846");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test14847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14847");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("7920AA....                         HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14848");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test14849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14849");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '#', (int) ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100A10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100A10");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a-1" + "'", str15, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
    }

    @Test
    public void test14850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14850");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(494, 1066, 4322);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 494 + "'", int3 == 494);
    }

    @Test
    public void test14851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14851");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#1" + "'", str8, "100#1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test14852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14852");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("41004A414-414.404A404.404A404.404                4354 4-414 404 4010 100 -1Hi!1001010010100101001010010100101001010010100101004  1001010010100101001010010100101001010010100101100A1-1.0A0.0A0.", 592);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 592 + "'", int2 == 592);
    }

    @Test
    public void test14853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14853");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) '#', (int) '#');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a0.0a0.0" + "'", str12, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a0.0a0.0" + "'", str14, "-1.0a0.0a0.0");
    }

    @Test
    public void test14854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14854");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test14855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14855");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14856");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 100, 1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test14857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14857");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a a a 4aa .0A0.0A0.hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha1-a001a01a01 001a01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001a-1.0a0.0a0.004041-453 4a1a0.001a#a01");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14858");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 149, 10041);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test14859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14859");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041004-1" + "'", str13, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test14860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14860");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10041" + "'", str12, "10041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test14861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14861");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 4326, (int) '#');
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004-1" + "'", str17, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 100 + "'", byte23 == (byte) 100);
    }

    @Test
    public void test14862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14862");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test14863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14863");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35 -1 0 0" + "'", str17, "35 -1 0 0");
    }

    @Test
    public void test14864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14864");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14865");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10041" + "'", str12, "10041");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1" + "'", str14, "100 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10041" + "'", str16, "10041");
    }

    @Test
    public void test14866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14866");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 114, 1042);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 114");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test14867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14867");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35A-1A0A0.0A0.0A0. AAAAAA100#-1#10#100#52#974#AAAAAAAA3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH3HHH-HHHH       ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14868");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 699, 243);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35#-1#0#0" + "'", str16, "35#-1#0#0");
    }

    @Test
    public void test14869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a4A 41a-1.0a0.0a0.0.1 41.141. 41.1 41. 41. 1a-1.0a0.0a0.03hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100-0-0100-0-0100.0100-0-01100-0-04AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH       100a1-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4A 41a-1.0a0.0a0.0.1 41.141. 41.1 41. 41. 1a-1.0a0.0a0.03hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100-0-0100-0-0100.0100-0-01100-0-04AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH       100a1-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14870");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) '4', 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
    }

    @Test
    public void test14871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14871");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(627, 490, 1051);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1051 + "'", int3 == 1051);
    }

    @Test
    public void test14872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14872");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 10.0f + "'", float16 == 10.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0 10.0" + "'", str18, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10.0a10.0" + "'", str20, "10.0a10.0");
    }

    @Test
    public void test14873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14873");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14874");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35#-1#0#0" + "'", str13, "35#-1#0#0");
    }

    @Test
    public void test14875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14875");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1429, (float) 4326L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test14876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14876");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14877");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 4326, 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 258, 464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 258");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100#10" + "'", str7, "100#10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100410" + "'", str9, "100410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a10" + "'", str15, "100a10");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test14878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14878");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(3.01001111E8d, (double) 1.11100104E8f, (double) 114L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.01001111E8d + "'", double3 == 3.01001111E8d);
    }

    @Test
    public void test14879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHHHHHHHHHHHHHHHHHHHH1### 1###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHHHHHHHHHHHHHHHHHHHH1### 1###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14880");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test14881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14881");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (short) 10, (int) (byte) -1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 0, 0);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test14882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14882");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1068, 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a10a100a52a97" + "'", str15, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test14883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14883");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) '4', (-1));
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 100, (int) (byte) 0);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test14884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14884");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 655, 490.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test14885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14885");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.040.040.0" + "'", str10, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a0.0a0.0" + "'", str15, "-1.0a0.0a0.0");
    }

    @Test
    public void test14886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14886");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1072L, (float) 770L, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test14887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14887");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                               100#1                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14888");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 557);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 557 + "'", int2 == 557);
    }

    @Test
    public void test14889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14889");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                              35-100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14890");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10001000, (double) 0L, (double) 290.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test14891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14891");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("i!A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.A1.A.A.035#-1#0#035#-1#0#035#-1#0#0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14892");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test14893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14893");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 04 404 414-4 4534                404.404A404.404A404.414-414a40014");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14894");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 227L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 227.0d + "'", double2 == 227.0d);
    }

    @Test
    public void test14895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14895");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14896");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 0.0 0.11                    0.0 ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14897");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14898");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 2419, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14900");
        short[] shortArray6 = new short[] { (byte) 10, (byte) -1, (byte) 100, (short) 1, (short) 100, (byte) -1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 727, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 100, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test14901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14901");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 4444444444444444444444444444444444444444444", (float) 243);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 243.0f + "'", float2 == 243.0f);
    }

    @Test
    public void test14902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14902");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a 4a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14903");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1082, 1071, 3867);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3867 + "'", int3 == 3867);
    }

    @Test
    public void test14904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14904");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32 0 0 1" + "'", str9, "32 0 0 1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test14905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14905");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#-1#10#100#52#97" + "'", str17, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test14906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14906");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 4330, 1042);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 10" + "'", str6, "100 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a10" + "'", str8, "100a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test14907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14907");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("  #  3      #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               # ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14908");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.04#0#1-#53");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.040.1-4#479#25#001#01#1-#0010.040.04#0#1-#53\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14909");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) ' ', 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100 -1 10 100 52 97" + "'", str23, "100 -1 10 100 52 97");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100#-1#10#100#52#97" + "'", str27, "100#-1#10#100#52#97");
    }

    @Test
    public void test14910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14910");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0.0 44444444444444444444444444444444444444444444", (double) 492);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 492.0d + "'", double2 == 492.0d);
    }

    @Test
    public void test14911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14911");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("40-0-00110-0-0010.0010-0-0010-0-001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14912");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(120, 464, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14913");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a-1" + "'", str8, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test14914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14914");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (short) 100, (double) 482);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 482.0d + "'", double3 == 482.0d);
    }

    @Test
    public void test14915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14915");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("H35#-1#0#100 0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a                                                                                     1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001010011-4001401100a135#-1                                                                                    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test14916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14916");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35a-1a0a0.0a0.0a0. aaaaaa100#-1#10#100#52#974#aaaaaaaa3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh3hhh-hhhh       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14917");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#-1#10#100#52#97" + "'", str18, "100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100a-1a10a100a52a97" + "'", str23, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100a-1a10a100a52a97" + "'", str25, "100a-1a10a100a52a97");
    }

    @Test
    public void test14918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14918");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 114, (int) (short) 0);
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 0.0 0.0" + "'", str16, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1.040.040.0" + "'", str25, "-1.040.040.0");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1.0 0.0 0.0" + "'", str27, "-1.0 0.0 0.0");
    }

    @Test
    public void test14919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14919");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a#479#25#001#01#1-#001", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test14920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14920");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 10100L, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10100.0f + "'", float3 == 10100.0f);
    }

    @Test
    public void test14921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14921");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14922");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 694, (long) 10041, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14923");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("301001111     100a1-1.0A0.0A0.0       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"301001111     100a1-1.0A0.0A0.0       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14924");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AA4 A A A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14925");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test14926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14926");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (short) 10, (int) (byte) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 1044, (int) '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test14927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14927");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, 1618.0d, (double) 1072L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1618.0d + "'", double3 == 1618.0d);
    }

    @Test
    public void test14928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14928");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("00101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01010010a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("01 001 1 001 001 01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 001 1 001 001 01\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14930");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1039, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test14931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14931");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 10001000L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0001E7f + "'", float2 == 1.0001E7f);
    }

    @Test
    public void test14932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14932");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(546.0d, (double) 293, (double) 1082);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1082.0d + "'", double3 == 1082.0d);
    }

    @Test
    public void test14933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14933");
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
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
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
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a0.0a0.0" + "'", str19, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test14934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14934");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0" + "'", str17, "100.0");
    }

    @Test
    public void test14935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14935");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 1052, 811);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test14936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14936");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(630L, (long) '#', 627L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 630L + "'", long3 == 630L);
    }

    @Test
    public void test14937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14937");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), (float) 1072, 905.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1072.0f + "'", float3 == 1072.0f);
    }

    @Test
    public void test14938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14938");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("79#25#001#01#1-#001a1.A.A.a#479#25#0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14939");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                          AAAAA                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14940");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#100#-1#10#100#52#974#101001010010100101001010010100101001010010100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14941");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0H0.0H0.0100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          -1#-1-1#-1-1#-1-14aa1111111111111111111111111111111111111111111aa-1a1a1a11111111111111111111111111111111111111111", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test14942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14942");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.a.a.A1.a.a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.a.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14943");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14944");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4322, 3867, 310);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 310 + "'", int3 == 310);
    }

    @Test
    public void test14945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14945");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test14946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14946");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 114, (int) (short) 1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test14947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14947");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test14948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14948");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("H35#-1#0#100 0.0A0.0A0.1-a1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010H35#-1#0#100 0.0A0.0A0.1-a1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14949");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0.h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0.h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14950");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 60, 0);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test14951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14951");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3867, (long) 149, (long) 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3867L + "'", long3 == 3867L);
    }

    @Test
    public void test14952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14952");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 0, 2100);
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test14953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14953");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0A0.0A0.1-1a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-1a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14954");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("111100103                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14955");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!1001010010100101001010010100101001010010100101004 A1001010010100101001010010100101001010010100101HI!1001010010100101001010010100101001010010100101004 A1001010010100101001010010100101001010010100101###################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14956");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 111100103, 132);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 -1 -1 -1 1" + "'", str12, "0 -1 -1 -1 1");
    }

    @Test
    public void test14957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14957");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10041" + "'", str12, "10041");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test14958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14958");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 293, 179L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test14959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14959");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ", 557);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 557 + "'", int2 == 557);
    }

    @Test
    public void test14960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14960");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2419, 0, 177);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test14961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14961");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35a-1a0a0" + "'", str15, "35a-1a0a0");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 35L + "'", long18 == 35L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 35L + "'", long19 == 35L);
    }

    @Test
    public void test14962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14962");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.00.0-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14963");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("###########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################AA hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test14964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14964");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test14965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14965");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14966");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(258, 1068, 654);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 258 + "'", int3 == 258);
    }

    @Test
    public void test14967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                  4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                  4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14968");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100404-141004141" + "'", str12, "100404-141004141");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test14969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14969");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test14970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14970");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("41004A414-414.404A404.404A404.404                4354 4-414 404 4010 100 -1Hi!1001010010100101001010010100101001010010100101004  1001010010100101001010010100101001010010100101100A1-1.0A0.0A0.", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test14971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14971");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 1061, 155);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 0 -1 100 1 1" + "'", str19, "100 0 -1 100 1 1");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test14972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14972");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0a.a0aaa0a.a0aaa0a.a1a-aaa100101001010010100101100#100#-1#10#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a.a0aaa0a.a0aaa0a.a1a-aaa100101001010010100101100#100#-1#10#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14973");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(494, 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 494 + "'", int3 == 494);
    }

    @Test
    public void test14974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14974");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (short) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 699, 1059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test14975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14975");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(115, 4330, 599);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4330 + "'", int3 == 4330);
    }

    @Test
    public void test14976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14976");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 592, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 592 + "'", int3 == 592);
    }

    @Test
    public void test14977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14977");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) 1.00110096E8f, 74.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.00110096E8d + "'", double3 == 1.00110096E8d);
    }

    @Test
    public void test14978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14978");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal[] bigDecimalArray2 = new java.math.BigDecimal[] { bigDecimal1 };
        java.math.BigDecimal bigDecimal4 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal[] bigDecimalArray5 = new java.math.BigDecimal[] { bigDecimal4 };
        java.math.BigDecimal bigDecimal7 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal[] bigDecimalArray8 = new java.math.BigDecimal[] { bigDecimal7 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        java.math.BigDecimal[] bigDecimalArray11 = new java.math.BigDecimal[] { bigDecimal10 };
        java.math.BigDecimal[][] bigDecimalArray12 = new java.math.BigDecimal[][] { bigDecimalArray2, bigDecimalArray5, bigDecimalArray8, bigDecimalArray11 };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(bigDecimalArray12);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimalArray2);
        org.junit.Assert.assertNotNull(bigDecimal4);
        org.junit.Assert.assertNotNull(bigDecimalArray5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimalArray8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimalArray11);
        org.junit.Assert.assertNotNull(bigDecimalArray12);
    }

    @Test
    public void test14979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14979");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                    925001011-00110#100#-11.0 0.01004-14104100452497");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                     925001011-00110#100#-11.0 0.01004-14104100452497");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1041004-1" + "'", str6, "1041004-1");
    }

    @Test
    public void test14980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                             35#-1#0#03                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#03\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14981");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#1#0#10#0#1", (float) 153);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 153.0f + "'", float2 == 153.0f);
    }

    @Test
    public void test14982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14982");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a1-a001a01a01 001a010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14983");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 996);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 996 + "'", int2 == 996);
    }

    @Test
    public void test14984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14984");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                        ##########################################100A10h...                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test14985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14985");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 229, 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#1" + "'", str8, "100#1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
    }

    @Test
    public void test14986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14986");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0#0.0#0.0" + "'", str18, "-1.0#0.0#0.0");
    }

    @Test
    public void test14987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14987");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a1.A.A.1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1.A.A.1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14988");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a10#100#-1h35#-1#0#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14989");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14990");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                         ....AA0297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                         ....AA0297\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test14991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14991");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101", 10041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10041 + "'", int2 == 10041);
    }

    @Test
    public void test14992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14992");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 100 -1" + "'", str10, "10 100 -1");
    }

    @Test
    public void test14993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14993");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.1100 10-100 104001401444435#-1#0#00.0A0.0A0.1-4444444 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test14994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14994");
        long[] longArray1 = new long[] { (short) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test14995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14995");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 276);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 276L + "'", long2 == 276L);
    }

    @Test
    public void test14996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14996");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("################################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test14997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14997");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" a.0a0.0a0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test14998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14998");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 494, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test14999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14999");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 A#0#-...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test15000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test15000");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(4230L, (long) (-1), (long) 634);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4230L + "'", long3 == 4230L);
    }
}

