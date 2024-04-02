package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3001");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444440#1#1#10\n         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#1#1#10?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3002");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0410.04-1.0ru1ru1u--1u-1rua-1trueru1ru1u--1hi!ru1ru1u--1u-1rua-1trueru1ru1u--ru1ru1u--1u-1rua", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3003");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 106, (long) 88, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 106L + "'", long3 == 106L);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3004");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444440#1#1#10\n", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3005");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3006");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(11L, (long) 34, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 34L + "'", long3 == 34L);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3007");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.04-1.0" + "'", str7, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3008");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3009");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3010");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3011");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(201, (-141), 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-141) + "'", int3 == (-141));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3012");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 97, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 2881, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1404140" + "'", str20, "-1404140");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3013");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-14-141004104-1.04true-14-141004a444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1a1", (long) 50);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 50L + "'", long2 == 50L);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3014");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("- 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 ....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3015");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0#52.010 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3017");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02-1.0a52.0                                               ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3018");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3019");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3020");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3021");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 45, (float) (-141), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 45.0f + "'", float3 == 45.0f);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3022");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0-1.0#52.0-1.0#52.0-1.0#52.0-...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0-1.0#52.0-1.0#52.0-1.0#52.0-...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3024");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3025");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3026");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("# a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a#", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3027");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 66, 0.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("- 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 ....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3029");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 15, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3030");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#1#100#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3031");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa#aa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3032");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 867, 2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) ' ', 5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 1" + "'", str17, "-1 1");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3033");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3034");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 33, (double) 1151, (double) 60L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.0d + "'", double3 == 33.0d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3035");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.Class<?> wildcardClass12 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3036");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041410040410" + "'", str14, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A A A A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(9.0d, (double) 88, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 88.0d + "'", double3 == 88.0d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3039");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaa               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0    52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3042");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 1089.0f, (float) 25);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3043");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("##########A #A #A #A #A #A #A #A #A #A #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3044");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" HI!10.0a10.0a102.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" HI!10.0a10.0a102.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3045");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 102, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 34, 676);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3046");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("141004-11#1#0#1#1#0 44444444  44444444  44444444  44444444  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3047");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0a5210a5297");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3048");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10a-1", (float) 54);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3049");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a52.0" + "'", str12, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3050");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa9752.01021hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3051");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3052");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97410041040404102" + "'", str15, "97410041040404102");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "97410041040404102" + "'", str18, "97410041040404102");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3053");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("##0414141");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3054");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a4#0 1 0 1--1.0a52.0-1a...", (float) 1089);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1089.0f + "'", float2 == 1089.0f);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                             0 a 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3056");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("... a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3057");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3058");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 100, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3059");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 54L, (double) 3866.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3866.0d + "'", double3 == 3866.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3060");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("TRUE-1 -1 100 0.0##########################################-1.0A52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3061");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(53.0d, 0.0d, (double) 23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3062");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3063");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3064");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 102, 0);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3065");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(492.0d, 119.0d, (double) 2L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 492.0d + "'", double3 == 492.0d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3066");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444440#1#1#0#1#14444                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3067");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("9752.0102");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3068");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3866, (long) 34, 19L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3069");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 140.0f, 0.0d, (double) 53.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3070");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a #0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.          A0.25a0.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3071");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 41, 0);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 97, (int) (short) 52);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10#1#100#0#10" + "'", str30, "10#1#100#0#10");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3072");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, (int) '#');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-#######00.04#0.04##.0#########################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-#######00.04#0.04##.0#########################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3073");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 19, 104L, 859L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 859L + "'", long3 == 859L);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3074");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3075");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100 1" + "'", str12, "100 1");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3076");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1098504L, (long) (short) 100, 27L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1098504L + "'", long3 == 1098504L);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3077");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041410040410" + "'", str13, "1041410040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a1a100a0a10" + "'", str15, "10a1a100a0a10");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3078");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97#100#10#0#0#102", 408);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 408 + "'", int2 == 408);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3079");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3080");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(88, 235, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 88 + "'", int3 == 88);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3081");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a10a0a0a10a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3082");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3083");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3084");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("     44444444  44444444  44444444  44444444 0#1#1#0#1#1#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3085");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(489, 13, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3086");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 174, 1458);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 174");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0#1#1#0 44444444  44444444  44444444  44444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3088");
        double[] doubleArray4 = new double[] { (-1), 100, 1, (-1) };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3089");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 103, 106);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3090");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 0, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3091");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("    ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3092");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3093");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3094");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 10 97" + "'", str10, "10 10 97");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3095");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (double) 3224.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3224.0d + "'", double2 == 3224.0d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3096");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 235, 0.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3097");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                     -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-                                                      ", 65.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 65.0f + "'", float2 == 65.0f);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3098");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 41L, (double) 859, 163.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 859.0d + "'", double3 == 859.0d);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3099");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100# #10# #-#1#.#0# #true#-#1# #-#1# #100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3100");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1-.-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- true", (short) 97);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 97 + "'", short2 == (short) 97);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3101");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 455, 42);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141" + "'", str14, "-141");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3102");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 44, 31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a #a #a #a #a -1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a #a #a #a #a -1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a1a100a0a10" + "'", str18, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3103");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3104");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           a ###        ##        ##        #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3106");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("141-", (long) 95);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 95L + "'", long2 == 95L);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3107");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3866, 41);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3108");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 72, (double) 880.0f, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 880.0d + "'", double3 == 880.0d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3109");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-10-101000100-1.00true-10-1010010a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -10-101000100-1.00true-10-1010010a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041410040410" + "'", str13, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3111");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -141, (long) 1458, (long) 169);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-141L) + "'", long3 == (-141L));
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3112");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 0, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100#100#100#10#1" + "'", str20, "100#100#100#10#1");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3113");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3114");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1#10" + "'", str10, "0#1#1#10");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3115");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 53, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3116");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3117");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                    -1.0a52.025A0.          0.25A0.          0.25A0.          0.25A0.          0.25A0.          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3118");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(30.0f, 30.0f, 34.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 34.0f + "'", float3 == 34.0f);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3119");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3120");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3121");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10041" + "'", str13, "10041");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3122");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10 10 97                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3123");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444440#1#1#10\n", 1089);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1089 + "'", int2 == 1089);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3124");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3125");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "44444444440#1#1#10\n");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44444444440#1#1#10?");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a1a1a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1a1a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3127");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 28, (double) 60L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.0d + "'", double3 == 60.0d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3128");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#####################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3129");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#1                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#-                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#1                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#100                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#10                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#-                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#1                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#.                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#0                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#true                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#-                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#1                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#-                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#1                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#100                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3130");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0 1 1 10" + "'", str17, "0 1 1 10");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3131");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3132");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 113, 163);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3133");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aa########################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa########################################################################################################-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3135");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3866.0f, (float) 10041L, (float) 19L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3136");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0##########################################-1.0a52.0", (-1404140.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1404140.0f) + "'", float2 == (-1404140.0f));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3137");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("141-class [Ljava.laa4#4ava.l");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"141-class [Ljava.laa4#4ava.l\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3138");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("             10410497                              a #                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3139");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("##################################################### aa a a a a a a a a a ", 6.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3140");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 22, (int) (short) 0);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#100#0#10" + "'", str15, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 0 + "'", byte26 == (byte) 0);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3141");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1089);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1089 + "'", int2 == 1089);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3142");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 66, 1151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 66");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3143");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3144");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3145");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 97, (int) (short) 1);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3146");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 29, 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 31, 15);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) 0 + "'", byte23 == (byte) 0);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3147");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2881, (long) 48, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2881L + "'", long3 == 2881L);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3148");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0 -1.0a52.0-1a0a1a0--1.0a52.0-1a0a1a01-1.0a52.0-1a0a1a0.-1.0a52.0-1a0a1a00-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a05-1.0a52.0-1a0a1a02-1.0a52.0-1a0a1a0.-1.0a52.0-1a0a1a00-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0A-1.0a52.0-1a0a1a0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3149");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) '4', 20);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0a10.0a-1.0" + "'", str14, "100.0a10.0a-1.0");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3150");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("2a2 2#2a2 2#2a2 2#2a2 2#2a2 2#2a2 2#2a2 2#2a2 2#2a2 2#2", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#######00.04#0.04##.0#########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3152");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 60, 56);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1404140" + "'", str12, "-1404140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3153");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                  ", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3154");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 0, 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a0.0" + "'", str6, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a0.0" + "'", str8, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3156");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3157");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("ng.String;a.lava4#4a.lavass [Ljacl", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3158");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger3 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        java.math.BigInteger bigInteger5 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger9 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger11 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger[] bigIntegerArray12 = new java.math.BigInteger[] { bigInteger1, bigInteger3, bigInteger5, bigInteger7, bigInteger9, bigInteger11 };
        java.math.BigInteger bigInteger14 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger16 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        java.math.BigInteger bigInteger18 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger20 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger22 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger24 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger[] bigIntegerArray25 = new java.math.BigInteger[] { bigInteger14, bigInteger16, bigInteger18, bigInteger20, bigInteger22, bigInteger24 };
        java.math.BigInteger bigInteger27 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger29 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        java.math.BigInteger bigInteger31 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger33 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger35 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger37 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger[] bigIntegerArray38 = new java.math.BigInteger[] { bigInteger27, bigInteger29, bigInteger31, bigInteger33, bigInteger35, bigInteger37 };
        java.math.BigInteger bigInteger40 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger42 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        java.math.BigInteger bigInteger44 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger46 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger48 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger50 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger[] bigIntegerArray51 = new java.math.BigInteger[] { bigInteger40, bigInteger42, bigInteger44, bigInteger46, bigInteger48, bigInteger50 };
        java.math.BigInteger bigInteger53 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger55 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        java.math.BigInteger bigInteger57 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger59 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger bigInteger61 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.math.BigInteger bigInteger63 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("48494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849484948494849");
        java.math.BigInteger[] bigIntegerArray64 = new java.math.BigInteger[] { bigInteger53, bigInteger55, bigInteger57, bigInteger59, bigInteger61, bigInteger63 };
        java.math.BigInteger[][] bigIntegerArray65 = new java.math.BigInteger[][] { bigIntegerArray12, bigIntegerArray25, bigIntegerArray38, bigIntegerArray51, bigIntegerArray64 };
        java.lang.String str66 = org.apache.commons.lang3.StringUtils.join(bigIntegerArray65);
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
        org.junit.Assert.assertNotNull(bigInteger53);
        org.junit.Assert.assertNotNull(bigInteger55);
        org.junit.Assert.assertNotNull(bigInteger57);
        org.junit.Assert.assertNotNull(bigInteger59);
        org.junit.Assert.assertNotNull(bigInteger61);
        org.junit.Assert.assertNotNull(bigInteger63);
        org.junit.Assert.assertNotNull(bigIntegerArray64);
        org.junit.Assert.assertNotNull(bigIntegerArray65);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3159");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 52.0" + "'", str13, "-1.0 52.0");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3160");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3161");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("001 1- 1-eurt 0.1- 01 ##################################aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa1a1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"001 1- 1-eurt 0.1- 01 ##################################aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa1a1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3162");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 102, (float) 34L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3163");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(33, 22, 1143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3164");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3224, 77, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3165");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3166");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  ###-##-eurt# ##-# ####################################", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3167");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(90, 0, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3168");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("104-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3169");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(30.0f, 0.0f, (float) 133);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 133.0f + "'", float3 == 133.0f);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3170");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 51, (int) (short) 10);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 3, 2);
        short short27 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short28 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 0 + "'", short27 == (short) 0);
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 0 + "'", short28 == (short) 0);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3171");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 12, 4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 4141410, 42);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0#1#1#10" + "'", str16, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3172");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97a100a10a0a0a102", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3173");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) 'a', 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 1089, 16);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) 'a', 0);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3174");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("\n         ", (double) 96L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 96.0d + "'", double2 == 96.0d);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3175");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0410.04-1.0ru1ru1u--1u-1rua-1trueru1ru1u--1hi!ru1ru1u--1u-1rua-1trueru1ru1u--ru1ru1u--1u-1rua", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3176");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 97);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 97 + "'", short2 == (short) 97);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3177");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3178");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3179");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-14-141004104-1.04true-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-141--1411-141A-1411-141A-141");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -14-141004104-1.04true-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-141--1411-141A-1411-141A-141");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3180");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 60, 54);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, 8);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short24 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 97, 1432);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 1 + "'", short25 == (short) 1);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3181");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####################################################.052\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3182");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3183");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3184");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 263, 56.0f, 55.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 263.0f + "'", float3 == 263.0f);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3185");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 2, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...-1.0          ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3187");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3188");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 25, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 94, 1151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3189");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hi!#########################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3190");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 92, 1458L, 56L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1458L + "'", long3 == 1458L);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3191");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a a a a a a a a a aa", (short) 97);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 97 + "'", short2 == (short) 97);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3193");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3194");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 27, 455);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3195");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100.0410.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3196");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3197");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 10 97" + "'", str10, "10 10 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3198");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # #                                                                                              -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3199");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 -1 100 10 -1.0 true##############################################################97#100#10#0#0#102-1 100 10 -1.0 tru");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3200");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                              -1.0a52.0aaaaaaaaaaaaaaaaaaaa                           ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3201");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 871, 1458);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1458 + "'", int3 == 1458);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaa               0.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaa               0.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3203");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1041049");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1041049.0d + "'", double1 == 1041049.0d);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3204");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 0, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3205");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3206");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3207");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(45L, 0L, (long) 156);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3208");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 489, (long) 132, (long) 104);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3209");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 24.0f, 0.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3210");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -141, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3211");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10-1.0true-1-1100-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10-1.0true-1-1100-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10-1.0true-1-1100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a#-1 -1 100 10 -1.0 TRUE-1 -1 1-1 -1-1 -1AAAAAAAAAAAAAAAAAAA..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3215");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hia!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3216");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#############hi!###############################", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3217");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("             10410497                              a #                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297", (float) 1432);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1432.0f + "'", float2 == 1432.0f);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3219");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111 1a1aaaaaaaaaaaaaaaaaaaaaaaa1111111111111111111111111111111111111111111111111111aaaaaaaaaaaaaaaaaaaaaaaa", (short) -141);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -141 + "'", short2 == (short) -141);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3220");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 14.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.0d + "'", double2 == 14.0d);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3221");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -141, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3222");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 3224, 46);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3223");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                   971111114444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3224");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 9L, (double) 44L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3225");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 102, 0);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 29, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.040.0" + "'", str12, "0.040.0");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3226");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1151);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1151 + "'", int2 == 1151);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3227");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3228");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaa                                                    a-a1a.a0aaa52a.a0aaaaaaaaaaaaaaaaaaaaa                                                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3229");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3230");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 86, (-11L), (long) 111);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 111L + "'", long3 == 111L);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3231");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a0.0" + "'", str6, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a0.0" + "'", str8, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("       aa #a #a #a #a #a #a #a #a #a #       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       aa #a #a #a #a #a #a #a #a #a #       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3233");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 29, 5);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0" + "'", str17, "0.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3234");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaa # ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3235");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 18, (long) 3866, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3236");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3237");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#4##4##4##4##4##4##4##4##4##4#97##00##0#0#0##0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3238");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 3224L, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3224.0f + "'", float3 == 3224.0f);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 -1 100 10 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3240");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3241");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 867, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 867 + "'", int3 == 867);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3242");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A aA aA aA aA aA aA aA aA aA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3243");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1   ", (float) 188);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 188.0f + "'", float2 == 188.0f);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3244");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("######################################################.#a52", (double) 34.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 34.0d + "'", double2 == 34.0d);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3245");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3246");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3247");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaa#a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3248");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(25, 169, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3249");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 0, 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3250");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3251");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3252");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1a", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3253");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0452.0" + "'", str13, "-1.0452.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0a52.0" + "'", str16, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0 52.0" + "'", str18, "-1.0 52.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0 52.0" + "'", str20, "-1.0 52.0");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a-1a100a10a-1.0atrue");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a-1a100a10a-1.0atrue\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3255");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3256");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("52.0a-1.0a100a-1atrue-1a-1.0a-10-101000100-1.00true-10-1010010");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3257");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "52.0a                                                    -1.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 52.0a                                                    -1.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3258");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 102, (int) (short) -1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1404140" + "'", str15, "-1404140");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3259");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 359, 140L, (long) 263);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3260");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3261");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:           .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1? is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3262");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3263");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 52, 104, 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3265");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3266");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3267");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 41, 0);
        byte byte24 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 100 + "'", byte26 == (byte) 100);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3268");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("... a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a", (float) 60L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60.0f + "'", float2 == 60.0f);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("    a #aA52#a    a  a   aa  a a #a truea  a   aa hi!a  a   aa  a a #a truea  a   aa    a #aA52#a    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #aA52#a    a  a   aa  a a #a truea  a   aa hi!a  a   aa  a a #a truea  a   aa    a #aA52#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3270");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 0, 1432);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3271");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 31, 0.0d, (double) 1432);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3272");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(2.0d, 0.0d, (double) 92.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3273");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3274");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 27.0f, (double) 27L, (double) 119L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3275");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 4, 66);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3276");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 0, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0452.0" + "'", str13, "-1.0452.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0a52.0" + "'", str16, "-1.0a52.0");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3277");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 19, 49L, 871L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 19L + "'", long3 == 19L);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3278");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10a5210a5297", (float) 132);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 132.0f + "'", float2 == 132.0f);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("    1 true   hi!    1 true  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"    1 true   hi!    1 true  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3280");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3281");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 72, 34);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a0a1a0" + "'", str15, "-1a0a1a0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3282");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("####################97##00##0#0#0##02", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3283");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 15, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3284");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 101097, (long) (byte) 100, (long) 23);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 23L + "'", long3 == 23L);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3286");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(119, 124, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3287");
        long[] longArray3 = new long[] { 72, 188L, 65 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 96, 7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', 53, 0);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[72, 188, 65]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 65L + "'", long4 == 65L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "72a188a65" + "'", str10, "72a188a65");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3288");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, (long) 41, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 41L + "'", long3 == 41L);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3289");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0 52.0" + "'", str5, "-1.0 52.0");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3290");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0a #a #a #a #a #a #a #a #a               0a0a0a10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3291");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 52, 14L, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3292");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(11, 156, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 156 + "'", int3 == 156);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3293");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(6.0f, (float) 188L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3294");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 52);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3295");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0.0" + "'", str18, "0.0");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1#########################################-1.0a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#########################################-1.0a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3297");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 18, (long) 101097, (long) 86);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 101097L + "'", long3 == 101097L);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3298");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(52L, (long) 97, (long) 75);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3299");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3300");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("210a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3301");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10", 19.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("cll.l4cl.l4-c.l");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cll.l4cl.l4-c.l\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3303");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 107, 188L, 14L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3304");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(140, 11, 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3305");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 28, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 107 + "'", int3 == 107);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3306");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#1#100#0#10" + "'", str13, "10#1#100#0#10");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3307");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1                               ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3308");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                     -14-140410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3309");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#1#0#1#1#0 44444444  44444444  44444444  44444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3310");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3311");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3312");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3313");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 97, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3314");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3315");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("2", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3316");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3317");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 56, 10);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long19 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 102L + "'", long19 == 102L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 102L + "'", long20 == 102L);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3318");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a #A #A #A #A #A #A #A #A #A #");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3319");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 -1-1 -1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3320");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A#A#A#A\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100#1\r100", (double) 101097);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 101097.0d + "'", double2 == 101097.0d);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3321");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 3, 1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3322");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 174, 104);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3323");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#1" + "'", str10, "-1#1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3324");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0" + "'", str19, "0.0");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3325");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("          .0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3326");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 408, 56);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0" + "'", str16, "0.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3327");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3328");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#############", (float) 132);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 132.0f + "'", float2 == 132.0f);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3329");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -141, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3330");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 6, 0);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short24 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 16, 0);
        short short29 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "04141410" + "'", str18, "04141410");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 0 + "'", short24 == (short) 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 0 + "'", short29 == (short) 0);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3331");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "04141410" + "'", str11, "04141410");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3332");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3333");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -141, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3334");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 94, 57L, 1098504L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1098504L + "'", long3 == 1098504L);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [-1.0...141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [-1.0...141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [Ljava.laa4#4ava.l141-class [\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3336");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 41, 8);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a52.0" + "'", str14, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 52.0d + "'", double20 == 52.0d);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("!!!!!!IH!IH1-!!!!!!!!!!!!!!!!!!!II11-1-eurtIH1-I1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!!!!!!IH!IH1-!!!!!!!!!!!!!!!!!!!II11-1-eurtIH1-I1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3338");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 110, (int) (short) 100);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3340");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("101097");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3341");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                0 10 0 1 10 10 0 1 10 10 0 1 .0a52.                                 ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3342");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3343");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 15.0f, 100.0d, (double) 35L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3344");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a52  44444444", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3346");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 80, 0.0f, (float) 42);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444aaa1aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444aaa1aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3348");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3349");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                          ...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3350");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 11, 492L, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3351");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                     aaaaaaaaaaaaaaaaaaaaaaaa1a1-          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaa1a1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3353");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1041410040410" + "'", str20, "1041410040410");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10a10a97                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a10a97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3355");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 86, 42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 1089, 1458);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1089");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3356");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3357");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 56.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 56.0f + "'", float3 == 56.0f);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0a #a #a #a #a #a #a #a #a               0a0a0a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a #a #a #a #a #a #a #a #a               0a0a0a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3359");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(101, 2572, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 101 + "'", int3 == 101);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3360");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 102, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 46, (int) ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3361");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1404140" + "'", str12, "-1404140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1 0 1 0" + "'", str17, "-1 0 1 0");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3362");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(124.0d, (double) 48.0f, (double) 106L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3363");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 359, 174);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 252, 7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 52, 80);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3364");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 28, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3365");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 25, 0);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 9, 9);
        float float24 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float27 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0.0" + "'", str26, "0.0");
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3366");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0a10.0a-1.0" + "'", str18, "100.0a10.0a-1.0");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3367");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3368");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("        ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3369");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a1" + "'", str11, "100a1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1" + "'", str13, "100a1");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3370");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3371");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("             10410497              ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3372");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a1" + "'", str11, "-1a1");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3373");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 102, (int) (short) -1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#0#1#0" + "'", str15, "-1#0#1#0");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3374");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 3, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 34, 880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3375");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1143, 15, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1143 + "'", int3 == 1143);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3376");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, 0.0f, (float) 45);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3377");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1#1" + "'", str17, "-1#1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3378");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1404140" + "'", str7, "-1404140");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3379");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("          .0a5-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3380");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.04", (long) 44);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 44L + "'", long2 == 44L);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3381");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3382");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3383");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3384");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 104, 17);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 101, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 9, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3385");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1-110010-1.0true-1-11000.0##########...", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3386");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 100, 53);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 82, 492);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 82");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3387");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4849");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3388");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3389");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 119, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3390");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 0, 169);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 169 + "'", int3 == 169);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3391");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...2.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52....");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3392");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) '4', 880);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3393");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a #a #a #a #a -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3394");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 25, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float22 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0.0" + "'", str21, "0.0");
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0.0" + "'", str24, "0.0");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3395");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0-14-140410", (double) 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.0d + "'", double2 == 25.0d);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.010.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3397");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3398");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, 9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                          aa                                           ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                           aa                                           ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3399");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A                                                                                             -1A1##", 19L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 19L + "'", long2 == 19L);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3400");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#100#0#10" + "'", str15, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3401");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(47, 80, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3402");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3403");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##A#A#A###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.#A52.###.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3405");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#########################################0.##40.0#40.00#######-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########################################0.##40.0#40.00#######-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3406");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3407");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 95, 821);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3408");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("9752.0102", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9752.01f + "'", float2 == 9752.01f);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3409");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(94, 0, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3410");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3411");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(15, 75, 252);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 252 + "'", int3 == 252);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3412");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1 -1 100 #                                                                                             -1#1##", (long) 2560);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2560L + "'", long2 == 2560L);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3413");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                        #A #A #A #A #A #A...", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3414");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 72, (float) 18, (float) 676);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 18.0f + "'", float3 == 18.0f);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3415");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3416");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1297, (long) 11, (long) 492);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1297L + "'", long3 == 1297L);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3417");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3418");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4141410L, (float) 49L, (float) 162);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 49.0f + "'", float3 == 49.0f);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3419");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                        #A #A #A #A #A #A...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3420");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(163L, 104L, 57L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 57L + "'", long3 == 57L);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 1-1 -1 100 10 -1.0 true-1 -1 100 -1.-1 -1 100 10 -1.0 true-1 -1 100 TRUE-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 A                                                                                             -1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3422");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, 0);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 1297, 67);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3423");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2.0f, 31.0d, (double) 68.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 68.0d + "'", double3 == 68.0d);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3424");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3425");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 0, (double) 41.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3426");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444... #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3427");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3428");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 51, (int) (short) 10);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 3, 2);
        short short27 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0#1#1#10" + "'", str17, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + short27 + "' != '" + (short) 10 + "'", short27 == (short) 10);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3429");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0##02... ## ## ## #97##00##0#0#0-14-140410");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3430");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 7, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3431");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4.0d, (double) 56L, (double) 4);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3432");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 29, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 55, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 124, 2560);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 124");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3433");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 22.0f, (double) 188.0f, (double) 3224L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3224.0d + "'", double3 == 3224.0d);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3434");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1 -1 100 10 -1.0 true-1 -1 100 a#-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100 a#-1 -1 100 10 -1.0 true-1 -1 100 ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3435");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3436");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3437");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A4#4A0a1a1a100a1a1a100a1a1a10.0a1a1a100a1a1a100a1a1a100...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A4#4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3438");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 140, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3439");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 53, 8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 18, 144);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3440");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100.0   44444444  44444444  44444444  44444444 0#1#1#0#1#1100.0 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0   444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3441");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(65.0d, (double) 44L, (double) 27);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 27.0d + "'", double3 == 27.0d);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a5210a5297\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3443");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 455, 42);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3444");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 90, (float) 91);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3445");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, 9);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "104-1" + "'", str11, "104-1");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3446");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 871, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 22, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a52.0" + "'", str12, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0452.0" + "'", str14, "-1.0452.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 52.0" + "'", str16, "-1.0 52.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a52.0" + "'", str18, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3447");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3448");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                       ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3449");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3450");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-.1a52.-----------------------------------------------------------------------------------------------a-", 33.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 33.0d + "'", double2 == 33.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3451");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 23, 20);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3452");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0#10.0#-1.0" + "'", str18, "100.0#10.0#-1.0");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a###a          .0 52.0          .0 52.0          .0 52.0          .0 52.0          .0 52.0       0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a###a          .0 52.0          .0 52.0          .0 52.0          .0 52.0          .0 52.0       0#1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3454");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3455");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 96, (long) 100, 5L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3456");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AA                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3457");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, (int) '4', 1151);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3458");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3459");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 15, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10041" + "'", str18, "10041");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3460");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                             44a4aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa", (long) 3224);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 3224L + "'", long2 == 3224L);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3461");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3462");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("01A0A0A01A001A79# A# A# A# A# A# A# A# A# A# A0.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3463");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 102, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 19, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0 0.0" + "'", str13, "0.0 0.0");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 65, (float) 26, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3465");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 ", (double) 48L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.0d + "'", double2 == 48.0d);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3466");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#0#1#0\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#-1 -1 100 10 -1.0 true-1 -1 100", 2560L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2560L + "'", long2 == 2560L);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3467");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0", (short) -141);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -141 + "'", short2 == (short) -141);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3468");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3469");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                              10041                                                            10041                                                            10041                                                         10 5210 5297                                              10041                                                            10041                                                            10041                                                          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3470");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 8, (double) (-1), (double) 41);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3471");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 489, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 489 + "'", int3 == 489);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3472");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 10.0 -1.0" + "'", str8, "100.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3473");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("############################################################################################################################################################################################################################", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3474");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 1098504L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3475");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("             10410497                              a #", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3476");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 16, 11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long23 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long26 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#0#1#0" + "'", str20, "-1#0#1#0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 0 1 0" + "'", str22, "-1 0 1 0");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1404140" + "'", str25, "-1404140");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3477");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3478");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a-1.0" + "'", str10, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3479");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("true-1 -1 100 #                                                                                             -1#1#################################################################################################          ##########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3480");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3481");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 95, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3482");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97    -1.0A52.0    ####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n52.0    -1.0A52.0    ####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n102");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3483");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3484");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 42, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97410041040404102" + "'", str15, "97410041040404102");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1458, 55, 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1458 + "'", int3 == 1458);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3486");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3487");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ##        ", (double) 22);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.0d + "'", double2 == 22.0d);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3488");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 104, 867);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10#1#100#0#10" + "'", str19, "10#1#100#0#10");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3489");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                        ...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3490");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 45, 676);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 676 + "'", int3 == 676);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#####################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3492");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(48, 9, 2881);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2881 + "'", int3 == 2881);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3493");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 188, 90);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 162, 1098504);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 162");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.040.0" + "'", str12, "0.040.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3494");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 163, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10#10#97" + "'", str11, "10#10#97");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3495");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("....25a0.1-0.25a0.1-0.25a0.1-0.25a0.1-0.25a0.1-0.2...aaaaaaaaaaaaaaaaaaaa0.25a0.1-                                                    aaaaaaaaaaaaaaaaaaa001####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3496");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 77, 75);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97410041040404102" + "'", str15, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3497");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1458.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1458.0f + "'", float2 == 1458.0f);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a  A 001 1- 1-EURT 0.1- 01 001 1- 1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a  A 001 1- 1-EURT 0.1- 01 001 1- 1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3499");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 60, 54);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, 8);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 86, 40);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', (int) '4', 18);
        short short33 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100#1" + "'", str28, "100#1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + short33 + "' != '" + (short) 1 + "'", short33 == (short) 1);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest6.test3500");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 86, (float) 97, (float) 54);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 54.0f + "'", float3 == 54.0f);
    }
}

