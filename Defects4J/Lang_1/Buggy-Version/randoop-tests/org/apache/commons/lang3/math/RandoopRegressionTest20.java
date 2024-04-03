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
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#4#44                                                                                             #AAA#AA410041104-14100410041104-14100410041104-141004100411HI!HI!HI!HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!", 1749);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1749 + "'", int2 == 1749);
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10002");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 2691, 93);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1" + "'", str8, "10#-1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1" + "'", str11, "10a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10003");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 3072, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10004");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#AAA#AA0.0A-1.0A10.0A100.0A0.0.1-#0.0010.1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10005");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("# #   A104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!a#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iH!ihaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10006");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1                  #100#100#-1#1                  hi!                  10#100#100#-1#1                  hi!aaaaaaa                  10#100#100#-1#1                                    10#100#100#-1#hi!                  10                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 14-1.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10007");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10008");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("!!!!i!hhi!hi!hi!Hi!hi!hi!hi!Hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10009");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (double) 554);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 554.0d + "'", double2 == 554.0d);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10010");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10011");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1" + "'", str21, "1");
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10012");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-141410041004104100" + "'", str12, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10013");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str15, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10014");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 129, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 353, 4780);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 353");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10015");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 1 100 100 10 100                                                                                             .0 -1.                                                                                             .0 -1.                                                                                             .0 -1.                                                                                             .0 -1.                                                                                             .0 -1.      ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10016");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("class [B4class [Ljava.lang.String;4class [D", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10017");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10018");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1749, 150, 1852);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 150 + "'", int3 == 150);
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!aaaaaaahi!.0A100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!aaaaaaahi!.0A100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10020");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1857L, 220.0f, 3072.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3072.0f + "'", float3 == 3072.0f);
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10021");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (-140), (long) 264, 1852L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-140L) + "'", long3 == (-140L));
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10022");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10023");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#4#44a                       ...", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10024");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1662, 370);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str19, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10025");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 382, 0);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 -1" + "'", str8, "10 -1");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10026");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 100 100" + "'", str12, "0 100 100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10027");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10028");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10029");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 520, (int) (byte) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1" + "'", str20, "10#-1");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10030");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1.04100.01.041                                                                                             #AAA#AA1.04100.01.0410                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10031");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10032");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10033");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 73, 615L, (long) 415);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 73L + "'", long3 == 73L);
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10034");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("!IH!IH!IH 1#001#001#1-#01 1#001#001#1-#01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1hi!hi!hi!                  10-11001001                                     10-11001001     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1hi!hi!hi!                  10-11001001                                     10-11001001     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10036");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("265.0#99.0#131.0#1662.0#129.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10037");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3067, 778.0d, (double) 4440L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4440.0d + "'", double3 == 4440.0d);
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1852, (double) 570, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10039");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a-1a100a100a1" + "'", str10, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10040");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) 1, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10041");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: .0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10043");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "10 10 0 -1 100                                                                                                                                                                                                                                                                                                                                                                                        10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10 10 0 -1 100                                                                                                                                                                                                                                                                                                                                                                                        10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10044");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1749, 530, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10045");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 0HI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAAA4AAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10046");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 3068, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 340, 122);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10047");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10048");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10049");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(507, 300, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10050");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 4393, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 129, (int) (short) 100);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1" + "'", str23, "1");
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10051");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#-1#100#100#1" + "'", str18, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10052");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!aaaaaaahi!", (double) 716.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 716.0d + "'", double2 == 716.0d);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10053");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) 778);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E130d + "'", double2 == 4.444444444444444E130d);
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10054");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                HI!HI!HI!HI!H## HI!HI!HI!HI!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10055");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!a                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10056");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100 0 1 1 0 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 0 1 1 0 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10057");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 2703, (int) (short) 0);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10058");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 176, (int) '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', (int) (short) 10, 539);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 -1 1 100 0" + "'", str15, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10059");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 615, 419);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      # #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      # #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10061");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
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
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10062");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10063");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(370, 0, 459);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10064");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.04100.01.041                                                                                             #aaa#aa1.04100.01.041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10066");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (short) 100, 231);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10067");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAA...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10068");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a#aaa#aaa#aa#aa                                     a#aaa#aaa#aa#aa                  !ih!ih!ih!ih      a#aaa#aaa#aa#aa                                     a#aaa#aaa#aa#aa                  !ih!ih!ihaaaaaaa!ih      a#aaa#aaa#aa#aa                                     a#aaa#aaa#aa#aa                  !ih!ih!ih      a#aaa#aaa#aa#aa                                     a#aaa#aaa#aa#aa                  !ih!ih!ih!ihaaa#aaa#aa#aaaaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ih", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10069");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#44a                                                                                             #AAA#AA10a-1a100a100a10.04-1.041");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                  aaa4aa!ih!ih!ih!ih!a4a44!ih!ih!ih!ih!HI!AAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                  aaa4aa!ih!ih!ih!ih!a4a44!ih!ih!ih!ih!HI!AAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10071");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...10#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...-1#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10072");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                  10#-1#100#100#1                   ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10073");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                 10#-1#100#100#1                   ", (long) 1657);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1657L + "'", long2 == 1657L);
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10074");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 585, 164);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10075");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10076");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.04100.040.0497.0410.0" + "'", str10, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str12, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10077");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10078");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 553, 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a1a35a0a1a-1" + "'", str10, "0a1a35a0a1a-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10079");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 01- 0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10080");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10a-1a100a100a1" + "'", str25, "10a-1a100a100a1");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10081");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 570, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 570 + "'", int3 == 570);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10082");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 195, 176);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 3068, 509);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10083");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!H#4#4a4HI!HI!HI!HI!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10084");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 195L, (float) 672, (float) 127L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 672.0f + "'", float3 == 672.0f);
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10085");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 365, (-140));
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10086");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1657L, (double) 151L, (double) 1662);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 151.0d + "'", double3 == 151.0d);
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10087");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str14, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10088");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a10a1a100a100" + "'", str9, "-1a10a1a100a100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#10#1#100#100" + "'", str11, "-1#10#1#100#100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 10 1 100 100" + "'", str13, "-1 10 1 100 100");
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                         01 1- 001 001 1                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                         01 1- 001 001 1                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10090");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AA#AAA#44a                                                                                             #4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10091");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!44444444444#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#hi!hi!hi!hi!44444444444#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#hi!hi!hi!hi!44444444444#!iha#a#a#a!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10092");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 515, 392);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10#-1#100#100#1 hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1 hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10094");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1#################10A-1A100A100A1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10095");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10096");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10097");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10098");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 3072, 176);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10a-1a100a100a1" + "'", str22, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10099");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!aahi!aaaaaaaahi!", (long) 1662);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1662L + "'", long2 == 1662L);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10100");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str15, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10101");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140", 176);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176 + "'", int2 == 176);
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10102");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10103");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 1024, 129);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 553, 59);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 1 100 100 10 100" + "'", str10, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10104");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 615, 4440L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4440L + "'", long3 == 4440L);
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10105");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10106");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 170, (long) 1758, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1758L + "'", long3 == 1758L);
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10107");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 84, 3072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10108");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!HI!H444HI!HI!HI!HI!Haa#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!Hi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!aaaaaaaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10109");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -14, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10110");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10111");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10112");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10113");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                               AAAAAAA!IH!hi!hi!hi!hi!44a4a!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10114");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 415, 131L, (long) 520);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 520L + "'", long3 == 520L);
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10115");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(171, 1761, 891);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 171 + "'", int3 == 171);
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!aaaaaaa                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10117");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!0.04-1.041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  1.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  1.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10119");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 180, 300);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 180");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "104-14100410041" + "'", str10, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10120");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 2648, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0100.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0040.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.004                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0 0.0 100.0 10.0140.1-40.010.0 97.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0100.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0040.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.004                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 1 100 100 10 100" + "'", str9, "-1 1 100 100 10 100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1 100 100 10 100" + "'", str12, "-1 1 100 100 10 100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#1#100#100#10#100" + "'", str14, "-1#1#100#100#10#100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1#1#100#100#10#100" + "'", str16, "-1#1#100#100#10#100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10121");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1, 0);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 39, 647);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 39");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10122");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10123");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(180.0d, (double) 588.0f, 265.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 180.0d + "'", double3 == 180.0d);
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10124");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10 -1 100 100 1" + "'", str21, "10 -1 100 100 1");
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10125");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                         1 100 100 -1 10                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 100 100 -1 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.ih!ih!iH#4#44a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.ih!ih!iH#4#44a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10128");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10129");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(383, 100, 265);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10130");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1 100 100 1" + "'", str12, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "104-14100410041" + "'", str15, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10131");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a# #   a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4a# #   a#4#4a4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# #   a#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10132");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0a1a35a0a1a-1" + "'", str14, "0a1a35a0a1a-1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 1 35 0 1 -1" + "'", str17, "0 1 35 0 1 -1");
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10133");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1379, (float) 59, 416.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 59.0f + "'", float3 == 59.0f);
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10134");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                        4aaa4aa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10135");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("     1#001#001#1-#01                                     1#001#001#1-#01                  !IH!IH!IH");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10136");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 410, (int) (byte) 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 1 100 0" + "'", str19, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100#-1#1#100#0" + "'", str23, "100#-1#1#100#0");
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10137");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) '4', (int) ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10138");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...AHIAHIAHIAAAA4AAA4AA4AAA4AAA4AAA4AA4AAA4AAA4AAA4AA...aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10139");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 151, (int) ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 647, 309);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10140");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2703, 370L, 751L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2703L + "'", long3 == 2703L);
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10141");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0 100.0" + "'", str10, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0#100.0" + "'", str12, "1.0#100.0");
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10142");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 125, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "I!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA1.0a100.0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: I!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA1.0a100.0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10143");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 129, (int) '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a0" + "'", str15, "-1a0");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10144");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10 10 0 -1 100                                                                                   ...", (short) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10145");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 340, 81);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 1.0f + "'", float6 == 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0#100.0" + "'", str12, "1.0#100.0");
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10146");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10147");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 406, (double) 409, (double) 4393.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4393.0d + "'", double3 == 4393.0d);
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10148");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#-1#100#100#1" + "'", str14, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10149");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 HI!HI!HI!HI!H444HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10150");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (byte) 100, 0);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10151");
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
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#0" + "'", str20, "-1#0");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10152");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10153");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!hi!hi!hi!h#4#44hi!hi!hi!hi!h", 1379);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1379 + "'", int2 == 1379);
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10154");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10155");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -14, (short) (byte) 10, (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10156");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!44444444444#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#hi!hi!hi!hi!44444444444#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#hi!hi!hi!hi!44444444444#!iha#a#a#a!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10157");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.04100.0" + "'", str9, "1.04100.0");
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10158");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 73L, 543.0f, (float) 340);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 543.0f + "'", float3 == 543.0f);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10159");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -14 + "'", short2 == (short) -14);
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10160");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -14, (byte) 100, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10161");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#444a444#444a4#4 4#4   4a4#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!           #!iha#a#a#a!iha#a#a#!iha#        10#-1#100#100#", 10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10162");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 265, 10);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.04100.0" + "'", str5, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 1.0f + "'", float10 == 1.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0a100.0" + "'", str12, "1.0a100.0");
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10163");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 4780, (long) 4163, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4780L + "'", long3 == 4780L);
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10164");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 81.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 81.0d + "'", double2 == 81.0d);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10165");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 520, 93);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0 35.0 -1.0 10.0 -1.0" + "'", str11, "0.0 35.0 -1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10166");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.Class<?> wildcardClass11 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a100.0" + "'", str10, "1.0a100.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10167");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#100       ...", (long) 127);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 127L + "'", long2 == 127L);
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10168");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 4780, 549L, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4780L + "'", long3 == 4780L);
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10169");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("01011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111i!10#-1#100#10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10170");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iH!ihaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iHaaaaaaa!ihaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iHaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iH!ih1- 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa.aaa#aa.aaa#aa.aaa#aa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10171");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaa#4#44a aaHi!hi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10172");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                     !ihh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10173");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10174");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                            aaaaaaaaaaaaaaaaaaaa# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#AAA4AA!IH!IH!IH!IH!A4A44!IH!IH!IH!IH!", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10175");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10176");
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
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 4440, 73);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10#-1#100#100#1" + "'", str25, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10177");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Iclass [[[Ljava.lang.reflect.AnnotatedElement;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10178");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0" + "'", str9, "0.0");
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10179");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4780, (float) 176, 2703.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4780.0f + "'", float3 == 4780.0f);
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10180");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0 35.0 -1.0 10.0 -1.0" + "'", str11, "0.0 35.0 -1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 35.0f + "'", float14 == 35.0f);
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10181");
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
        long long22 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
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
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10182");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 416, 176);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10183");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaa-1 1 100 100 10 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaa-1 1 100 100 10 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10185");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaa#4#44a                                                                                           aa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10186");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 0 1 1 0 -1" + "'", str14, "100 0 1 1 0 -1");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) -1 + "'", byte15 == (byte) -1);
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10187");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1#100#100#1" + "'", str20, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "104-14100410041" + "'", str22, "104-14100410041");
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10188");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1852, (long) 543, (long) 164);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1852L + "'", long3 == 1852L);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10189");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 588, 1852);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 588");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# # #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!aaaaaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# -1 1 100 100 10 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# # #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!aaaaaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# hi!# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# -1 1 100 100 10 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10191");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0#100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10192");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!  hi!aaaaaaa hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10193");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 3067, 588);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 100 100" + "'", str12, "0 100 100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10194");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!HI! 10#-1#100#100                                                                                                                                                                                                                                                 10.04100.040.0497.0410.0", (double) 515.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 515.0d + "'", double2 == 515.0d);
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10195");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 100, 10);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 129, (int) (short) 100);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 549, 70);
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10196");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("CLASS [ICLASS [BCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10197");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10198");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10199");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -14, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -14 + "'", byte3 == (byte) -14);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10200");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(406, 390, 517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 390 + "'", int3 == 390);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10201");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-14.0d), 520.0d, (double) 1758.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10202");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...4#44A4#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...4#44A4#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10204");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10205");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 3072, (int) (short) 1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 539, 340);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 100 + "'", byte24 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1004-141410040" + "'", str26, "1004-141410040");
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10206");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10207");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010#10010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10208");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(216, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10209");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1#-1#100#100" + "'", str8, "-1#-1#100#100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10210");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!HI!HI!HI!44A4A!HI!HI!HI!HI!      1#001#001#1-#01                                     1#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("            ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Aaaaaaaaaaaa444444444444444444444444441.0100.0Class [Bclass [Ljava.lang.String;class [Daaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaaaaa444444444444444444444444441.0100.0Class [Bclass [Ljava.lang.String;class [Daaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10213");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 167, 81);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 171, 3069);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 171");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10214");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10215");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#", (float) 180);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 180.0f + "'", float2 == 180.0f);
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10216");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str11, "10.0#100.0#0.0#97.0#10.0");
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10217");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) 100, 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10219");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 410, (int) (byte) 100);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 -1 1 100 0" + "'", str19, "100 -1 1 100 0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10220");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 73L, 365.0f, (float) 1627);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1627.0f + "'", float3 == 1627.0f);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10221");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 1, 392);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10222");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(164L, 180L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 180L + "'", long3 == 180L);
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10223");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10224");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.010.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10225");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 10, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 99, 566);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 99");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str13, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10226");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-1" + "'", str14, "104-1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10227");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 0, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 517, 37);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.04100.0" + "'", str13, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10228");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           A100.0a0.0a97.0a   hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10229");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10 10 0 -1 100                                                                                   ...", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10230");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0a100.0                                                                                                                                                                      1.0a100.0                                                                                                                                                                      1.0a100.0                                                                                                                                                                      1.0a100.0                                                   ", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10231");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-1414100401004-141410040", 167);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 167 + "'", int2 == 167);
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10232");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 93, 415);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  ############################################################################################################################################################################### 4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  ############################################################################################################################################################################### 4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4#444 4  4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10234");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 672, 509);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10235");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hI!AAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10236");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10237");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#-1#1#100#0" + "'", str15, "100#-1#1#100#0");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 -1 1 100 0" + "'", str18, "100 -1 1 100 0");
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10238");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10239");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#-1#100#100hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!aaaaaaahi!hi!hi!10#-1#100#100#110#-1#100#100#1hi!hi!hi!hi!10#-1#100#100#110#-1#100#100#1", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10240");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1852, (float) (byte) 0, (float) 265);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1852.0f + "'", float3 == 1852.0f);
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10241");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10242");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10243");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#4a4#4a44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10244");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!aaaaaaa#4#44a", 4440L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4440L + "'", long2 == 4440L);
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10245");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, 108L, (long) 419);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10246");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!                                                                                          ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10247");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ', 370, 10);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 520, 416);
        float float21 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1758, 520);
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
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + (-1.0f) + "'", float21 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10248");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 93L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#1                                     10#-1#100#100#1      !IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#1                                     10#-1#100#100#1      !IH!IH!IH!IH!A4A44!IH!IH!IH!IH!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10250");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#1000 1 35 0 1 -aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!", (long) 1749);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1749L + "'", long2 == 1749L);
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10251");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(70L, (long) 194, (long) 220);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 70L + "'", long3 == 70L);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10252");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4');
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.041.04-1.0" + "'", str8, "0.041.04-1.0");
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10253");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 549, (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 176, (-1));
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10254");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("I!HI!HI!10041104-14100410041104-14100410041104-1...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10255");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10256");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a-1a100a100a1" + "'", str16, "10a-1a100a100a1");
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10257");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(566.0d, (double) 1657L, (double) 517);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 517.0d + "'", double3 == 517.0d);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1HI!AAAAAAA-1 1 100 100 10 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10259");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1852, 1758, 1657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1657 + "'", int3 == 1657);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10260");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 195L, 131.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10261");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0#0.0#0.0" + "'", str13, "1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10262");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str18, "0.0#-1.0#10.0#100.0#0.0");
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10263");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10264");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 619, 543);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0#100.0" + "'", str6, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.04100.0" + "'", str8, "1.04100.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0#100.0" + "'", str10, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1.0a100.0" + "'", str13, "1.0a100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10265");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10266");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 406, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str11, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10.04100.040.0497.0410.0" + "'", str13, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str17, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10267");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) -1, (int) (byte) -1);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10268");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 264, 2952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 264");
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
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10269");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 4393, 520);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 3072, 125);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0a-1.0" + "'", str15, "100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10270");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', (int) (short) 100, (int) (byte) 0);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 127, (int) (byte) 0);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10271");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("i!                  10#-1#100#100.0A-1.0A10.0A100.0A0.4aaaaaaa!ih40.001#0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10272");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 253, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10273");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("########################################################################################-##############################hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################################################################################-##############################hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10274");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...10#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...-1#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...100HAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH                                                             0.001a0.1AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...10#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...0#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...-1#4#44a ...hi!hi!hi! 10#-1#100#100#1 10#-1#10...100HAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH                                                             0.001a0.1AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10275");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                  10#-1#100#100#1                   ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10276");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) -14, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10277");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10278");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 410, (int) (byte) 100);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#######################################################################################################################################################################4#44a ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #######################################################################################################################################################################4#44a ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1a1a100a0" + "'", str13, "100a-1a1a100a0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10279");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 615, (double) (-1L), (double) 122);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10280");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-141410041004104100" + "'", str12, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a1a100a100a10a100" + "'", str15, "-1a1a100a100a10a100");
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10281");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 615, 171);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 131, 129);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10282");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str12, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str15, "0.0#-1.0#10.0#100.0#0.0");
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10283");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 84, (int) ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 0" + "'", str16, "-1 0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-140" + "'", str18, "-140");
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10284");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                  10 # - 1 # 100 # 100 # 1                     hi ! aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10285");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 0" + "'", str9, "-1 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-140" + "'", str11, "-140");
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10286");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1662, 1353, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1662 + "'", int3 == 1662);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10287");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("########################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10289");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("##hi!##hi!####hi!Hi!##hi!##hi!####hi!Hi!##hi!##hi!####Hi!##hi!##hi!####01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10290");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10292");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#!iha#a#a#a!iha#a#a#!iha#4444444410#-1#100#100#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10293");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1#001#001#1-#011#001#001#1-#01!IH!IH!IHHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10294");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
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
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10295");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 2752, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10296");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10297");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 515, 200);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 515 + "'", int3 == 515);
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10298");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                ", 549.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.444444444444444E174d + "'", double2 == 4.444444444444444E174d);
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10299");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 244, 122);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 3068, 406);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "041004100" + "'", str12, "041004100");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0 100 100" + "'", str23, "0 100 100");
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10300");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10301");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4#44A ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10302");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', (int) (byte) -1, (-1));
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10303");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 125, 0);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "041004100" + "'", str14, "041004100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10304");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (int) ' ', 1);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 10 0 -1 100 0" + "'", str19, "10 10 0 -1 100 0");
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10305");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a#HI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10306");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 194, 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10307");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 441, (float) 615, (float) 127L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 127.0f + "'", float3 == 127.0f);
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10308");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 539, 273);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10309");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("########################10#-1#100#100#1#########################0.0a-1.0a10.0a100.0a0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10310");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 416, 0);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#-1#100#100#1" + "'", str18, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10311");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(515.0f, 108.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 515.0f + "'", float3 == 515.0f);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10312");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1#044444444444444444444#-1#100#100#1                   hi!aaaaaaahi!44hi!4-1#0444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10313");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 410, 70);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10314");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.1-40.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10315");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1856, 515);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1856 + "'", int3 == 1856);
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10316");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, (int) '4');
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10317");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                 hi!hi!hi!                  50#35#500#500#5                                     50#35#500#500#                                                                                                                                                                  ", (double) 383.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 383.0d + "'", double2 == 383.0d);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10318");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2703.0f, (double) 1685L, (double) 507.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 507.0d + "'", double3 == 507.0d);
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10319");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.prependIfMissing("hi!aaaaaaa", (java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "#aaa#aa");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        byte[] byteArray18 = new byte[] { (byte) -1, (byte) 0 };
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray18);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray18);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray18);
        java.lang.Object[] objArray22 = new java.lang.Object[] { strArray14, "0.04-1.0410.04100.040.0", byteArray18 };
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (int) (short) 0, 0);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEach("##############################################################AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAA...###############################################################", strArray1, strArray14);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!aaaaaaa" + "'", str11, "hi!aaaaaaa");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray18), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[[hi!, , hi!aaaaaaa, hi!, ], 0.04-1.0410.04100.040.0, [-1, 0]]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "##############################################################AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAA...###############################################################" + "'", str27, "##############################################################AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAA...###############################################################");
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10320");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 168, (long) 300, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10321");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10322");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(164, 2952, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2952 + "'", int3 == 2952);
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10323");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1856, 509);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10324");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("!IH!IH!IH!IHIH##H!IH!IH!IH!IH10.1-0.0!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: !IH!IH!IH!IHIH##H!IH!IH!IH!IH10.1-0.0!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAAHI!AAAAAAA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10325");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) -14, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10326");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 171, 150L, (long) 875);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 150L + "'", long3 == 150L);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10327");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10328");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(778.0d, (double) 244.0f, (double) 1685);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1685.0d + "'", double3 == 1685.0d);
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10329");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10330");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                           10410404-1410040                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10331");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a-1.0a10.0a100.0a0.0Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10332");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 3072, (int) (short) 1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) -1 + "'", byte18 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10333");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 194, (double) '#', (double) 1756);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1756.0d + "'", double3 == 1756.0d);
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10334");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 416, 416);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10 -1" + "'", str17, "10 -1");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10335");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 100, 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10336");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0 -1.0" + "'", str7, "100.0 -1.0");
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10337");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', 175, 164);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 -1" + "'", str19, "10 -1");
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10338");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0#100#10##hi!##hi!####hi!Hi!##hi!##hi!####hi!Hi!##hi!##hi!####Hi!##hi!##hi!####01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10340");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 1856, 543);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10341");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                 hi!hi!hi!                  50#35#500#500#5                                     50#35#500#500#                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10342");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10#-1#100#100#1                   -14-141004100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10343");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("265.0#99.0#131.0#1662.0#129.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10344");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "041004100" + "'", str8, "041004100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0a100a100" + "'", str10, "0a100a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0a100a100" + "'", str12, "0a100a100");
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10345");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iH!ihaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iHaaaaaaa!ihaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iHaa#aaa#!ihaa#aaa#aaaaaaa!ihaa#aaa#aa#aaa#!iH!ih1- 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa#aaa#aa.aaa#aa.aaa#aa.aaa#aa!IH!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10346");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# #   A############################                                                                                                                                                                                                                          ", 253);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 253 + "'", int2 == 253);
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10347");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#-1#100#100#1" + "'", str15, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10348");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -14, (byte) -14);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10349");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-1#1#100#0##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10350");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (short) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10351");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-140" + "'", str10, "-140");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10352");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" ...a#4#441                  #100#100#-1#1                  hi!                  10#100#100#-1#1                  hi!aaaaaaa                  10#100#100#-1#1                                    10#100#100#-1#hi!                  10", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10353");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                    !ih1#001#001#1-#011#001#001#1-#01!IH!IH!IHHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA", 778.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 778.0d + "'", double2 == 778.0d);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10354");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10L, (double) 151.0f, (double) 875);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 875.0d + "'", double3 == 875.0d);
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10355");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("##### ####                                                                                          ", (byte) -14);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -14 + "'", byte2 == (byte) -14);
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10356");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1627, (long) 585, 265L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1627L + "'", long3 == 1627L);
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10357");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a", (float) 195L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 195.0f + "'", float2 == 195.0f);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10358");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 108.0f, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 108.0f + "'", float3 == 108.0f);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10359");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 365, 100);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 520, (int) (byte) 0);
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double24 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double25 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444#4#4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10361");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4    a0 -1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10362");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 1 + "'", short16 == (short) 1);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10363");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (float) 84L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 84.0f + "'", float2 == 84.0f);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10364");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(39.0f, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10365");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                             100.0 -1.0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10366");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 291, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                        ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 10 0 -1 100 0" + "'", str12, "10 10 0 -1 100 0");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10367");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a######a#-a-#-a###");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10368");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#1#100#100#10#100                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10369");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 226, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10370");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("# a # a10a-1a100a100a1# a # a10a-1a100a100a1# a # a10a-1a100a4 4hi!hi!hi!hi!h#4#0.04-1.041hi!hi!hi!hi!h# a # a10a-1a100a100a1# a # a10a-1a100a100a1# a # a10a-1a100a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10371");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaa10a-1a100a100a10.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10372");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("44444444444444444444444                 10#-1#100#100#1                   hi!aaaaaaa444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444                 10#-1#100#100#1                   hi!aaaaaaa444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10373");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10375");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0#0.0#0.0" + "'", str10, "1.0#0.0#0.0");
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10376");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 891);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1 100 100 1" + "'", str12, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaa 10#-1#100#100#1 hi! 10#-1#100#100#1 HI!HI!H...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaa 10#-1#100#100#1 hi! 10#-1#100#100#1 HI!HI!H...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10378");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10379");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 44444.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10380");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("!ih1#001#001#1-#011#001#001#1-#01!IH!IH!IHHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA", 192);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10381");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("151.0409.0751.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10383");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 383L, 0.0f, 409.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10384");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 3072, 1662);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 122, 382);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 122");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10410404-1410040" + "'", str17, "10410404-1410040");
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10385");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 0" + "'", str13, "-1 0");
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10386");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.0# #   A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10387");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0.0a-1.0a10.0a100.0a0.04444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aaaaaaa.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-1410 10 0 -1 100 0hi!.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10388");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(365L, (long) 1060, 1857L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 365L + "'", long3 == 365L);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10389");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(369, 4440, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4440 + "'", int3 == 4440);
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10390");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hhi!hi!aaaaaaahi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1!ih", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10391");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0 . 0 A - 1 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10392");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.-14.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.-14hi!aaaaaaa.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.-14hi!.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.0-1.000.-14");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10393");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 0);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10394");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10395");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                                                                                  hi!hi!hi!                  10#-1#100#100#1                         ...                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10396");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                                                                         !IH");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                          !IH");
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
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10397");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 100, 10);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "104-14100410041" + "'", str21, "104-14100410041");
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10398");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10399");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(164L, (long) 331, 543L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 543L + "'", long3 == 543L);
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10400");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, '4', 180, 127);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 517, 216);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0#1.0#-1.0" + "'", str7, "0.0#1.0#-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10401");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("265.0499.04131.041662.04129.0 1#001#001#1-#01 1#001#001#1-#01 !IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHI!HI!HI!10041104-14100410041104-14100410041104-1...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"265.0499.04131.041662.04129.0 1#001#001#1-#01 1#001#001#1-#01 !IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHI!HI!HI!10041104-14100410041104-14100410041104-1...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10402");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 615, 171);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10403");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 0, 543);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10404");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 340, (double) 195L, (double) 39);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 340.0d + "'", double3 == 340.0d);
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10405");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10406");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 891, 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10407");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 549, (-140));
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10408");
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
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 3068, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 100, 170);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "104-14100410041" + "'", str25, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10409");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 10.0f, (double) 588);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10410");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10411");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4#444a444#444a4#44#44a4", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10412");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1      hi!aaaaaaa#100#100#-1#1                                     10#100#100#-1#1      hi!hi!hi!                  10#100#100#-1#1                                     10#100#100#-1#hi!hi!hi!hi!                  10", (float) 2703);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2703.0f + "'", float2 == 2703.0f);
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10413");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!                  10-11001001                                     10-11001001     ", (double) 549L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 549.0d + "'", double2 == 549.0d);
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10414");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) 'a', 0);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10 -1 100 100 1" + "'", str27, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "10 -1 100 100 1" + "'", str29, "10 -1 100 100 1");
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10415");
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
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10416");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!0.04-1.041HI!HI!HI!HI!H#4#4HI4HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10418");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#-1#100#100#1" + "'", str13, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10" + "'", str17, "10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10a-1a100a100a1" + "'", str19, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10419");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10420");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 3067, (-140L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3067L + "'", long3 == 3067L);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10421");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 543, (double) 1657.0f, (double) 875);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 543.0d + "'", double3 == 543.0d);
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10422");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("!!!!i!hhi!hi!hi!Hi!hi!hi!hi!Hi!hi!100.0#-1.0HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10423");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10424");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10425");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) -14);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -14 + "'", short3 == (short) -14);
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10426");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 588, 216);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10427");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10428");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1746, (long) (short) 100, (long) (-14));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-14L) + "'", long3 == (-14L));
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10429");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1 0" + "'", str9, "-1 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1#0" + "'", str11, "-1#0");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10430");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a35.0a-1.0a10.0a-1.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10431");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 0, (int) (byte) 0);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 180, (int) (byte) 10);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10432");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10433");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AA#AAA                                                                                              1 100 100 -1 10", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10434");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10435");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10436");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), (float) ' ', 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10438");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10439");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001a0.25a0.01a0.1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10440");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) '4', (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10442");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10443");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10444");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 100L + "'", long1 == 100L);
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10445");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10446");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10447");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10448");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (-1), 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10449");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!", (double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10450");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 100, 0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10451");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10452");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 10, 100);
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
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10453");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10454");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10456");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 0L, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10457");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10458");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, 0.0d, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10459");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100, (double) (short) 1, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10460");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10461");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10462");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10463");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (double) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10464");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10465");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, (float) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10466");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10467");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 100, (float) 10, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10468");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '4', 0.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10469");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10470");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10471");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a32", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10472");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1a32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10474");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), (float) '4', (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10475");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a1-1.0a10.0a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10477");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1L, (double) 1, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10478");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10479");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10480");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10481");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10482");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10483");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 100 + "'", number1, 100);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10484");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (byte) -1, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10485");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10486");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10487");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 100L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10488");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0 10.0 52.0 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 10.0 52.0 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10490");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) (byte) 10, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10491");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10492");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) (short) -1, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10493");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, (long) (short) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10494");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10495");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10496");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10497");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10498");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10499");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a32");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest20.test10500");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }
}

