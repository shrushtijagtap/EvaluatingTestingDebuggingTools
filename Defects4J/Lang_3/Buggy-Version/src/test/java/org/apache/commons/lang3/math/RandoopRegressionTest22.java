package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest22 {

    public static boolean debug = false;

    @Test
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11001");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11002");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 100, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:         0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11004");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11005");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#00.0A0.0A0.1-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11006");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11007");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 67, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 67L + "'", long3 == 67L);
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11008");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11009");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a#479#25#0", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11010");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44a", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11011");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (double) (short) 0, (double) 67);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11012");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("7925001011-0017925001011-0017-1.0#-1.07925001011-0017925001011-0017");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11013");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11014");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) (short) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11015");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11016");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4#a", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11017");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhh100 7920AA....                                                                                          1-4001401");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11018");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11019");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (-1), (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11020");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010aaa100a a10aaa10aaa100aaa-a1aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11021");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaa100#-1#10#100#52#974#aaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11022");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("35#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#0", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11023");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11024");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11025");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (short) 10, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11026");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100#-1#10#100#52#97 #a-1.0a0.0a0.01", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11027");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AA ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11028");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11029");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass8 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11030");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10a100a-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11031");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(10L, 100L, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11032");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#100#-1" + "'", str20, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11033");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 100, (int) '#');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11034");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("7920AA....                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7920AA....                                                                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11035");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11036");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11037");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11038");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11039");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) '4', 10041.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11040");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11041");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11042");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) '4', 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 35.0f + "'", float5 == 35.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 35.0f + "'", float6 == 35.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11043");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11044");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1### 1###                       ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11045");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a", 10041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10041 + "'", int2 == 10041);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11046");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100a0a-1a100a1a10.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-0.0#0.0#0.1-");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11047");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4-1.040.040.0100#-1#10#100#52#97 #4");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11048");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 0.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11049");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11050");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) (byte) 0, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11051");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        short[] shortArray9 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray9);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray9, ' ', (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass16 = shortArray9.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray17 = new java.lang.reflect.GenericDeclaration[] { wildcardClass2, wildcardClass16 };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) genericDeclarationArray17, '4', (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(genericDeclarationArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [S" + "'", str18, "class [Ljava.lang.String;class [S");
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11052");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hhhhhhhhhh100 7920AA....                                                                                          1-4001401");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11053");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4AA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11054");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) 100L, (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11055");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4AA", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11056");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0A0.0A0.0100 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11057");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11058");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 1L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11059");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, 100L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11060");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaa#479#25#001#01#1-#001aaaaaa00101#00101#00101#00101#00101#00101#00101#00101#00101#001");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11061");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) (byte) 0, (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11062");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11063");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11064");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11065");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11067");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11068");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) 0, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11069");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) (short) -1, 10);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11070");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11071");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 100, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11072");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1### 1###                       ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11073");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11074");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 10, (int) (byte) -1);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 100 -1" + "'", str18, "10 100 -1");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11075");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) (short) 1, (float) 10041L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11076");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#100#-1" + "'", str11, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11078");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("35#-1#0#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11079");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11080");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11082");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11083");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a0.0a0.0" + "'", str12, "-1.0a0.0a0.0");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11084");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100a0a-1a100a1a1" + "'", str25, "100a0a-1a100a1a1");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11085");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, (long) '#', (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11086");
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
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "AA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: AA");
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
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11087");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100a10H35#-1#0#", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11089");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11090");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11091");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#10#100#52#974#a", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11092");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 1068, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11094");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11095");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11096");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10100 10");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        short[] shortArray9 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray9);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray9, ' ', (int) (short) 100, (int) ' ');
        java.lang.Class<?> wildcardClass16 = shortArray9.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray17 = new java.lang.reflect.GenericDeclaration[] { wildcardClass2, wildcardClass16 };
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(genericDeclarationArray17);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(shortArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray9), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(genericDeclarationArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [S" + "'", str18, "class [Ljava.lang.String;class [S");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;class [S" + "'", str19, "class [Ljava.lang.String;class [S");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11097");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10041L, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100 10H35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10H35#-1#0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11099");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0A0.0A0.1-1a001 HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a1a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11100");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a79a25a001a01a1-a001", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11101");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100#10" + "'", str7, "100#10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 10" + "'", str9, "100 10");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11102");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".0A0.0A0.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11103");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a0.0a0.0" + "'", str13, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11104");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) 10041, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11105");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(10041L, (long) (byte) 10, 67L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11106");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("925001011-001444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11107");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11108");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11109");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11111");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 10041L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10041L + "'", long2 == 10041L);
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11112");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0A0.0A0.0100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A0.0A0.0100 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11114");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#          100a1-1.0A0.0A0.0        ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11115");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1100 10-100 104001401");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100 7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 7920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11117");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11118");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1068, (double) 'a', (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11119");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11120");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11121");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (-1), 10041);
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
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                100 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11124");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                          100A0A-1A100A1A1                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11125");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1072, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1072 + "'", int3 == 1072);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11126");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100#10100#10100#10100#10100#10100#10100#10100#10100#10100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11127");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0#0.0#0.1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11128");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a#0#1-#53");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11129");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 67L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11130");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, 100L, 67L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11131");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a1.A.A.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11132");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010", 10041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10041 + "'", int2 == 10041);
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11133");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11134");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11135");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10a#a100.0a1a4 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11136");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 10, 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11137");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11138");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#52#974#a", (long) 67);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67L + "'", long2 == 67L);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11139");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11140");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11142");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (double) (short) 100, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11143");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AA hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100#-1#10#100#52#974#ah35#-1#0#100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#974#ah35#-1#0#100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11145");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 7920AA....                                                                                           is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11147");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) (byte) 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0-1.0#-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11149");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#10100#10100#10100#10100#10100#10100#10100#10100#10100", (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11151");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11152");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 7920AA....                                                                                          1-4001401", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11153");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11154");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100#10100#10100#10100#10100#10100#10100#10100#10100#101001007920AA....", 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11155");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '4', (float) (byte) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11156");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, (int) (short) 1, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11157");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, 10L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11158");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                    ");
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
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11159");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11160");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 67, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 67L + "'", long3 == 67L);
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11161");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("35-100", (float) 10041);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10041.0f + "'", float2 == 10041.0f);
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11162");
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
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11163");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 67, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11164");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10 100 -11001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11165");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1### 1###                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11166");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aa4 a a a ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11167");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4 A4#a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11169");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AA", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11170");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh ", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.a1.A.A.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11172");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) (short) 100, 1072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11173");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, 0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11174");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1072, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1072 + "'", int3 == 1072);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11175");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11176");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11177");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '4', (double) (byte) 10, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.100 7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.100 7920AA....                                                                                           is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11179");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11180");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                          .0A0.0A0. ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11181");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           ", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11182");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11183");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100L, (double) 67, (double) 1072);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11184");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 1, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11185");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0A0.0A0.0100 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11186");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10041, (float) 10, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11187");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100a135#-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11188");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11190");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("79#25#001#01#1-#001a1.A.A.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11191");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("135#-1#0#a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11192");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 1072);
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
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11193");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11194");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11195");
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
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0#0.0#0.0" + "'", str17, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a0.0a0.0" + "'", str19, "-1.0a0.0a0.0");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11196");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a#a100.0a1a4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11197");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11198");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) (byte) 0, (long) 1072);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1072L + "'", long3 == 1072L);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11199");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11200");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("79#25#001#01#1-#001", (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11201");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11202");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                          100A0A-1A100A1A1                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11203");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) -1, (-1));
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1072, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11204");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 67, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67");
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1004-14104100452497" + "'", str26, "1004-14104100452497");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11205");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a 4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001010aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a 1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0 hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11206");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("925001011-00110#100#-11.0 0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11207");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a#0#1-#53", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11208");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 67, (double) 10.0f, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11209");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11210");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35#-1#0#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11211");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11212");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11213");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 10, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11214");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0 0.0 0.0-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11215");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11216");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("35#-1#0#", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11217");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1004-14104100452497" + "'", str22, "1004-14104100452497");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11218");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11219");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("925001011-001444444444444444444444444444444444444444100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11220");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100-1.0#0.0#0.0-1.0A0.0A0.0h35#-1#0#100", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11221");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #", (float) 67);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 67.0f + "'", float2 == 67.0f);
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11222");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4 A4#a", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11223");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                  4 #                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11224");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1#10#100#52#97");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. aa4 a a a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0. aa4 a a a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11226");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 1068, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1068 + "'", int3 == 1068);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11227");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 100, (byte) 0, (byte) -1, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', (int) (byte) 10, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 100, 0, -1, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11228");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0A0.0A0. aa4 a a a ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11229");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 100, 1072L, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11230");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#0#-1#100#1#1" + "'", str17, "100#0#-1#100#1#1");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11231");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444479#25#001#01#1-#001aaaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11232");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11233");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                        1a1a001a1-a0a001                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11234");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100", (long) 10041);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10041L + "'", long2 == 10041L);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11236");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 0, (double) 1L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11237");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "h35#-1#0#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: h35#-1#0#");
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
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11238");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 500, (double) (short) 100, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11239");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11240");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10100-1100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a5#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a 4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001010aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a 1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0 hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a 4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001010aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a 1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0 hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11242");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11243");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1072, (float) (byte) -1, (float) 67);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1072.0f + "'", float3 == 1072.0f);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11244");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) ' ', (long) 500);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11245");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11246");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) 1072, (long) 1068);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11247");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) 10, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11248");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 67, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67");
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
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11249");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11250");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', 1, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("79#25#001#01#1-#001aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"79#25#001#01#1-#001aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11253");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) 0L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1041004-10.0 0.0 0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1041004-10.0 0.0 0.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11255");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0 0.0 0.01### 1###                       ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11256");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11257");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 0, 1072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 Ahi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11259");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11260");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1, (double) (short) 0, 67.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11261");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11262");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(500, (int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 500 + "'", int3 == 500);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11263");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11264");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354-14040" + "'", str11, "354-14040");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35a-1a0a0" + "'", str13, "35a-1a0a0");
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11265");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (byte) -1, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11266");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11267");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4 #                             ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11268");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#100#-1100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a-1.0a0.0a0.0100#-1#10#100#52#97##a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11269");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a", (long) 1068);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1068L + "'", long2 == 1068L);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11270");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1072, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1072 + "'", int3 == 1072);
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11271");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) 100L, (float) 67);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11272");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11273");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11274");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100A0A-1A100A1A1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11275");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) ' ', 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11276");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', (long) (short) -1, (long) 229);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11277");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35a-1a0a0", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11278");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11279");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 67, (long) 10, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 67L + "'", long3 == 67L);
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11280");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 0, (float) 1072L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1072.0f + "'", float3 == 1072.0f);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11281");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 1, (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11282");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444 0.0 0.", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11283");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11284");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("925001011-001444444444444444444444444444444444444444100 10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11285");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100a10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11286");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 229, 100.0f, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 229.0f + "'", float3 == 229.0f);
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11287");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, (long) 1068, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1068L + "'", long3 == 1068L);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11288");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1L), 229.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11289");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0 0.0 0.0" + "'", str8, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a0.0a0.0" + "'", str10, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0#0.0#0.0" + "'", str12, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11290");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hhhhh-1.0#0.0#0.0-1.0A0.0A0.0hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11291");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class [Ljava.lang.String;class [S925001011-h.0A0.0A0. hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.String;class [S925001011-h.0A0.0A0. hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11292");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444", (long) 67);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67L + "'", long2 == 67L);
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11293");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 10041, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11294");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" 4 A 4 A 4a-aa  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a aa  0a aa aa  a-aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11295");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1041004-10.0 0.0 0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-10.0 0.0 0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("925001011-001444444444444444444444444444444444444444100 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-001444444444444444444444444444444444444444100 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("79#25#001#01#1-#001aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"79#25#001#01#1-#001aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11298");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11299");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("          100a1-1.0A0.0A0.0       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11300");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a", (double) 67.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 67.0d + "'", double2 == 67.0d);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10#100#-11.0 0.0 0.0-1.0A0.0A0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#100#-11.0 0.0 0.0-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11302");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11303");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"c\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11304");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A#479#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0 0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0 0.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11306");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11307");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(10041L, (long) 'a', (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11309");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10, (-1));
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "4 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A04 a.0A0.0A0");
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11310");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaa#479#25#001#01#1-#001aaaaaa", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0A0.0A0.0100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A0.0A0.0100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11312");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "1004-14104100452497");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1004-14104100452497");
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
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11313");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1072.0f, (double) '#', (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1072.0d + "'", double3 == 1072.0d);
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11314");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11315");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11316");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 1068, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1068.0f + "'", float3 == 1068.0f);
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11317");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(67L, (long) 0, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10100-1100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a5#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10100-1100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a-1.0a0.0a0.0100#-1#10#100#52#97#a5#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11319");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("32 0 0 1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11320");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 10, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11321");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 10.0f + "'", float4 == 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10.0#10.0" + "'", str6, "10.0#10.0");
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11322");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a135");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11323");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100#-1#10#100#52#97 #a-1.0a0.0a0.01");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11324");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + Float.POSITIVE_INFINITY + "'", float2 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11325");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(500, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 500 + "'", int3 == 500);
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("79#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.100 7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"354-14040a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.A1.a.a.100 7920AA....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11328");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) ' ', 10);
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
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11330");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-4AA1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11331");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11332");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11334");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11336");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) 229, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11337");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100404-141", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11338");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10041");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11339");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) 10, 500);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11340");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), 0L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11341");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11342");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11343");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11344");
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
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 0, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.a.a.A1.a.a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 0L, (double) 1072);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11347");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "10 100 -1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10 100 -1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11348");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "4aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4aa");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11349");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0" + "'", str9, "100.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11350");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11351");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                        1a1a001a1-a0a001                                          ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11352");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100#-#0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11353");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 1068, (int) 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11354");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) (byte) 100, (double) 10041);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10041.0d + "'", double3 == 10041.0d);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11355");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 1072, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1072L + "'", long3 == 1072L);
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11356");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("AA ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11357");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 0, 0);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100#10" + "'", str7, "100#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11358");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha13535#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## A", 67L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 67L + "'", long2 == 67L);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11359");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" .14 .14 1.14 .141.14 1.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11360");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11361");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11362");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 10041, 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11363");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, 1.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11364");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("35#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#035#-1#0#0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11365");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11366");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#a5100a-1a10a100a52a97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11367");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1#10#100#52#97", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11368");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "100#-1#10#100#52#97");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100#-1#10#100#52#97");
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
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11370");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) ' ', 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) '#', 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11371");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (short) 0, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11372");
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
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, 1072);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11374");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("          41004a414-414.404A404.404A404.404                4354 4-414 404 40");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11375");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("class[Ljava.lang.String;class[S925001011-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11376");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "354-14040" + "'", str17, "354-14040");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11377");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1072.0f, (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1072.0d + "'", double3 == 1072.0d);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("925001011-001444444444444444444444444444444444444444100 10                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"925001011-001444444444444444444444444444444444444444100 10                                          \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11379");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11380");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10041" + "'", str10, "10041");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11381");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11382");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("111100103", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111100103 + "'", int2 == 111100103);
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11383");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.040.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11384");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 1, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 100 -1" + "'", str13, "10 100 -1");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11385");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("79#25#001#01#1-#001a1.A.A.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11386");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 67, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 67");
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
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11387");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 1068.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1068.0d + "'", double3 == 1068.0d);
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11388");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("925001011-001", (long) 111100103);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 111100103L + "'", long2 == 111100103L);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11389");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11390");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(67L, (long) 'a', (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11391");
        float[] floatArray2 = new float[] { (-1), 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11392");
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1004-14104100452497" + "'", str27, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11393");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh31007920##....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11394");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0A0.0A0.1-1a001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11395");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11396");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11397");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(3.01001111E8d, (double) (short) 0, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.01001111E8d + "'", double3 == 3.01001111E8d);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11398");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 229, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11399");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("7920##", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11400");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (float) (-1L), (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11401");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) 67, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11402");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11403");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 229, (int) '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11404");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "35a-1a0a0.0A0.0A0. ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 35a-1a0a0.0A0.0A0. ");
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
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11405");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100#-#0#-#0#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: c is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11407");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A0.0A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11408");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a35.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a35.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11410");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10, (float) 10, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11411");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11412");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a4 a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11413");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11414");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', 3.01001111E8d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11415");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11416");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11417");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11418");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (short) 100, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11419");
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
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 0, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11420");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) -1, 111100103, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111100103 + "'", int3 == 111100103);
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11421");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0## a", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11422");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaa#479#25#001#01#1-#001aaaaaa00101#00101#00101#00101#00101#00101#00101#00101#00101#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11423");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11424");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11425");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" 0.0 0.        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11426");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0.0f, (double) 1, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11427");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaa#479#25#001#01#1-#001aaaaaa", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11428");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1035#-1#0#0#35#-1#0#0100.035#-1#0#0135#-1#0#04 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11429");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100A10h...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11430");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("925001011-00110#100#-11.0 0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11431");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11432");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 10, 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, 1072);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11433");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a0aa0a0aa0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11434");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11435");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 1, (byte) 10, (byte) -1, (short) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, -1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11436");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("H### 1###                       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh### 1###                       100### 1###                       A### 1###                       1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11437");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("925001011-001444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11438");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10a#a100.0a1a4 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11439");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.00.0 0.0 0.1-10a#a100.0a1a4 a10a#a100.0a1a4 a10a#a100.0a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11440");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(111100103, 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111100103 + "'", int3 == 111100103);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11441");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                  4 #                                                               ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11442");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11443");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1.0#-1.0.10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0.10.0a10.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11444");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0410.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11445");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0-1.0#-1.0-1.0#-1.0-14aa                                          100a0a-1a100a1a1                                        ", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11446");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11447");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11448");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11449");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "          100a1-1.0A0.0A0.0       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:           100a1-1.0A0.0A0.0       ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11450");
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
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) 0, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0#0.0#0.0" + "'", str21, "-1.0#0.0#0.0");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("7925001011-00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"7925001011-00\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11452");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a1-1.0A0.0A0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11453");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "4aa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4aa");
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
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11454");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0410.00.0A0.0A0.1-1a", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11455");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("141400141-404001");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a1100a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11457");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0 0.0 0.1-", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11458");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (-1), (int) 'a');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11459");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11460");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa", (float) 111100103);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.11100104E8f + "'", float2 == 1.11100104E8f);
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11461");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("class[Ljava.lang.String;class[S925001011-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class[Ljava.lang.String;class[S925001011-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11462");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11463");
        short[] shortArray3 = new short[] { (byte) 0, (short) 1, (byte) 10 };
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) '#', 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[0, 1, 10]");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11464");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("35A-AA1A11.1A1.1A1.A-Hhhhhhhhhhh-A.1 1.1 1.1AAAA AAAA", (float) 67L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 67.0f + "'", float2 == 67.0f);
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11465");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" aa4 a a a ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11466");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1072, (-1.0d), 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11467");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (int) (byte) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 10" + "'", str6, "100 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a10" + "'", str8, "100a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#10" + "'", str15, "100#10");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11468");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a10H35#-1#0#", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11469");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11470");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#00.0A0.0A0.1-4444444 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11471");
        short[] shortArray6 = new short[] { (byte) 10, (short) 100, (byte) 100, (short) 1, (byte) 100, (byte) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11472");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 1068, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1068 + "'", int3 == 1068);
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11473");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 0.0d, 3.01001111E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11474");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" 4 A 4 A 4a-aa  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a a  a aa  0a aa aa  a-aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11475");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1.0a35.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0a35.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11476");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A100 10A10A100A-1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11477");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11478");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1004-1410410045249735#-1#0#00.0A0.0A0.1-35#-1#0#00.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11479");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10 -1 100 1 100 -1", 1072.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1072.0f + "'", float2 == 1072.0f);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11480");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) 1072, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1072.0d + "'", double3 == 1072.0d);
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11481");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a#aaa a", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11482");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("7925001011-001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaaaaaaaa100#-1#10#100#52#974#aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11484");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11485");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11486");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("79a25a001a01a1-a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11487");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444 0.0 0.100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11488");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, 1068L, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1068L + "'", long3 == 1068L);
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11489");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "79#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 79#25#001#01#1-#001");
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11491");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(67L, (long) 1072, (long) 10041);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11492");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1072L, (long) 10, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11493");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1041004-1100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a79a25a001a01a1-a001", (long) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11494");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11495");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0-1.0#-1.0");
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
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11496");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0A.A0AaA0A.A0AaA0A.A1A-AAA10010100101001010010100101001010010100101001010010100101001010010100101001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11497");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11498");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0A0.0A0. aa4 a a a ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11499");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100 7920AA....                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 7\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest22.test11500");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '#', (long) (short) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }
}

