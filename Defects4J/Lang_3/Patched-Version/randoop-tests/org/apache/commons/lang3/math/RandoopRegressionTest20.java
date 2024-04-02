package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest20 {

    public static boolean debug = false;

    @Test
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10001");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 381, (long) (byte) 0, (long) 139);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10002");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                   ###-1.0#-1.0#-1.0#32.0#100.0#-1                                   ##########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10003");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 458, 189);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10004");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3240452" + "'", str12, "3240452");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32a0a52" + "'", str14, "32a0a52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10005");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(318.0d, (double) 1286L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10006");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0A1.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10007");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       0.1-#0.001#0.23#0.1-#0.1-#0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10008");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 906L, (float) 139, (float) 250L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 906.0f + "'", float3 == 906.0f);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10009");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 126L, (float) 361, (float) 915L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 915.0f + "'", float3 == 915.0f);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#.#0#a#1#.#0#a#-#1#.#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#.#0#a#1#.#0#a#-#1#.#0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10011");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str13, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str15, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10012");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10013");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "                                                                                                                                   ...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                    ...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10014");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(835.0d, (double) (-1L), 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 835.0d + "'", double3 == 835.0d);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10015");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                         -1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10016");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray1, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0" + "'", str5, "100.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10017");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 332, 1504);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10018");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#################################################################################", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10019");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1001, 844);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 88, 334);
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
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #  - # #- ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #   . #- 52 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                   - . #- . #- . #32. #   . #- .   - . #- . #- . #32. #  - # #- \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10021");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0a1.0a-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10022");
        long[] longArray1 = new long[] { 137 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[137]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 137L + "'", long3 == 137L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 137L + "'", long4 == 137L);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10023");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 10, (int) (short) 0);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10024");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, (int) (byte) -1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 628, 471);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10025");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10026");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041410414100" + "'", str8, "1041410414100");
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10027");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 361, 162);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str21, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10028");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#1 1 0 97#a1.0a-1.0-14324045241041000-143240452410410-14324045241041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10029");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                                                                                                           1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10030");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(250.0d, 136.0d, (double) 92L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 250.0d + "'", double3 == 250.0d);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10031");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(548, 673, 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 342 + "'", int3 == 342);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10032");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 0, 583);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 1" + "'", str11, "0 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "041" + "'", str13, "041");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10033");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '4', (int) 'a', (int) (short) 1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10034");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 1" + "'", str11, "10 1");
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10035");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 457L, (double) 367, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 457.0d + "'", double3 == 457.0d);
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10036");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#0#52" + "'", str8, "32#0#52");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10038");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 378, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 262, 504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 262");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa7925.0#.0#.0##0#.0#10 1 10 1 100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa7925.0#.0#.0##0#.0#10 1 10 1 100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0 97#a1.0a-1.0#1 1 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10040");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Hi#!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi#!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10042");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) 'a', 92);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "  -1.0#-1.0#-1.0#32.0#100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:   -1.0#-1.0#-1.0#32.0#100.0#-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#10#1#100" + "'", str15, "10#1#10#1#100");
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10043");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10044");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10045");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.-1.00. -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10046");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 1, 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10047");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.Class<?> wildcardClass10 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10048");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10049");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.04-1.04-1.0432.04100.04-1.0" + "'", str18, "-1.04-1.04-1.0432.04100.04-1.0");
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10050");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1 -1.0#-1.0#-1.0#32.0#100.0#-1.0 -1.0#-1.0#-1.0#32.0#100.0#-1.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#3");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10051");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10052");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 550, (double) 673, 92.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 673.0d + "'", double3 == 673.0d);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0 -1.0 1.0 -1.0 1.0 1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10054");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10055");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A0A52A10A", 222L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 222L + "'", long2 == 222L);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10056");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(550, 0, 457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10057");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.#####################################################10A1A10A1A100", 172.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 172.0d + "'", double2 == 172.0d);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10058");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 4596, 249);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1385, 1365);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "041" + "'", str5, "041");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10059");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1a32a0a52a10a10" + "'", str14, "-1a32a0a52a10a10");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10060");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 0, (-1));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) 'a', 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10061");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 192, (int) ' ');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 895, 361);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10062");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a1" + "'", str9, "0a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0a1" + "'", str11, "0a1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10063");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 484, (long) 483, (long) (short) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 484L + "'", long3 == 484L);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10064");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 904, (double) 101, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 904.0d + "'", double3 == 904.0d);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 a4a4a4 4444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 a4a4a4 4444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 99279 79 2579 2579 25444 2579 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10066");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 507, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10" + "'", str18, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10067");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 1, 292);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10 1" + "'", str24, "10 1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 10 + "'", byte25 == (byte) 10);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10068");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240452" + "'", str8, "3240452");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10069");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (short) 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 381, 348);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10070");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("32#0#52######################################################################################################################################################################################################################################################################################################################################################################", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10071");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                       A A-1.0#-1.0#AAA11097-1.0#-1.0#                                                                                                                                                                                                                                                                                                                                                                                                                      ", 188L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 188L + "'", long2 == 188L);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10072");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10073");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 7925, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10074");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 188, 137);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 378, (int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a1a10a1a100" + "'", str8, "10a1a10a1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a10a1a100" + "'", str14, "10a1a10a1a100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10075");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10076");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10077");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 7925, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10078");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 147);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 147.0d + "'", double2 == 147.0d);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10079");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1#.#0#A#1#.#0#A#-#1#.#0                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10080");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 7925);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 7925 + "'", short3 == (short) 7925);
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10081");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 127, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 222, 2450);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 222");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10082");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 458, 411);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10083");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10084");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                            -143240452410410                                                                                                         .1-#0.001#0.23#0.1-#0.1-#0.1-4440.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-44400140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-444140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-4441.1-#0.001#0.23#0.1-#0.1-#0.1-444-.1-#0.001#0.23#0.1-#0.1-#0.1-44440.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-444140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-44400140.1-#0.001#0.23#0.1-#0.1-#0.1-444..1-#0.001#0.23#0.1-#0.1-#0.1-4440AA A#A#AAAAAA A#A#.0A0.01A0.1A0.001A A#A#AAAAAA A#A#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10085");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#1000    A A97.0#100.0#3.2101101E9#35.0-1.0#-1.0#-1.0#32.0#100.0#-1.    A A A1    A A A.    A A A01    A A A.    A A A0100    A A A.    A A A0    A A A.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10086");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray1, ' ');
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0.0" + "'", str4, "0.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10087");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1495, 365.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10088");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1" + "'", str13, "10#1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a1" + "'", str15, "10a1");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10089");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 188.0f, (double) 0L, (double) 196.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa7925######    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa7925######    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10091");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("001792", (short) 7925);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1792 + "'", short2 == (short) 1792);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10092");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 101, 93);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10093");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 322, (double) 1365.0f, (double) 312);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1365.0d + "'", double3 == 1365.0d);
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10094");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(251, 572, 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 572 + "'", int3 == 572);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10095");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10096");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32a0a52" + "'", str15, "32a0a52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32 0 52" + "'", str17, "32 0 52");
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10097");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 7925, (long) 484);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 7925L + "'", long3 == 7925L);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10098");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi97.04100.043.21041101E9435.0!32A0A5204 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A044 4 A A A-4 4 A A A14 4 A A A.4 4 A A A0414 4 A A A.4 4 A A A041004 4 A A A.4 4 A A A04 4 A A A           444-1.0#-1                      444-1.0#-1                      444-1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a11-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a100a0a1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551-1.54-1.54-1.5444.54155.54-1.44445.1-45.55-1a1a                                                                                                                                       #-1.0#1.0a1.0a-1.0                                                                                                                                        -1#1#-1", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10099");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 906, 185);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str16, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1A32A0A52A10A10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A32A0A52A10A10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4 444                 444                  4   444        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               4 444                 444                  4   444         is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444443240452");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444443240452\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10103");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0 a a a a a a aa a a a a000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10104");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 134, 509);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 134");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 1" + "'", str18, "10 1");
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10105");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                   444-1.0#-1.0#-1.0#32.0#100.0#-1                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10106");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                    .0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.########################################################################aaaaaaaaaaaa#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.########################################################################aaaaaaaaaaaa#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.#-1.a#-1a#-10#-1.0#-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10108");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) ' ', (-1));
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10109");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10110");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10111");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#1 1 0 97#A1.0A-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10112");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("14140497");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10113");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 192, (int) ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "3240452" + "'", str22, "3240452");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10114");
        double[] doubleArray3 = new double[] { 1, 1L, (-1L) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 361, 469);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 361");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0a1.0a-1.0" + "'", str5, "1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10115");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "3240452" + "'", str16, "3240452");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10116");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10117");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                              44444444444410#10#-1444444444444                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444410#10#-1444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10118");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0100...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10119");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97.04100.043.21041101E9435");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10120");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10121");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100" + "'", str9, "100");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10122");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("           444-1.0#-1           -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10123");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) -1, (int) (short) -1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 484, 158);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "3240452" + "'", str18, "3240452");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10124");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10125");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 51, (long) 368, (long) 700);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 700L + "'", long3 == 700L);
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10126");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 1 + "'", byte4 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1#1#-1" + "'", str6, "-1#1#-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1 -1" + "'", str8, "-1 1 -1");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10127");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 904);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 904 + "'", int2 == 904);
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10128");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10129");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 0, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 162, (int) (short) 32);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 196, 0);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str10, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str21, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 100.0f + "'", float22 == 100.0f);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10130");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#-1.0#32.0#100.0#-1.#######################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10131");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10132");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10133");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 17925, 895);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-143240452410410" + "'", str14, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10134");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a1" + "'", str13, "10a1");
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(185L, 198L, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 93L + "'", long3 == 93L);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a                                                                                          a                                                                                       a4a4a4 4444################################3205                                                                                                                                                                                          #-1.0#1.0a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a                                                                                          a                                                                                       a4a4a4 4444################################3205                                                                                                                                                                                          #-1.0#1.0a1.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10137");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                     100.0#-1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10138");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10139");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 380, 1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10140");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0#1" + "'", str5, "0#1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10141");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 10, (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1 100 0" + "'", str11, "1 100 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1410040" + "'", str13, "1410040");
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10142");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1103, (long) 657, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("7925.0#.0#.0##0#.0#10 1 10 1 100                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7925.0#.0#.0##0#.0#10 1 10 1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10144");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str12, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10145");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10146");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#100.0#-1.###0.1-0.0010.2301041#1 1 0 97#1041#1 132101523212-12-1-001-0132                           1041#1 1 0 97#1041#1 1 -1.0#-1.0#-1.0#32.0#100.0#-1.###0.1-0.0010.230", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10147");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#32.0#100.0#-1.-1.", (short) 1792);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1792 + "'", short2 == (short) 1792);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10148");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0#1" + "'", str9, "0#1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "041" + "'", str11, "041");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1" + "'", str13, "0#1");
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10149");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 196, 196);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 309, 457);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 309");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32a0a52" + "'", str16, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "3240452" + "'", str24, "3240452");
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44AA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10151");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 915, 198);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10152");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                             ...", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10153");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10154");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 378, 240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 378 + "'", int3 == 378);
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10155");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0#-1.0#aaa14140497-1.0#-1.0#1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10156");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) 'a', 92);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1041410414100" + "'", str16, "1041410414100");
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10157");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 507, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10158");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a32a0a52a10a10 9752 97 97299 9752 32-1a32a0a52a10a10 9752 97 97299 9752 32-1a32a0a52a10a-1-..-1111      a a a#####################################################################################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10159");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 342.0f, 365.0d, (double) 93);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10160");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1-#0....aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1. -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", 134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134 + "'", int2 == 134);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10161");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 93, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 844, (int) '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10" + "'", str20, "10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10" + "'", str22, "10");
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10162");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 515, 222);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 80, 261);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0A1.0A-1.052 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0A1.0A-1.052 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10165");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str7, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10166");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1.0a1.0a-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10167");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 673, 588);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 88, 230);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10168");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1 -1.0#-1.0#-1.0#32.0#100.0#-1.0 -1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10169");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0#.0#.0##0#.0#", 457L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 457L + "'", long2 == 457L);
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10170");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10171");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) (short) 100, 0);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.Class<?> wildcardClass16 = longArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10172");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(364, 222, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 364 + "'", int3 == 364);
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10173");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("32#0#5                                                                                                                                                                                                                                                                 .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10174");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(195L, (long) (short) 10, (long) 381);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 381L + "'", long3 == 381L);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10175");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 100.0f + "'", float18 == 100.0f);
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10176");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1.0#-1.0#32.0#100.0#-1.####...", (double) 250.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 250.0d + "'", double2 == 250.0d);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10177");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444.1-30.00130.2330.1-30.1-30.1-444.02.02-.44444444444444444444444444444444444444444444444444444444444444444444444.1-40.00140.2340.1-40.1-40.1-44444.1-40.00140.2340.1-40.1-40.1--1.04-1.04-1.0432.04100.04-1.04444.1-40.00140.2340.1-40.1-40.1-44444444444444444444444444444444444444444444444444444444444444444444444.1-40.00140.2340.1-40.1-40.1-44444.1-40.00140.2340.1-40.1-40.1--1.04-1.04-1.0432.04100.04-1.04444.1-40.00140.234");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10178");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32#0#5", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10179");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 507, 137);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97.0 100.0 3.21041101E9 35.0" + "'", str13, "97.0 100.0 3.21041101E9 35.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 3.21041101E9f + "'", float14 == 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 3.21041101E9f + "'", float15 == 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 35.0f + "'", float16 == 35.0f);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10180");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(345, 378, 298);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 378 + "'", int3 == 378);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10181");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 361, 192);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10182");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32a0a52" + "'", str8, "32a0a52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32a0a52" + "'", str10, "32a0a52");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10183");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10184");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 4596, 134);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str12, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str14, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10185");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 507, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32#0#52" + "'", str19, "32#0#52");
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10186");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444-1.0#-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10187");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1--143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410-1.0#-1.0#1.0A1.0A-1.0-143240452410410", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10188");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '#', 10, 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '#');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0" + "'", str8, "100.0");
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10189");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str11, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str17, "0.0#100.0#1.0#-1.0#1.0#100.0");
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444529752975297972999752-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444529752975297972999752-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10191");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(230, 588, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10192");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0A1.0A10.0A0.AAAAAAAAAAAAAAAAAA1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ", (double) 606L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 606.0d + "'", double2 == 606.0d);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10193");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10194");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0 a a a a a a aa a a a a000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0 a a a a a a aa a a a a000000000000000000000000000000000000000000000000000000000000000000000000-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0-1.0#-1.0#1.0a1.0a-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#1" + "'", str12, "10#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 1 + "'", byte15 == (byte) 1);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10195");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# #4#4", (double) 196L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 196.0d + "'", double2 == 196.0d);
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0#-1.0100.0#-1.0-1.0#-1.0#-1.0#32.0#100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##32#0#54444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441.0a1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##32#0#54444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441.0a1.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10198");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1a0a001a1a1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10199");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', 7925, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) '#', 1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10200");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-....-....AA-.-.-.3..-.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10201");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#4#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10203");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 507, (int) (byte) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 378, (int) (short) -1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1" + "'", str14, "10a1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10 1" + "'", str20, "10 1");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1041" + "'", str23, "1041");
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10204");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 101, (int) (short) 32);
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32a-1a-1a100a10a32" + "'", str11, "32a-1a-1a100a10a32");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32#-1#-1#100#10#32" + "'", str13, "32#-1#-1#100#10#32");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32#-1#-1#100#10#32" + "'", str15, "32#-1#-1#100#10#32");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10205");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("9797299975232-1.0#32.0#100.0#-1.#######################################################################                                                                                                                                   ", 835);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 835 + "'", int2 == 835);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10206");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, 195);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, (int) ' ');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10207");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 137, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double21 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str20, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10208");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################################################04.4041004.40414.4044-414.4.0a.0a-.##################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10209");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10210");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
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
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10211");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("32#0#52#-1.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10212");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                        -1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10213");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(361, (int) '#', 1495);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1495 + "'", int3 == 1495);
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10214");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 105, 92);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32#-1#-1#100#10#32" + "'", str18, "32#-1#-1#100#10#32");
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10215");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 1504, 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10216");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".04.04.044.04.04.04444-1.0a-1.0a-1.0a32.0a100.0a-1.44444444444444444444444444444444444444444444444444444444444444444.04.04.044.04.04.044", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10217");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444                                                                                                                                                                                                                                                ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10218");
        int[] intArray3 = new int[] { 'a', ' ', (byte) -1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', (int) (short) 100, (int) 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 844, 509);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[97, 32, -1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97#32#-1" + "'", str15, "97#32#-1");
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10219");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) 'a', 92);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 105, (int) '4');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10220");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) (short) 1792);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1792L + "'", long2 == 1792L);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10222");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#', 583, 0);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a');
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a0a0a0" + "'", str13, "1a0a0a0");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10223");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a1.0a-1.0#-1.0#                                                                                                                                                                                 ", 365);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 365 + "'", int2 == 365);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10224");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 108, 230);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str7, "100.0#1.0#10.0#0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10225");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str15, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10226");
        int[] intArray2 = new int[] { 'a', (byte) 1 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 248, (int) (short) 100);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10227");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 951, 548);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10228");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aa0.10a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a0.01a0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.01a0.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".#.40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".#.40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10231");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                           1041#1 1 0 97#1041#1 132101523212-12-1-001-0132                           1041#1 1 0 97#1041#1 1                             ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa1 1 0 97100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa1 1 0 97100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0    A A97.0#100.0#3.2101101E9#35.0-1.0#-1.0#-1.0#32.0#100.0#-1.    A A A1    A A A.    A A A01    A A A.    A A A0100    A A A.    A A A0    A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0    A A97.0#100.0#3.2101101E9#35.0-1.0#-1.0#-1.0#32.0#100.0#-1.    A A A1    A A A.    A A A01    A A A.    A A A0100    A A A.    A A A0    A A A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10234");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-1.0#32.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10235");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23...1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23..0.#-1.0#0.                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 457);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 457.0f + "'", float2 == 457.0f);
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10236");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10237");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 665, 422);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10238");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 196, 10);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10239");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", 332);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 332 + "'", int2 == 332);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10240");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                 ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10241");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a a 4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10242");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10243");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("h");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10244");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10245");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10246");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) (-1L), (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10247");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, 1L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10248");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10249");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10251");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10252");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10253");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10255");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a0.0a0.0", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10256");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10257");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, 10.0d, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10258");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10259");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10260");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10261");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10262");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("h");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10263");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10264");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44a", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10265");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0A0.0A0.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10268");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10269");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10270");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10271");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10272");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', (double) '#', (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10274");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass13 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10275");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10276");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10277");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 10L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10278");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10279");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10280");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10282");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass9 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10284");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#0", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10286");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10288");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10289");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10291");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10L, (float) 100L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35#-1#0# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10293");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 1, (float) (byte) -1, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10294");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4#a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10295");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10296");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (-1), (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10297");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10298");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10299");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10300");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10301");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10302");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', 1.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10303");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10304");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10305");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10306");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("h35#-1#0#", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10307");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10308");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) (short) 0, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10309");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, (long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10310");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100a1-1.0A0.0A0.0", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10311");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, 100.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10312");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) (byte) -1, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10314");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#100#-1", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10315");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#10#100#52#97", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10316");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("354-14040");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10317");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10318");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("h", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10321");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1, (double) 0.0f, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10322");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1-4001401", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4 a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0 0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 0.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10325");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#00.0A0.0A0.1-", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 0L, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10327");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10328");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', 0L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10329");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10330");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10331");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10332");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, (double) (byte) 0, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10334");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1L), 1.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("H35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: H35#-1#0# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1.A.A.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10337");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), (double) ' ', (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10338");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, 100.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10339");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#100#-1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10340");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) 'a', (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10341");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#10#100#52#97", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10343");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10344");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10345");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10346");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("h35#-1#0#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10347");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10348");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10350");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a0.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10352");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) 0, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10354");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10355");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(100.0d, 0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10356");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10357");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10358");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35#-1#0#00.0A0.0A0.1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10359");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10360");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10361");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10362");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10363");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10364");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10365");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10366");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0a0.0a0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10367");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10368");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "0.0a0.0a0.1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0a0.0a0.1-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10369");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10370");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10371");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("h35#-1#0#", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10372");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', (long) 0, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10373");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10374");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10375");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), 0L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10376");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100 10", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10377");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10378");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10379");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10380");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#1", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10381");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10382");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("35#-1#0#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10383");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, (-1), 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10384");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1041004-1", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10385");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10386");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 0.0 0.0-1.0A0.0A0.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10387");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "100#-#0#-#0#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100#-#0#-#0#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10388");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10389");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10390");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10391");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("7925001011-001", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10392");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10393");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1L, (float) 1, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10394");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, (double) (short) 0, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10395");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-#0#-#0#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10396");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10397");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10398");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("79#25#001#01#1-#001a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10399");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10400");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10402");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10403");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '4', (double) ' ', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10404");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 -1.0", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10405");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100#-#0#-#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0 .14 .14 1.14 .141.14 1.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10407");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) (short) -1, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10408");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) ' ', (double) 0.0f, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10409");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 0.0 0.0-1.0A0.0A0.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10411");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("7925001011-001");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10412");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10413");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("7925001...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10414");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10415");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10416");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (long) (short) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10417");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, (float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10418");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10419");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10420");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                          100a0a-1a100a1a1                                          ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10421");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, (double) 100L, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10423");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10424");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10 100 -1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10425");
        short[] shortArray6 = new short[] { (byte) 10, (byte) -1, (byte) 100, (short) 1, (short) 100, (byte) -1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 100, 1, 100, -1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10426");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', (float) 0, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10427");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10428");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10429");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10430");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10431");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10432");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10433");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10434");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10435");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10436");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10437");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, (int) (byte) -1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10438");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10439");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray0, '#');
        // The following exception was thrown during execution in test generation
        try {
            long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10440");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100 1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10441");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 #");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10442");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1-4001401100a135#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-4001401100a135#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10444");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, 0L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10445");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("          100a1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10446");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10447");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, (double) 1L, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10448");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0A0.0A0.0100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A0.0A0.0100 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10449");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4 a.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10450");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10451");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) (byte) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10452");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#100#-11.0 0.0 0.0-1.0A0.0A0.0", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10453");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10454");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10455");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 #                             ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10456");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35 -1 0 0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10457");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("925001011-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10458");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10459");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("35 -1 0 0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10460");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4#a", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10461");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a1.A.A.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10462");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10463");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + Float.POSITIVE_INFINITY + "'", float1 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10464");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4 a.0A0.0A0.", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10465");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100a135#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10466");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, (float) (short) 100, (float) 10L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10467");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.Class<?> wildcardClass10 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10468");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10469");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10470");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) (byte) 0, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10471");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0.0A0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10472");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10473");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4 #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10474");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10476");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10477");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10478");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10479");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10L, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10480");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10481");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10482");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("354-14040", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10483");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (byte) 0, 10);
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
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10484");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10485");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10486");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) (short) 1, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10487");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10488");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0 0.0 0.0-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10489");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10490");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#-#0#-#0#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10491");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10492");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100a-1a10a100a52a97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10493");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("7925001...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10494");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10495");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4A", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10496");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (short) 10, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10497");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4 #", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10498");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (-1.0d), (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10499");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444435#-1#0#00.0A0.0A0.1-444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

