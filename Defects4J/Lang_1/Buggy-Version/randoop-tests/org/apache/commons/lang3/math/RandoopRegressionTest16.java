package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08001");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 716, (float) 409, (float) 231L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 231.0f + "'", float3 == 231.0f);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08002");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08003");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08004");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("44444444444444444444444                  10a-1a100a100a1                   444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (float) 176);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 176.0f + "'", float2 == 176.0f);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08005");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 4393L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4393.0f + "'", float2 == 4393.0f);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08006");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10.04100.040.0497.0410.0" + "'", str19, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08007");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                       ", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08008");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) 0.0f, (double) 39L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08009");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("01011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111i!                  10#-1#100#10", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08010");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 99);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 99L + "'", long2 == 99L);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08011");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 370, (long) 409, (long) 875);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 370L + "'", long3 == 370L);
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08012");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (-1), 1379);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08013");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08015");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 231, 4393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4393 + "'", int3 == 4393);
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08016");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1749, (float) 70L, 416.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 70.0f + "'", float3 == 70.0f);
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08017");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(409.0f, 176.0f, (float) 76);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 409.0f + "'", float3 == 409.0f);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08018");
        float[] floatArray5 = new float[] { (byte) 0, '#', (-1L), 10, (short) -1 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, 35.0, -1.0, 10.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a35.0a-1.0a10.0a-1.0" + "'", str10, "0.0a35.0a-1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 35.0f + "'", float12 == 35.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 35.0f + "'", float13 == 35.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08019");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08020");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08021");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 509, 543);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 509");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08022");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                               aA#AAA#44a                                                                                             #4                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08023");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1#001#001#1-#011#001#001#1-#01!IH!IH!IHHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08024");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("######################################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08025");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) '4', (int) (short) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 390, 127);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08026");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08027");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08028");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08029");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08030");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0a0.001a0.01a0.1-a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08031");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-140), 3072.0f, (float) 1379);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08032");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 84, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 84");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1" + "'", str14, "10a-1");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08033");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08034");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08035");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104-1" + "'", str9, "104-1");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08036");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                       #!IHA#A#A#A!IHA#A#A#!IHA#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08037");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08038");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08039");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("i!        ", (float) 588);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 588.0f + "'", float2 == 588.0f);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08040");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, 588);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08041");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08042");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08043");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                                                                                                                                                                                                                                             10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                                                              10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
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
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08044");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#4a4#4a44444444444444444444444444441#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ihaaaaaaa!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih      1#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih!ih001#001#1-#1-aaaaa!ihaaaaaaaaaaaa!ihAA#AAA                                                                                              !ihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08045");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 520, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08046");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 4393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4393 + "'", int2 == 4393);
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08047");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a-1.0" + "'", str7, "100.0a-1.0");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1                  #100#100#-1#1                  HI!                  10#100#100#-1#1                  HI!AAAAAAA                  10#100#100#-1#1                                    10#100#100#-1#HI!                  10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1                  #100#100#-1#1                  HI!                  10#100#100#-1#1                  HI!AAAAAAA                  10#100#100#-1#1                                    10#100#100#-1#HI!                  10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08049");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-14-141004100" + "'", str8, "-14-141004100");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08050");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08051");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hI!HI!HI!10#-1#100#100#110#-1#100#100#1!ih!ih!ih!ih!a4a44!ih!ih!ih!ih!", 4393);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4393 + "'", int2 == 4393);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                 HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!                 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.1-40.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-40.00aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08054");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08055");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 100, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 127, 265);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-140" + "'", str9, "-140");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#0" + "'", str15, "-1#0");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08056");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 751, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08057");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 99, (long) (short) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08058");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.a0.1-a0.01a0.001a44444444444444444444444444444444444444444444444444444444444444444444444444444444444440.0hi!## ## hi!aaaaaaa## hi!##");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08059");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08060");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(365, 164, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08062");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!                                                                                              AAA#AAHI!AAAAAAAAAAAAHI!AAAAA4-1410041004", (float) 220);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 220.0f + "'", float2 == 220.0f);
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 1 100 100 10 100 .0 -1. hi! aaa#aahi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 .0 -1. .0 -1. .0 -1. .0 -1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 1 100 100 10 100 .0 -1. hi! aaa#aahi!aaaaaaaaaaaahi!aaaaa-1#-1#100#100hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaahi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 hi!hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1 .0 -1. .0 -1. .0 -1. .0 -1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08064");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!h1004-141410040");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08065");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 127, (double) 1758, 383.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1758.0d + "'", double3 == 1758.0d);
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08066");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1#10#1#100#10044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1#10#1#100#10044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08068");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 410, 231L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 410L + "'", long3 == 410L);
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08069");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(84.0f, 1758.0f, (float) 370);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 84.0f + "'", float3 == 84.0f);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08070");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3072, 10);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 1758, 195);
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08071");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08072");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#######################################################################################################################################################################4#44a ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!10041104-14100410041104-14100410041104-1...                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08073");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str13, "0.04-1.0410.04100.040.0");
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08074");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4440L, (float) 515, (float) 588);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 515.0f + "'", float3 == 515.0f);
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08075");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4163, (float) 716L, (float) 1379);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 716.0f + "'", float3 == 716.0f);
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08076");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a100.0a10.0a-1.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a100.0a10.0a-1.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08078");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 370, (long) 231);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 370L + "'", long3 == 370L);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08079");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 416, (float) 180);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08080");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.04-1.041HI!HI!HI!HI!H#4#44HI!HI!HI!HI!H0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08081");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#4#44                                                                                             #AAA#AA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08082");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...0041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi...", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08083");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray4, '#', (int) (short) 100, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08084");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                              aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#                                                                                   ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08085");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                             #aaa#aa", (float) (-1));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08086");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi4!4hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08087");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#AAA#AA0.0A-1.0A10.0A100.0A0.0.1-#0.0010.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08088");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "104-14100410041" + "'", str20, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08089");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("# a a a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08090");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 151, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08091");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1" + "'", str12, "10 -1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a-1" + "'", str15, "10a-1");
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08092");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4163, (long) ' ', (long) 127);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08093");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 392, 175L, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 392L + "'", long3 == 392L);
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08094");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(231.0d, (double) 175, 3072.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 175.0d + "'", double3 == 175.0d);
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08095");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("H!IH!IH!IH!IH44#4#H!IH!IH!IH!IH", (long) 517);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 517L + "'", long2 == 517L);
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08096");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-14100410041" + "'", str14, "104-14100410041");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 -1 100 100 1" + "'", str16, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08097");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 39, (long) (byte) 1, (long) 1662);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1662L + "'", long3 == 1662L);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08098");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 1, (float) 370L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08099");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10.04-1.041a100a100a-1a                                                                                             #AAA#AA10a#4#44");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08100");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a  a#a4a a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08102");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str13, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str15, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08103");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str16, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 100.0f + "'", float17 == 100.0f);
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08104");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 108, 176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
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
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08105");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 716, (long) 100, (long) 244);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 716L + "'", long3 == 716L);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08106");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HHI!HI!AAAAAAAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1!IH");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08107");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444-1 04444444444444444444444444444444444444444444444441.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.01.0#100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08108");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(131.0f, (float) 129L, (float) 751);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 751.0f + "'", float3 == 751.0f);
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08109");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#", (double) 168L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 168.0d + "'", double2 == 168.0d);
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08110");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08111");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!aaaaaaa", "hi!", "" };
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.prependIfMissing("hi!aaaaaaa", (java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "#aaa#aa");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        byte[] byteArray20 = new byte[] { (byte) -1, (byte) 0 };
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray20);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray20);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray20);
        java.lang.Object[] objArray24 = new java.lang.Object[] { strArray16, "0.04-1.0410.04100.040.0", byteArray20 };
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, "hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (int) (short) 0, 0);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, 'a', (int) '#', (int) (short) 1);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.appendIfMissing("0.0-1.010.0100.00.0", (java.lang.CharSequence) "44a                       ...#4", (java.lang.CharSequence[]) strArray16);
        java.lang.String str34 = org.apache.commons.lang3.StringUtils.prependIfMissingIgnoreCase("aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                ", (java.lang.CharSequence) "hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaahi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1", (java.lang.CharSequence[]) strArray16);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!aaaaaaa" + "'", str13, "hi!aaaaaaa");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(byteArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray20), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[hi!, , hi!aaaaaaa, hi!, ], 0.04-1.0410.04100.040.0, [-1, 0]]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "0.0-1.010.0100.00.0" + "'", str33, "0.0-1.010.0100.00.0");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str34, "aaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08112");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1#10#1#100#10044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08113");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 195, (float) 151, 93.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 195.0f + "'", float3 == 195.0f);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08114");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!AAA#AAHI!AAAAAAAAAAAAHI!AAAAA###HI!HI!HI!HI!########HI!HI!HI!########HI!AAAAAAAHI!HI!HI!########HI!HI!HI!HI!########", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08115");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08116");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih0000000!ih", 70.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 70.0f + "'", float2 == 70.0f);
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08117");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!", 70.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 70.0f + "'", float2 == 70.0f);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08118");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0#1                                     10#-1#100#100#1      !IH!IH!IH!IH!A4A44!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08119");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1857, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08120");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int26 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#### #A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"### #A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08122");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "#######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #######################################################################################################################################################################4#44A ...AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08123");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08124");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08125");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(108L, (long) 383, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 93L + "'", long3 == 93L);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08126");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2648, (double) 1857.0f, (double) 4440.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1857.0d + "'", double3 == 1857.0d);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08127");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10#-1#100#100#1" + "'", str23, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10a-1a100a100a1" + "'", str25, "10a-1a100a100a1");
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08128");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a100.0a10.0a-1.0a0.0", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08129");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 39, (double) 164);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08130");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 549L, (double) 1749, (double) 520L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 520.0d + "'", double3 == 520.0d);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08131");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaa444444444444444444444444441.0#100.0Class [Bclass [Ljava.lang.String;class [Daaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08132");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08133");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 3072, 176);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08134");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (double) 3072);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3072.0d + "'", double2 == 3072.0d);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(3068L, (long) 291, 517L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 291L + "'", long3 == 291L);
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08136");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08137");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 151, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 151");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08138");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0 -1.0hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0a100.0a0.0Hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a100.0a0.0Hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08140");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) -1, 716);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10.04100.040.0497.0410.0" + "'", str19, "10.04100.040.0497.0410.0");
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08142");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 549.0f, (double) 129.0f, (double) 3068.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 129.0d + "'", double3 == 129.0d);
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08143");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                              aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#                                                                                   AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AAHI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!AAAAAAAHI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1 HI!HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08144");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104-14100410041" + "'", str19, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08145");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0a100.0a0.0Hi!hi!hi!                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08146");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!44hi!4hi!4                                                                                                    hi!44hi!4hi!4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08147");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 244, 383L, (long) 168);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 168L + "'", long3 == 168L);
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08148");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08149");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08150");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 291, (int) '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08151");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08152");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0#-1.0#10.0#100.0#0.044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08153");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, 220, 3068);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08154");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-1.0#10.0#-1.00.0#35.0#-11#001#001#1-#01                                     1#001#001#1-#01                  !ih!ih!ih0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-14hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!1.040.040.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08155");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 3072, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (short) -1, 3068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08156");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "104-1" + "'", str7, "104-1");
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08157");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str8, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08158");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str17, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08159");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#');
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0#100.0#0.0#97.0#10.0" + "'", str16, "10.0#100.0#0.0#97.0#10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08160");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray4, 'a', 176, 131);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08161");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.040.041.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08162");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 410, (int) '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0#0.0#0.0" + "'", str17, "1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08163");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0a100a100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08164");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(176L, (long) 39, (long) 588);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 588L + "'", long3 == 588L);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08165");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(416, 171, 231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 416 + "'", int3 == 416);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08166");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("Hi!hi!hi!10041104-14100410041104-141004#4#4 4aa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08168");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10.04-1.041a100a100a-1a                                                                                             #AAA#AA10a#4#441                  #100#100#-1#1                  hi!                  10#100#100#-1#1                  hi!aaaaaaa                  10#100#100#-1#1                                    10#100#100#-1#hi!                  104!ih4!ih44!ih", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08169");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(70, 70, 517);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 517 + "'", int3 == 517);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08170");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 108, (-1));
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 253, 180);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str10, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08171");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAA########################                 10#-1#100#100#1                   #########################aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAA", 253L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 253L + "'", long2 == 253L);
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08172");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                  10#-1#100#100#1                   104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08173");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08174");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #   #44#4# #A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08175");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("Hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hi!hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08176");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!HI!HI!10#-1#100#100#110#-1#100#100#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08177");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             #AAA#AA0.0A-1.0A10.0A100.0A0.0.1-#0.0010.1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08178");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.04-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08179");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, (int) (short) 1, 180);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 180 + "'", int3 == 180);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08180");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 585, 4440.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4440.0d + "'", double3 == 4440.0d);
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08181");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...0041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08182");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 553, (int) (byte) 100);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1758, (int) 'a');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 -1.0 10.0 100.0 0.0" + "'", str12, "0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str16, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08183");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 409L, (double) 0, (double) 416L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 416.0d + "'", double3 == 416.0d);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08184");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!                                                               AAA#AAHI!AAAAAAAAAAAAHI!AAAAA-1#-1#100#100HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!AAAAAAAHI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08185");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 291);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 291.0d + "'", double2 == 291.0d);
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08186");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 1.0f + "'", float4 == 1.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0#100.0" + "'", str9, "1.0#100.0");
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08187");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                             #AAA#AA0.0A-1.0A10.0A100.0A0.0.1-#0.0010.1");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        char[] charArray6 = new char[] { 'a' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             !ih!ih!ih0.1- 0.001", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0.0a-1.0a10.0a100.0a0.0", "", (int) (byte) 100);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "100.0 ", (java.lang.CharSequence[]) strArray14);
        java.lang.Class<?> wildcardClass16 = strArray14.getClass();
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1004-141410040", 'a');
        java.lang.Class<?> wildcardClass20 = strArray19.getClass();
        int[] intArray26 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray26, '#');
        int int29 = org.apache.commons.lang3.math.NumberUtils.max(intArray26);
        int int30 = org.apache.commons.lang3.math.NumberUtils.max(intArray26);
        int int31 = org.apache.commons.lang3.math.NumberUtils.min(intArray26);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(intArray26, '#');
        java.lang.Class<?> wildcardClass34 = intArray26.getClass();
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray35 = new java.lang.reflect.AnnotatedElement[][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray36 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray35 };
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray36);
        java.lang.Class<?> wildcardClass38 = annotatedElementArray36.getClass();
        java.lang.reflect.Type[] typeArray39 = new java.lang.reflect.Type[] { wildcardClass2, wildcardClass9, wildcardClass16, wildcardClass20, wildcardClass34, wildcardClass38 };
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(typeArray39);
        java.lang.Class<?> wildcardClass41 = typeArray39.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "10#-1#100#100#1" + "'", str28, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10#-1#100#100#1" + "'", str33, "10#-1#100#100#1");
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(annotatedElementArray35);
        org.junit.Assert.assertNotNull(annotatedElementArray36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Iclass [[[Ljava.lang.reflect.AnnotatedElement;" + "'", str40, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Iclass [[[Ljava.lang.reflect.AnnotatedElement;");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0a100a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a100a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(539, 10, 410);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 539 + "'", int3 == 539);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08190");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 253, 231);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', (int) '4', 180);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str8, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.04100.040.0497.0410.0" + "'", str10, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str12, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08191");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int24 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 131, (int) ' ');
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "10a-1a100a100a1" + "'", str23, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08192");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 0, (float) 647, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08193");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08194");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) ' ', 0);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, '#');
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#100#100" + "'", str13, "0#100#100");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0#100#100" + "'", str16, "0#100#100");
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08195");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(416L, (long) 588, (long) 127);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 127L + "'", long3 == 127L);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08196");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 1758, (int) '#');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.04100.040.0497.0410.0" + "'", str10, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08197");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 520L, (float) 1662, 553.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08198");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!aaaaaaa                      ", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08199");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3072, 10);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 1758, 195);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) '4', (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08200");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08201");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 751, 0L, 231L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08202");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', 1, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 108, 151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 108");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0 100 100" + "'", str10, "0 100 100");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08203");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a4#a4#4a   # #a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaa444444444444444444444444441.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08205");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaaaaaaaaaa444444444444444444444444441.0#100.0Class [Bcl                                    0.0A-1.0A10.0A100.0A0.0                                                ", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08206");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...0 100 1", (double) 180L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 180.0d + "'", double2 == 180.0d);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08207");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0 -1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08208");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!HI!HI!HI!H444HI!HI!HI!HI!Haa#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!Hi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aahi!aaaaaaaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#aaHi!#aaa#aahi!#aaa#aahi!aaaaaaa#aaa#aa#aaa#01                  !IH!IH!IHhi!Hi!#1-#001#001#01                                     1#1-#001#001#     1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08209");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 -1 100 100 1" + "'", str9, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a-1a100a100a1" + "'", str11, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("...# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08211");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0435.04-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08212");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) '4', (int) '#');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08213");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!44hi!4hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08214");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!ih1#001#001#1-#011#001#001#1-#01!IH!IH!IHHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!AAAAAAAHI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AAHI!HI!#AAA#AA#AAA#AAHI!AAAAAAA#AAA#AAHI!#AAA#AA", 3068.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3068.0d + "'", double2 == 3068.0d);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08215");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 1758, (int) (short) 100);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 129, 4163);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 129");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08216");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08217");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3068, (int) (byte) 0, 253);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08218");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(253, 365, 1758);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1758 + "'", int3 == 1758);
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08219");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 195L, (float) 383L, (float) 517);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 195.0f + "'", float3 == 195.0f);
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08220");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 399);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 399 + "'", int2 == 399);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08221");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(180.0d, 10.0d, 416.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08222");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    10.0A100.0A0.0A97.0A10.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08223");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08224");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 180.0f, (double) 751L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08225");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 585, (long) 353, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08226");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08227");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1 100 100 1" + "'", str12, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a-1a100a100a1" + "'", str14, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08228");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 195, 509);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("class [Iclass [Bclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08230");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("##############################hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h##############################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08231");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a-1....##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08232");
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
        int int28 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08233");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08234");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 108L, 151.0f, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 151.0f + "'", float3 == 151.0f);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08235");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) 716.0f, (double) 129);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08236");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 99.0f, (double) 3072L, (double) 716.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 99.0d + "'", double3 == 99.0d);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08237");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A#4A4#4A# #   A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AA#AAA#                                                                                             a44#4#0.0a0.001a0.01a0.1-a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AA#AAA#                                                                                             a44#4#0.0a0.001a0.01a0.1-a0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08239");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08240");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi! 10#-1#100#100#1 10#-1#100#100#1 hi!aaaaaaa 10#-1#100#100#1 hi! 10#-1#100#100#1 HI!HI!HI! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!hi!hi!Hi!hi!hi!hi!Hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!Hi!hi!hi!hi!Hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08243");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, 231L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 231L + "'", long3 == 231L);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08244");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                  ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08245");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi! 10#-1#100#100#1 10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08246");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(553L, (long) 93, (long) 168);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 93L + "'", long3 == 93L);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08247");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08248");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 291, 399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 291");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a-1a100a100a1" + "'", str21, "10a-1a100a100a1");
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08249");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) '4', 231);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08250");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08251");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#-1" + "'", str16, "10#-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08252");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str14, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str16, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08253");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08254");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             #AAA#AA0.0A-1.0A10.0A100.0A0.0.1-#0.0010.1", 410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 410 + "'", int2 == 410);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08255");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 231L, 151L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08256");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#", 409);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 409 + "'", int2 == 409);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08257");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 168L, (float) 520L, (float) 231L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08258");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) -1, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 100, 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double22 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double23 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str21, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08259");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1749, (int) (byte) -1);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1#100#100#1" + "'", str20, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10 -1 100 100 1" + "'", str26, "10 -1 100 100 1");
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10a-1a100a100a10.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08261");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("444444444444444444444444444444444444444444444440.001#0.14444444444444444aaaaaaa!ih44444444444444444444444444444444444444444444444i!                  10#-1#100#100.0A-1.0A10.0A100.0A0.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08262");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08264");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40", 291);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 291 + "'", int2 == 291);
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08265");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1852L, (float) 520L, (float) 543L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08266");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           100.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.01000.0#-1.0#10.0#100.0#0.0a0.0#-1.0#10.0#100.0#0.0100.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0040.0#-1.0#10.0#100.0#0.0-0.0#-1.0#10.0#100.0#0.010.0#-1.0#10.0#100.0#0.0.0.0#-1.0#10.0#100.0#0.0041                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08267");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0A100.0A0.0.1-#0.0010.1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08268");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1, (float) (short) 1, 3068.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08269");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08270");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h!ih!ih!ih!ih!ih!ih!ih!ih!ih!i\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08272");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa4aaa#aa.aaa#aa.aaa#aa.aaa#aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08273");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("176.0#3072.0#176.0", (float) 383L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 383.0f + "'", float2 == 383.0f);
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08274");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444#########################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08275");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08276");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0 1 35 0 1 -aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08277");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08278");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 370, 244);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08279");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 151, 172);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 151");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08280");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1749, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#-1#100#100#1" + "'", str20, "10#-1#100#100#1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08281");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0 100 -1 0 10 10", 1379);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1379 + "'", int2 == 1379);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10.0 100.0 0.0 97.0 10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0 100.0 0.0 97.0 10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08283");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(353, 180, 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08284");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str11, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str14, "0.0#-1.0#10.0#100.0#0.0");
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08285");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#1001.0A100.00#100#100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08286");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 409L, 0.0f, (float) 131L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08287");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08288");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08289");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("i!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      !IH!IH!IH!IH!A4A44!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08290");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           0 -1hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08291");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 100, 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08292");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("########################10#-1#100#100#1#########################10.0a100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08293");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08294");
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
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1#0" + "'", str18, "-1#0");
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08295");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
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
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08296");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#-1#100#100#1" + "'", str16, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08297");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1662, 647, 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1662 + "'", int3 == 1662);
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08298");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 520);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 520 + "'", int2 == 520);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08299");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 515, (double) (byte) 10, (double) 399);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08300");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
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
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08301");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 1857, 1749);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100 -1 1 100 0" + "'", str10, "100 -1 1 100 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08302");
        short[] shortArray4 = new short[] { (byte) 100, (byte) -1, (byte) 100, (byte) 0 };
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08303");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 539);
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
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08304");
        int[] intArray6 = new int[] { 0, (short) 1, '#', (short) 0, (short) 1, (-1) };
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 1, 35, 0, 1, -1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "04143540414-1" + "'", str14, "04143540414-1");
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08305");
        float[] floatArray1 = new float[] { 10 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 10, 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[10.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0" + "'", str7, "10.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08306");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ##########################################################################################################################################################################################################################################################################################################################################################################################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08307");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("i");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08308");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08309");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08310");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, (int) (short) 1);
        int int22 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08311");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("# #   a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# #   a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08312");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1#HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08313");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: h!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08314");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1#HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1-1#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1#HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1-1#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08315");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 130, 164L, 93L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 164L + "'", long3 == 164L);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08316");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(416.0f, (float) 409, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08317");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                   #AAA#AA                                                                                   #AAA#AA                              10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11HI!HI!HI!                                                                                   #AAA#AA                                                                                   #AAA#AA                              ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08318");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("!!!!i!hhi!hi!hi!Hi!hi!hi!hi!Hi!hi!", (long) 195);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195L + "'", long2 == 195L);
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("######################################################################## # a####################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08320");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-14044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444444444hi!44hi!4hi!4", (float) 129L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 129.0f + "'", float2 == 129.0f);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08321");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1" + "'", str17, "1");
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08322");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(39, 353, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 353 + "'", int3 == 353);
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08323");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08324");
        short[] shortArray5 = new short[] { (byte) -1, (short) 10, (byte) 1, (short) 100, (short) 100 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#', 716, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, ' ', 1379, (int) (short) 10);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray5, '4', 1857, 751);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[-1, 10, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08325");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(195.0f, (float) 509, (float) 392L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 195.0f + "'", float3 == 195.0f);
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08327");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##A#4A4#4A##", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08328");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (double) 0, (double) 253);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08329");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 365, (double) 93.0f, (double) 3068);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08330");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08331");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, (long) 588, 588L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08332");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1857.0f, (double) 180L, (double) 588L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1857.0d + "'", double3 == 1857.0d);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08333");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08334");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 99, (int) (short) 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 553, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', (int) (short) 0, 517);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08335");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 0" + "'", str7, "-1 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08336");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (short) 10, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08337");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, (float) 265, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08338");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a4#a4#4a##a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!##########################################################################################0.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08340");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441.0100.0#-1.0.0A0.001A0.01A0.1-A0.0AA#AAA#                                                                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08341");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 70, (int) (byte) 10);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08342");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 520, (int) (short) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) '4', 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str18, "10.0a100.0a0.0a97.0a10.0");
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!HI!HI!                  10#-1#100#100#1                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: HI!HI!HI!                  10#-1#100#100#1                                      is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08344");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08345");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 615);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 615.0d + "'", double2 == 615.0d);
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08346");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, 588.0f, (float) 509);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08347");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 39, (double) (short) 100, (double) 164L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 164.0d + "'", double3 == 164.0d);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08348");
        long[] longArray1 = new long[] { (short) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', 410, 70);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1758, 353);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08349");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.04-1.0444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08350");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10100AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA#AAA#AA.AAA#AA.AAA#AA.AAA#AA44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!44444444444444444444444444444444444444444444444444444444444444444444444444444hi!aahi!aaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1401.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08352");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!                          ...", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08353");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#AAAAAAA#100.0 -1.0                                                                                         ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08354");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 410L, 507.0f, 515.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 515.0f + "'", float3 == 515.0f);
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08355");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 168, (float) 108, (float) 716L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 716.0f + "'", float3 == 716.0f);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08356");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10 10 0 -1 100                                                                                   ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08357");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 365, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (int) (byte) -1, 3068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08358");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
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
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str19, "0.0a-1.0a10.0a100.0a0.0");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08359");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#100#100#1" + "'", str12, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08360");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11HI!HI!HI!####################################################################################################0.04-1.041hi!hi!hi!hi!h#4#44hi!hi!hi!hi!h0.04-1.0410.04100.040.0#####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08361");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                            0.0 -1....                                             ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08362");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(129.0d, (double) 253L, (double) 515);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 515.0d + "'", double3 == 515.0d);
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08363");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 520, (int) ' ');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08364");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 4440, 4393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08365");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08366");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08367");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("# a # a10a-1a100a100a1# a # a10a-1a100a100a1# a # a10a-1a100a4 4hi!hi!hi!hi!h#4#0.04-1.041hi!hi!hi!hi!h# a # a10a-1a100a100a1# a # a10a-1a100a100a1# a # a10a-1a100a", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08368");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08369");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                   #aaa#aa                  ", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08370");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(382, (int) '#', 647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 647 + "'", int3 == 647);
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08371");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (short) 100, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 0, (-140));
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) (byte) 0, 220);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#-1" + "'", str16, "10#-1");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 10L + "'", long17 == 10L);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08372");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-...!IH0 1-..00.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.0 -1.000.-140");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08373");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 549, 615);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 615 + "'", int3 == 615);
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08374");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1                  #100#100#-1#1                  hi!                  10#100#100#-1#1                  hi!                  10#100#100#-1#1                                    10#100#100#-1#hi!                  10                                                HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!H                                                 14-1.040.0", 1379L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1379L + "'", long2 == 1379L);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08375");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(399, 129, 108);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 399 + "'", int3 == 399);
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08376");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                      hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa", (long) 588);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 588L + "'", long2 == 588L);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08377");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("     1#001#001#1-#01                                     1#001#001#1-#01                  ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!10#-1#100#100#110#-1#100#100#1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10#-1#100#100#110#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08379");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.04100.040.0497.0410.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08380");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!                                                                                              aaa#aaHI!AAAAAAAAAAAAHI!AAAAA4-1410041004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08381");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.Class<?> wildcardClass14 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08382");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', 176, 409);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 176");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141410041004104100" + "'", str9, "-141410041004104100");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-141410041004104100" + "'", str12, "-141410041004104100");
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08383");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IHAAAAAAA!IH", 10.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 00a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a1.0a100.0hi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!hi!hi!100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a110a-1a100a100a11hi!hi!hi!hi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa#a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08385");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
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
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08386");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 -1.0" + "'", str11, "100.0 -1.0");
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08387");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08388");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', (-140), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -140");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08389");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ', (int) ' ', 0);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08390");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.04100.040.0497.0410.0" + "'", str10, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08391");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(171, (-1), 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08392");
        float[] floatArray3 = new float[] { (byte) 0, (byte) 1, (-1.0f) };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 93, 1758);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0#1.0#-1.0" + "'", str7, "0.0#1.0#-1.0");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08393");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                          1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08394");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#4#44a ...hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08395");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 100.0f, (double) 231L, (double) 416L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08396");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', 370, 1857);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 370");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                   #aaa#aa                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08398");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08399");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08400");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08401");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 175.0f, (-140.0d), (double) 459);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140.0d) + "'", double3 == (-140.0d));
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" ...a#4#44AA4AAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" ...a#4#44AA4AAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08403");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 515.0f, (double) 265, 416.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 265.0d + "'", double3 == 265.0d);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08404");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1662, (float) 108, (float) 520L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 108.0f + "'", float3 == 108.0f);
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08405");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 3072, 10);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 875, 265);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08406");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ...aaaaaaaaaaaaaaahi!hi!hi!                  10#-1#100#100#1                         ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08407");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 108, (int) ' ');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08408");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(108.0d, (double) 778, (double) 382);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 778.0d + "'", double3 == 778.0d);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08409");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (short) 100, (int) (byte) 0);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08410");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', (int) (short) 10, (int) (byte) 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '#', 778, 1657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 778");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1" + "'", str7, "10#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 -1" + "'", str13, "10 -1");
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08411");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(231, 175, 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 70 + "'", int3 == 70);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08412");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                            ## ## ### ### #                         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08413");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08414");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 615, (long) 39, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08415");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08416");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 180L, (float) 200, (float) 176L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 200.0f + "'", float3 == 200.0f);
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08417");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 76, 1852);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 76");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08418");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#-1#100#100#1###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08419");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#### #a");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        char[] charArray7 = new char[] { 'a' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             !ih!ih!ih0.1- 0.001", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        java.lang.Number number12 = org.apache.commons.lang3.math.NumberUtils.createNumber("01011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111404440440101114044404401011140444044010111");
        java.lang.Class<?> wildcardClass13 = number12.getClass();
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("0.0a-1.0a10.0a100.0a0.0#4#44a                                                                                             #AAA#AA", "");
        java.lang.Class<?> wildcardClass17 = strArray16.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray18 = new java.lang.reflect.AnnotatedElement[] { wildcardClass3, wildcardClass10, wildcardClass13, wildcardClass17 };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(number12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(annotatedElementArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;class [Cclass java.math.BigIntegerclass [Ljava.lang.String;" + "'", str19, "class [Ljava.lang.String;class [Cclass java.math.BigIntegerclass [Ljava.lang.String;");
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08420");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08421");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 517, 370L, (long) 164);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 517L + "'", long3 == 517L);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08422");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1HI!HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      HI!HI!HI!                  10#-1#100#100#1                           ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# a# #4a#4a4# aaaaaaaaaaaaaaaaaaa#-a#aaa#aaa#aaaa#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08424");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08425");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-141004444444444444444444444444444444444444444444444444-140444444444444444444444444444444444444444444444444hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041004hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa4-1410041", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08426");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#4#4 4", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08427");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a-1" + "'", str7, "10a-1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1" + "'", str10, "10#-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a-1" + "'", str12, "10a-1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08428");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08430");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#-1#100#100hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (float) 3072);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3072.0f + "'", float2 == 3072.0f);
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08431");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "                                                                                                                                                                                                                                                 10.04100.040.0497.0410.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                  10.04100.040.0497.0410.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08432");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 167, (float) 588L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 588.0f + "'", float3 == 588.0f);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08433");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#1#100#0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08434");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 265, (int) (short) 10);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 0, (-1));
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08435");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(175, (int) ' ', 390);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08436");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4440L, (double) 549L, 93.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4440.0d + "'", double3 == 4440.0d);
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08437");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1" + "'", str16, "1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08438");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 3072, (int) (short) 1);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 539, 340);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100 -1 1 100 0" + "'", str25, "100 -1 1 100 0");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08439");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#######################################################################################################################################################################4#44a ...", (float) 615);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 615.0f + "'", float2 == 615.0f);
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08440");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08441");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaa100.0a0.0a97.0a", 410.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 410.0f + "'", float2 == 410.0f);
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08442");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 515, 151);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08443");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 409, 1657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 409");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a-1" + "'", str6, "10a-1");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08444");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                   #AAAAAAA##a#a aa    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08445");
        long[] longArray2 = new long[] { 10L, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10 -1" + "'", str8, "10 -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a-1" + "'", str10, "10a-1");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104-1" + "'", str13, "104-1");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08446");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) (short) 100, 10);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 129, (int) (short) 100);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 0, 459);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "104-14100410041" + "'", str24, "104-14100410041");
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08447");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#################10A-1A100A100A1", 410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 410 + "'", int2 == 410);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08448");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#a#-#1#a#100#a#100#a#10#.#04#-#1#.#041", 1662.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1662.0d + "'", double2 == 1662.0d);
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08449");
        double[] doubleArray3 = new double[] { 1L, (byte) 0, 0L };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 1, (-1));
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 4440, 231);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 0.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.040.040.0" + "'", str16, "1.040.040.0");
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08450");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1662, 0);
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.040.040.0# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #   a#4a4#4a# #1#001#001#1-#011#001#001#1-#01!IH!IH!IHhi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aaHi!#aaa# a # a#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!aaaaaaaHi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aahi!Hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08452");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 10, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 459, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a100.0a0.0a97.0a10.0" + "'", str10, "10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.04100.040.0497.0410.0" + "'", str12, "10.04100.040.0497.0410.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10.0 100.0 0.0 97.0 10.0" + "'", str16, "10.0 100.0 0.0 97.0 10.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08453");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#440.040.041.0 ...a#4#44");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08454");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                              aa#aaa#                                                                                   aa#aaa#                                                                                   !ih!ih!ih11 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 011 001 001 1- 01                              aa#aaa#                                                                                   aa#aaa#                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08455");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0 . 0 a - 1 ....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" . 0 a - 1 ....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08456");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08457");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "104-14100410041" + "'", str18, "104-14100410041");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08458");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 1852, 131);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[100, -1, 1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1004-141410040" + "'", str7, "1004-141410040");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08459");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHI!HI!HI!HI!H##IHI!HI!HI!HI!HIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII!0!.HH.H");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08460");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 716, 10);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 1 + "'", short19 == (short) 1);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08461");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 10, 585);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08462");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) -1, (byte) 100, (byte) 100 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray4, '4', (int) ' ', 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ', 365, 220);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, -1, 100, 100]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08463");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) 0, (byte) -1, (byte) 100, (byte) 0 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4', (int) (short) 100, (int) (byte) 100);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, 'a', 3072, 1662);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray6, '4');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, 0, -1, 100, 0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10410404-1410040" + "'", str17, "10410404-1410040");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08464");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 76, 3072L, (long) 382);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 76L + "'", long3 == 76L);
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08465");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 0, (int) (short) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 0, (-140));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 509, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 509");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08466");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08467");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (short) 100, (int) (short) 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a-1a100a100a1" + "'", str13, "10a-1a100a100a1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a-1a100a100a1" + "'", str20, "10a-1a100a100a1");
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08468");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    10.0A100.0A0.0A97.0A10.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08469");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) (byte) 100, 0);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "...                                                                                                                                                                                                                                                                                                                                             aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAA...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...                                                                                                                                                                                                                                                                                                                                             aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAAAAAAAAAAAAAAHI!AAAAAAAAAAA444444444444444444444444441.0#100.0aAAAAAAAAAAAAAAAAAA#-A#AAA#AAA#AAAAAAAA...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      hi!hi!hi!                  10#-1#100#100#1                           ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08471");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#', 265, 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a', 1857, 1);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0#-1.0#10.0#100.0#0.0" + "'", str15, "0.0#-1.0#10.0#100.0#0.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08472");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0A", (long) 507);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 507L + "'", long2 == 507L);
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08473");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4a#4a# #   a4#4", 1857.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1857.0d + "'", double2 == 1857.0d);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08474");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4-1.041HI!HI!HI!HI!H#4#4 4HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08475");
        int[] intArray4 = new int[] { (-140), 3072, 10, 1758 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray4, '#', 176, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray4, '4', 0, 0);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray4, 'a');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-140, 3072, 10, 1758]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3072 + "'", int13 == 3072);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-140a3072a10a1758" + "'", str15, "-140a3072a10a1758");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0 -1.0 10.0 100.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08477");
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
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray5, '4');
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "104-14100410041" + "'", str29, "104-14100410041");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08478");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08479");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08480");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("..................................................................................................................................................................................................................................................................                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0aa#aaaI100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.0100.0#-1.01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08481");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#100#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08482");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "10 10 0 -1 100                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10 10 0 -1 100                                                                                              ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#0" + "'", str7, "-1#0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08483");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00.0 -1.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08484");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 459, 4440L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4440L + "'", long3 == 4440L);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08485");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08486");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10L, (long) 1657, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08487");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 99, (long) 751, (long) 383);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 99L + "'", long3 == 99L);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08488");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 108, 0L, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 108L + "'", long3 == 108L);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08489");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08490");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1      140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40.0140.1-40");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08491");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("i!                  10#-1#100#100.0A-1.0A10.0A100.0A0.4aaaaaaa!ih40.001#0.1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08492");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 4393, 520);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 59, 416);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08493");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("00001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.110001000110000001.1.11");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.1.110001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08494");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08495");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" ...aaaaaaaaaaaaaaahi!hi!hi!                  10#-1#100#100#1                         ...aaaaaaaa", (long) 4163);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4163L + "'", long2 == 4163L);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08496");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 -1 100 100 1" + "'", str12, "10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08497");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 390, 131);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08498");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08499");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) 1758, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1758L + "'", long3 == 1758L);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest16.test08500");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0A100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }
}

