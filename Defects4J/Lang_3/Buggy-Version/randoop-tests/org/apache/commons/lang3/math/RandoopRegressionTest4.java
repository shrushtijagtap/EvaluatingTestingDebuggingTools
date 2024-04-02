package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test02001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02001");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1 0...1...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02002");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.Class<?> wildcardClass17 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test02003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02003");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0410.04-1.0" + "'", str11, "1.0410.04-1.0");
    }

    @Test
    public void test02004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02004");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02005");
        int[] intArray6 = new int[] { 'a', (short) 100, (byte) 1, (short) 0, (short) 100, 3 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (byte) 0, 1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (-1), 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 1, 0, 100, 3]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97a100a1a0a100a3" + "'", str8, "97a100a1a0a100a3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97" + "'", str12, "97");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test02006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02006");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("!!h!Ah!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a44class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [c                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a44class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [c                 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02008");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("ih # -#  #5.0      #53#5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test02009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02009");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4L, (float) 81, (float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 81.0f + "'", float3 == 81.0f);
    }

    @Test
    public void test02010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02010");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 16.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
    }

    @Test
    public void test02011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02011");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4, (long) 90, (long) 8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4L + "'", long3 == 4L);
    }

    @Test
    public void test02012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02012");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r# # #", 90);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test02013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02013");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (-110), 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02014");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1a10a100a97a97a35                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02015");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02016");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 52, 13);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test02017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02017");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 1, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test02018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02018");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(79, 27, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 79 + "'", int3 == 79);
    }

    @Test
    public void test02019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02019");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 16.0f + "'", float4 == 16.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "16.0#1.0" + "'", str6, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test02020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02020");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', 8, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02021");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02022");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi! 10 100.1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 100.1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:   1  aa4a4h5!h5!aa4a4aa4a44aa4a4   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02024");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02025");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! 10 100.01#35#100#10#-1#0100aa4a4hi!hi!aa4a4 aa4a44aa4a4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi4!4hi4!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi4!4hi4!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02027");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test02028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02028");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                            00  0 0\r4a a a#a#a#", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02029");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(571.0f, 0.0f, (float) 301);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 571.0f + "'", float3 == 571.0f);
    }

    @Test
    public void test02030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02030");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(26.0f, (float) 0L, 44.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 44.0f + "'", float3 == 44.0f);
    }

    @Test
    public void test02031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02031");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!HIA!AHIA!", 13.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 13.0f + "'", float2 == 13.0f);
    }

    @Test
    public void test02032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02032");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 59L, (double) 301.0f, (double) 824L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 59.0d + "'", double3 == 59.0d);
    }

    @Test
    public void test02033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02033");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02034");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 405, 0.0f, 7.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test02035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02035");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02036");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(29L, (long) 405, (long) 140);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 405L + "'", long3 == 405L);
    }

    @Test
    public void test02037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02037");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...10#-1#04444444444444444444444                                                          ", (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test02038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02038");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(43.0d, (double) 83.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.0d + "'", double3 == 83.0d);
    }

    @Test
    public void test02039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02039");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("3#35                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3#35                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02040");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test02041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02041");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(21, (int) (short) 10, 1815);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test02042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02042");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 31L, (double) 1815, 140.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test02043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02043");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("44 4 4444444            -1A10A4-1A10A4-1A10A4-1-1.041.040.0           a4a                                                              aa4a4                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02044");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 8, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test02045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02045");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!10100.01#35#100#10#-1#0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test02046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02046");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(44.0d, (double) 7, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test02047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02047");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02048");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 140, (double) 571, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 571.0d + "'", double3 == 571.0d);
    }

    @Test
    public void test02049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02049");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                             ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02050");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("15#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02051");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 0" + "'", str10, "1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1a0" + "'", str17, "1a0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a0" + "'", str19, "1a0");
    }

    @Test
    public void test02052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02052");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test02053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02053");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
    }

    @Test
    public void test02054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02054");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                      hi ! hi !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02055");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                14                       hia!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa", (double) (-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test02056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02056");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("41hi! 10 100.", (double) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test02057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02057");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("97A100A1A0A100A3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97A100A1A0A100A3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02058");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 26, 29.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 29.0d + "'", double3 == 29.0d);
    }

    @Test
    public void test02059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02059");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', (int) (byte) 0, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test02060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02060");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 110, 29);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 301, 35);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str10, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str22, "52.0a10.0a-1.0a-1.0a10.0a52.0");
    }

    @Test
    public void test02061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02061");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 27, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 8, 78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.041.040.0" + "'", str14, "-1.041.040.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test02062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02062");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 174, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 174.0f + "'", float3 == 174.0f);
    }

    @Test
    public void test02063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02063");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(301.0f, (float) 44L, (float) 103);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 301.0f + "'", float3 == 301.0f);
    }

    @Test
    public void test02064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02064");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("             ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02065");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 47, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0#1.0#0.0" + "'", str12, "-1.0#1.0#0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a1.0a0.0" + "'", str14, "-1.0a1.0a0.0");
    }

    @Test
    public void test02066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02066");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                    a-", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test02067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02067");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaa1#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02068");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 8, 0.0f, (float) 9L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.0f + "'", float3 == 9.0f);
    }

    @Test
    public void test02069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02069");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a100a100a1a-1a100", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test02070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02070");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02071");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 18, (float) 10, (float) 390);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test02072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02072");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("40-1aa4a4hi100a100a1a-1a100", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test02073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02074");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (-110), 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1" + "'", str20, "-1");
    }

    @Test
    public void test02075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02075");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 8.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 8.0d + "'", double2 == 8.0d);
    }

    @Test
    public void test02076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02076");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("16.041.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"16.041.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02077");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test02078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02078");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str14, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 1.0f + "'", float16 == 1.0f);
    }

    @Test
    public void test02079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02079");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44 4 4#4#                                           ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02080");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1 0" + "'", str20, "1 0");
    }

    @Test
    public void test02081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02081");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("Aa4a4                                                52.010.0-1.0-1.010.052.00#-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02082");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (short) 10, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02083");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 113, 571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 113");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0 0 -1 -1 1 1" + "'", str11, "0 0 -1 -1 1 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a0a-1a-1a1a1" + "'", str13, "0a0a-1a-1a1a1");
    }

    @Test
    public void test02084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02084");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) (-110), (long) 21);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-110L) + "'", long3 == (-110L));
    }

    @Test
    public void test02085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02085");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(391, (int) (byte) 10, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 391 + "'", int3 == 391);
    }

    @Test
    public void test02086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02086");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02087");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 1, (-1));
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
    }

    @Test
    public void test02088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02088");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (-1), 301);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1.0 10.0 -1.0" + "'", str8, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test02089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02089");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaa0#-10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02090");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 130, 32);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test02091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02091");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test02092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02092");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa4a4hi!hi!aa4a4 aa4a44aa4a4\r", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test02093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02093");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 21, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02094");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("  !ih # -#  #   #53# 1#01#01#0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02095");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0#100.0#52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02096");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test02097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02097");
        long[] longArray0 = new long[] {};
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
    }

    @Test
    public void test02098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02098");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) '4', (double) 44, (double) 1815);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test02099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02099");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa4a435.0                               ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02100");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a44class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [c                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02101");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02102");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44!!4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02103");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 7, (int) (short) -1);
        float float23 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 16.0f + "'", float18 == 16.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test02104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02104");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "16.0 1.0" + "'", str12, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
    }

    @Test
    public void test02105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02105");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(1L, (long) 44, 35L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test02106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02106");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02107");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4, 3, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test02108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02108");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test02109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02109");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1-#0", 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test02110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02110");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("143541004\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"43541004?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02111");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("!ih!ih");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02112");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("              hi!               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02113");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("2.0410.04-1.04-1.0410.045216.0#1.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test02114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02114");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 100, 30);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 53, 1878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test02115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0a10.0a-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a10.0a-1.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02116");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test02117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02117");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 4, 0);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 16.0f + "'", float6 == 16.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "16.0#1.0" + "'", str10, "16.0#1.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 16.0f + "'", float11 == 16.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "16.0a1.0" + "'", str19, "16.0a1.0");
    }

    @Test
    public void test02118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02118");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 95, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test02119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02119");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1L, (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02120");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test02121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!i");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!i\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02122");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test02123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02123");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02124");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(83.0d, (double) 32, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.0d + "'", double3 == 83.0d);
    }

    @Test
    public void test02125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02125");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 64, (float) 2, (float) 44);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 64.0f + "'", float3 == 64.0f);
    }

    @Test
    public void test02126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02126");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AA4A44-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02127");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "hi!001a1-a1a001a001a010#-1#010a100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!001a1-a1a001a001a010#-1#010a100a100a1a-1a100");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 1 + "'", byte17 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test02128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02128");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02129");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1 .0 0 -1 -1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02131");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, (-1));
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0404-14-14141" + "'", str14, "0404-14-14141");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) -1 + "'", short15 == (short) -1);
    }

    @Test
    public void test02132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02132");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02133");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0 0 -1 -1 1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02134");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 391, (long) 13, (long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 391L + "'", long3 == 391L);
    }

    @Test
    public void test02135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(97L, (long) (byte) 10, (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test02136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02136");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("AA4A44-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.4-1HI! 10 100.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02137");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0", 405);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 405 + "'", int2 == 405);
    }

    @Test
    public void test02138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02138");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1aa4a435.0                               HI!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02139");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(44L, (long) 32, (long) 39);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 44L + "'", long3 == 44L);
    }

    @Test
    public void test02140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02140");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 95, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 28, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Ii  0 000.00.  0 00  0 00  0 0\rhia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Ii  0 000.00.  0 00  0 00  0 0?hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02142");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 25);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 25.0d + "'", double2 == 25.0d);
    }

    @Test
    public void test02143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02143");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaa                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02144");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(113.0d, (double) 26, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02145");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AA4A4a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.a-1HI! 10 100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02146");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3, 1878, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test02147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02147");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a1.0a0.0", (float) 53L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test02148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02148");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) (byte) 10, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test02149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02149");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02150");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02151");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 47L, 90.0f, (float) 130);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test02152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02152");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02153");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 100, (double) (short) -1, (double) 103);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 103.0d + "'", double3 == 103.0d);
    }

    @Test
    public void test02154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02154");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.03", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test02155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02155");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140" + "'", str11, "140");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test02156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02156");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0                                             ...10#-1#0                                             ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0                                             ...10#-1#0                                             ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
    }

    @Test
    public void test02157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02157");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.010.0-1.##.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.#4#.###.#4###.#4##.", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02158");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 24, 6L, (long) 42);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 42L + "'", long3 == 42L);
    }

    @Test
    public void test02159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02159");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 HI !   10   100 hia ! ahia ! 1 # 35 # 100 # 10 # - 1 # 0 - # 01 # 001 # 53 # 10 # 1 - # 01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02160");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(44.0f, 0.0f, (float) 107);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test02161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02161");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("  !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02162");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("00 0 0 1#35#100#10#-1#01#35#...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02163");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 103, 59.0d, (double) 39);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.0d + "'", double3 == 39.0d);
    }

    @Test
    public void test02164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02164");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 10, 7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test02165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02165");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("        a-1A10A100A97A97A35#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02166");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi! aa aaaaaa##aaa#aa#aa#a                                                                        ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test02167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02167");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("###############################################################################################", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test02168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02168");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test02169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02169");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 39, (float) 23, (float) 11111L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11111.0f + "'", float3 == 11111.0f);
    }

    @Test
    public void test02170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02170");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 100, (int) ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10" + "'", str12, "-1a10");
    }

    @Test
    public void test02171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02171");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 21, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 0" + "'", str10, "1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1a0" + "'", str17, "1a0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1 0" + "'", str19, "1 0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1 0" + "'", str21, "1 0");
    }

    @Test
    public void test02172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02172");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test02173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02173");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test02174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02174");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1.0 10.0 -1.0i!hi!", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test02175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02175");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10414100");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 10414100 + "'", number1, 10414100);
    }

    @Test
    public void test02176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02176");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02177");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.041.040.0" + "'", str14, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test02178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02178");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 109, 1878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 109");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a100a1a-1a100" + "'", str15, "10a100a100a1a-1a100");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test02179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02179");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02180");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double22 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double23 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0 10.0 -1.0" + "'", str17, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0a10.0a-1.0" + "'", str21, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test02181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02181");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02182");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0 10.0 -1.0" + "'", str9, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0#10.0#-1.0" + "'", str12, "1.0#10.0#-1.0");
    }

    @Test
    public void test02183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi! 10 1a-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! 10 1a- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02184");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aa4a4                                                52.010.0-1.0-1.010.052.0", 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test02185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02185");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a35a100a10a-1a0" + "'", str16, "1a35a100a10a-1a0");
    }

    @Test
    public void test02186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02186");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("104100     a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02187");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test02188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02188");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 81.0f, 0.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 81.0d + "'", double3 == 81.0d);
    }

    @Test
    public void test02189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02189");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02190");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02191");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test02192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a100a100a1a-1a1###################################################################################################a100a100a1a-1a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a100a100a1a-1a1###################################################################################################a100a100a1a-1a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02193");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aaa44444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02194");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1 0...10#-1#010a100a100a1a-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02195");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 23, 176);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str19, "1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0#2.0#10.0#16.0#3.0#2.0" + "'", str21, "1.0#2.0#10.0#16.0#3.0#2.0");
    }

    @Test
    public void test02196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02196");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0104-140A001A001A1A1-A001");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("001a1-a1a001a00");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"001a1-a1a001a00\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02198");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test02199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02199");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test02200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02200");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test02201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02201");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0a0a-1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a-1a-1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02202");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 5, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test02203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02203");
        int[] intArray4 = new int[] { 35, 2, 9, (short) -1 };
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[35, 2, 9, -1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test02204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02204");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi100a100a1a-1a100hi100a100010#-1#0a001a001a1a1-a001hi100a100a1a-1a100hi100a100", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02205");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) -1, (float) 47L, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test02206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("97ii  0 000.00.  0 00  0 00  0 0\r                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97ii  0 000.00.  0 00  0 00  0 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02207");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 107, 39);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray3, ".     !ih # -#  #   #53#                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .     !ih # -#  #   #53#                       ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 1 + "'", byte6 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100" + "'", str8, "10#1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10414100" + "'", str14, "10414100");
    }

    @Test
    public void test02208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02208");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 90L, (double) 21.0f, (double) 53L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test02209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02209");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 14, (long) 25, (long) 130);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 130L + "'", long3 == 130L);
    }

    @Test
    public void test02210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02210");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 109, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02211");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test02212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02212");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aa4a4aa4a41aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02213");
        int[] intArray6 = new int[] { 'a', (short) 100, (byte) 1, (short) 0, (short) 100, 3 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 100, 2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 7, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[97, 100, 1, 0, 100, 3]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97a100a1a0a100a3" + "'", str8, "97a100a1a0a100a3");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97#100#1#0#100#3" + "'", str14, "97#100#1#0#100#3");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test02214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02214");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("40", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 40 + "'", short2 == (short) 40);
    }

    @Test
    public void test02215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02215");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test02216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02216");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaa0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02217");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.041.040.0" + "'", str14, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0a1.0a0.0" + "'", str17, "-1.0a1.0a0.0");
    }

    @Test
    public void test02218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02218");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 391, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 391 + "'", int3 == 391);
    }

    @Test
    public void test02219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02219");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.010....", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test02220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02220");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', 29, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test02221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02221");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 112, 0.0f, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test02222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02222");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#001#53#1!aiha!aih001 01 !IH0#1-#01#00.000 0  iI", 64);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 64 + "'", int2 == 64);
    }

    @Test
    public void test02223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02223");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("ih # -#  #5.0      #53#5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02224");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a44class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;class [c                 hi4!4hi4!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02225");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 81, 47);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
    }

    @Test
    public void test02226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02226");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100AA4A4HI!HI!AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100AA4A4HI!HI!AA is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02227");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\r                                               aa4a4                                                \r                                               aa4a4                                                \r                                               aa4a4                                                ", 8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test02228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02228");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("7A97A1#ahiahi4!4hi4!A1A1A97A97A1#!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02229");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi! 10 100.01#35#100#10#-1#0100aa4a4hi!hi!aa4a4 aa4a44aa4a4", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test02230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02230");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 100, 29);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.0a10.0a-1.0" + "'", str14, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0410.04-1.0" + "'", str16, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1.0a10.0a-1.0" + "'", str18, "1.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test02231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02231");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test02232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02232");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 97, 0.0f, 6.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test02233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".1.010.0-1.1.010.0-1.1.                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1.010.0-1.1.010.0-1.1.                                                                            \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02234");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Ii  0 000.00.  0 00  0 00  0 0\rhia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02235");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 301, (int) (byte) 10);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test02236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02236");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02237");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0HI!10100.0", 52.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test02238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02238");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0                                             ...10#-1#0                                             ", 39.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 39.0f + "'", float2 == 39.0f);
    }

    @Test
    public void test02239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02239");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 9, (float) 39, 25.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.0f + "'", float3 == 9.0f);
    }

    @Test
    public void test02240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02240");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 83, (long) (byte) 100, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test02241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02241");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(104100, 21, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104100 + "'", int3 == 104100);
    }

    @Test
    public void test02242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02242");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#h#!h!#!-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-h#!h#35#h!!#h!#-", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test02243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02243");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1a10a100a97a97a35                                                                                  104100     a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4143541004                                               a4a                                                4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02244");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi! 10 100.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test02245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".1.010.0-1.1.010.0-1.1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02246");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10A-1                                                                                                                                                                                                                                                                              \r4A4AA4A4 AA4A4HI!HI!AA4A400AA                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi100a100a1a-1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi100a100a1a-1a100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02248");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 17, 10);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test02249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02249");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaa                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02250");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test02251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02251");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '4', 24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "010#-1#0a001a001a1a1-a001");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 010#-1#0a001a001a1a1-a001");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test02252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02252");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 11, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test02253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02253");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(21.0d, (double) 107, (double) 4L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 107.0d + "'", double3 == 107.0d);
    }

    @Test
    public void test02254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02254");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(52.0f, (float) 125, 3.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test02255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02255");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("\r                                               aa4a4                                                52.010.0-1.0-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02256");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!10100.01#35#100#10#-1#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02257");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 103, (long) 'a', (long) 16);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 103L + "'", long3 == 103L);
    }

    @Test
    public void test02258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02258");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4 # # #00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r#35#444#44#-4#4hi!44444.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02259");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4 # # #########################################################################################################################################################################################################################################################################.1.010.0-1.1.010.0-1.1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02260");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str12, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 1.0f + "'", float13 == 1.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 16.0f + "'", float14 == 16.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0a2.0a10.0a16.0a3.0a2.0" + "'", str17, "1.0a2.0a10.0a16.0a3.0a2.0");
    }

    @Test
    public void test02261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02261");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(64.0f, (float) 104100L, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test02262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("3 353 353\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3 353 353?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02263");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                    a-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02264");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 10.0d + "'", double1 == 10.0d);
    }

    @Test
    public void test02265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02265");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test02266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02266");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test02267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02267");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 43, (float) 3L, (float) 124);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 124.0f + "'", float3 == 124.0f);
    }

    @Test
    public void test02268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02268");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 79, 59L, (long) 271);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 59L + "'", long3 == 59L);
    }

    @Test
    public void test02269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02269");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02270");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-1.0a10.0a-1.0#-", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02271");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                      4 # # #                       ", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test02272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02272");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) '4', 7);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 47, 19);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str17, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test02273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02273");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(14L, 824L, (long) 15);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 14L + "'", long3 == 14L);
    }

    @Test
    public void test02274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02274");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '4', 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
    }

    @Test
    public void test02275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("\r                                               aa4a4                                                a2#aaa#aaa#aaa#aaa#aa2#aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: ?                                               aa4a4                                                a2#aaa#aaa#aaa#aaa#aa2#aaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02276");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#10.0#1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02277");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test02278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi! 10 100.hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi! 10 100.hi!hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02279");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1aa4a435.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02280");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("  1  aa4a4h5!h5!aa4a4aa4a44aa4a4  HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02281");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 24.0f, (double) (byte) 10, 43.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 43.0d + "'", double3 == 43.0d);
    }

    @Test
    public void test02282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02282");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".11111!ih1#1#11#111#53#11111111111111111111111111111111111111111111111111#35#111#11#1#1hi!11111.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".11111!ih1#1#11#111#53#11111111111111111111111111111111111111111111111111#35#111#11#1#1hi!11111.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02283");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          10#-1#01#35#100#10#-1#01#35#100#10#1-a                                                                                                                         143541004104-140HI! 10 100.0                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02284");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 140L, (double) 15, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02285");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02286");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a101 35 100 10 -1 0", (long) (short) 40);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 40L + "'", long2 == 40L);
    }

    @Test
    public void test02287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02287");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 40, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test02288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02288");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aa4a4aa4a4aa4a4", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test02289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02289");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0, (float) 35L, 140.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test02290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02290");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("cl4ss [Ccl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;cl4ss [Lj4v4.l4ng.String;", 107.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 107.0d + "'", double2 == 107.0d);
    }

    @Test
    public void test02291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02291");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(64.0f, (float) 43L, (float) 11);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11.0f + "'", float3 == 11.0f);
    }

    @Test
    public void test02292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02292");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                       4a4 aa4a44aa4a4\r16.0a1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02293");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02294");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test02295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02295");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
    }

    @Test
    public void test02296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02296");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 25, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a-1" + "'", str13, "100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 -1" + "'", str16, "100 -1");
    }

    @Test
    public void test02297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02297");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str16, "1.0 2.0 10.0 16.0 3.0 2.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 1.0f + "'", float17 == 1.0f);
    }

    @Test
    public void test02298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02298");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("14", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 14 + "'", short2 == (short) 14);
    }

    @Test
    public void test02299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02299");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02300");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#35#100#10#-1#0hi!10100.016.0#1.01a0.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02301");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa10000a  a0a a0a\rahia100aaa100aaa1aaa-a1aaa100", 97.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test02302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02302");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 47, 35);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double21 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.041.040.0" + "'", str20, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
    }

    @Test
    public void test02303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02303");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) ' ', 0.0d, (double) 14L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test02304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, 53.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test02305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02305");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################-1.0 100.0 52.0", 43);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 43 + "'", int2 == 43);
    }

    @Test
    public void test02306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02306");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
    }

    @Test
    public void test02307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 0...1..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02308");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02309");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02310");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("143541004104-140HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02311");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0a0a-1a-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02312");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 5, 3.0d, (double) 391L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 391.0d + "'", double3 == 391.0d);
    }

    @Test
    public void test02313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02313");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1.0a10.0a-1.0" + "'", str17, "1.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1.0#10.0#-1.0" + "'", str19, "1.0#10.0#-1.0");
    }

    @Test
    public void test02314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02314");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 79, (double) 83L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.0d + "'", double3 == 83.0d);
    }

    @Test
    public void test02315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02315");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 107, 47);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 174, 104100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 174");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str14, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 52.0f + "'", float15 == 52.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test02316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02316");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("class [Ljava.lang.String;1", (double) 824);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 824.0d + "'", double2 == 824.0d);
    }

    @Test
    public void test02317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02317");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1100a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02319");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 24, 44L, 9L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 9L + "'", long3 == 9L);
    }

    @Test
    public void test02320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02320");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 271, 29L, (long) 4);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4L + "'", long3 == 4L);
    }

    @Test
    public void test02321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02321");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A4A4A4A4AA-1HI! 10 100.A-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02322");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test02323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02323");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 9, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
    }

    @Test
    public void test02324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02324");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), 44L, 130L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 130L + "'", long3 == 130L);
    }

    @Test
    public void test02325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.00000000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.0000000097ii0000.00.00000000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02326");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1004-1" + "'", str9, "1004-1");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test02327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02327");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!10100.0143541004");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02328");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 110, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 1, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test02329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("35.035.035.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35.035.035.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02330");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 1, (double) 1878L, 4.4444444444E10d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.4444444444E10d + "'", double3 == 4.4444444444E10d);
    }

    @Test
    public void test02331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02331");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 16.0f + "'", float18 == 16.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test02332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02332");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(64.0f, (float) 53L, (float) 47);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test02333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02333");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A 4 4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02334");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02335");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaa                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaa                                                                 ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "140" + "'", str20, "140");
    }

    @Test
    public void test02336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02336");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 301, 17L, (long) 91);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 301L + "'", long3 == 301L);
    }

    @Test
    public void test02337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02337");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (byte) -1, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 35 100 10 -1 0" + "'", str17, "1 35 100 10 -1 0");
    }

    @Test
    public void test02338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02338");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a4", 11.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 11.0d + "'", double2 == 11.0d);
    }

    @Test
    public void test02339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02339");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02340");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.0#10.0#-1.0" + "'", str16, "1.0#10.0#-1.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1.0a10.0a-1.0" + "'", str18, "1.0a10.0a-1.0");
    }

    @Test
    public void test02341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02341");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                          1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                140                                                 1.0#2.0#10.0#16.0#3.0#2.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02342");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 107, 91);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "140" + "'", str20, "140");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test02343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02343");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 405, 0);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 16.0f + "'", float20 == 16.0f);
    }

    @Test
    public void test02344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02344");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02345");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 14, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 14 + "'", short3 == (short) 14);
    }

    @Test
    public void test02346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02346");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(271, 571, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 571 + "'", int3 == 571);
    }

    @Test
    public void test02347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02347");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 0" + "'", str10, "1 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1a0" + "'", str17, "1a0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1a0" + "'", str19, "1a0");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 1 + "'", byte21 == (byte) 1);
    }

    @Test
    public void test02348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02348");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test02349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02349");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 27, (int) (short) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100#-1" + "'", str21, "100#-1");
    }

    @Test
    public void test02350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02350");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 8, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 16.0f + "'", float4 == 16.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "16.0#1.0" + "'", str6, "16.0#1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "16.0#1.0" + "'", str8, "16.0#1.0");
    }

    @Test
    public void test02351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02351");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(83.0f, 21.0f, 301.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 301.0f + "'", float3 == 301.0f);
    }

    @Test
    public void test02352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02352");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.Class<?> wildcardClass9 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0 1.0" + "'", str7, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02353");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(26.0f, (float) 32, (float) 391);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 26.0f + "'", float3 == 26.0f);
    }

    @Test
    public void test02354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02354");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 405, 0);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 113, 18);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test02355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02355");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("##################################################1#0##################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02356");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (short) 0, 3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1.0 10.0 -1.0" + "'", str15, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1.0#10.0#-1.0" + "'", str18, "1.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test02357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02357");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("      100aa4a4hi!hi!aa", (float) 301L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 301.0f + "'", float2 == 301.0f);
    }

    @Test
    public void test02358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02358");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (float) 37, (float) 8L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test02359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02359");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("041hi! 10 100.1#0.1-0.010.11#0.1-0.010.11#0.1-0.010.53 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 353 35");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02360");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test02361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02361");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 40, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 40 + "'", short3 == (short) 40);
    }

    @Test
    public void test02362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02362");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("16.0#1.01A0.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02363");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("  4 4  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02365");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 301, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 301L + "'", long3 == 301L);
    }

    @Test
    public void test02366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02366");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a100a100a1a-1a100" + "'", str8, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10a100a100a1a-1a100" + "'", str15, "10a100a100a1a-1a100");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041004100414-14100" + "'", str17, "1041004100414-14100");
    }

    @Test
    public void test02367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02367");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test02368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02368");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                        lass [Cclass [Ljava.lang.String;ii  01 0...1..00.00.  0 00  0 00  0 0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test02369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02369");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2L, 11.0d, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test02370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02370");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (short) 10, (float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test02371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02371");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#1.0#0.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test02372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02372");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (int) (short) 40, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 40");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 35 100 10 -1 0" + "'", str16, "1 35 100 10 -1 0");
    }

    @Test
    public void test02373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02373");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test02374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02374");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97#100#1#0#100#3");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02375");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("00a4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02376");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a100.0a-1.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a100.0a-1.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02378");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (byte) 100, (int) (short) 1);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 90, 0);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1" + "'", str25, "-1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
    }

    @Test
    public void test02379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02379");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02380");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 11);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11.0f + "'", float2 == 11.0f);
    }

    @Test
    public void test02381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02381");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih1#35#100#10#-1#01#35...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02382");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1A10A ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1A10A \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-14100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-141001041004100414-14100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02384");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test02385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02385");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(31, 83, 531);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test02386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02386");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 112, 571);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 112");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 1 + "'", byte16 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test02387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02387");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test02388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02388");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02389");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 176, (long) 112, (long) 103);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 103L + "'", long3 == 103L);
    }

    @Test
    public void test02390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02390");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?97ii  0 000.00.  0 00  0 00  0 0?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02391");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 35L, (float) 13, 17.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test02392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02392");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test02393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02393");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 103L, (double) 47, (double) 21.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test02394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaahia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaahia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35#1#35\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02395");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(174, 3, 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 174 + "'", int3 == 174);
    }

    @Test
    public void test02396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02396");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 49.0f, (float) 18);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 49.0f + "'", float3 == 49.0f);
    }

    @Test
    public void test02397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02397");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("97a100a1a0a100a3", 531);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 531 + "'", int2 == 531);
    }

    @Test
    public void test02398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02398");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "1.0 10.0 -1.0i!hi!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1.0 10.0 -1.0i!hi!");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test02399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02399");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1####1\r33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1####1?33333333333333333333333333333333333333333333333aaaaa33333333333333333333333333333333333333333333333352-1#1-1##-1##-1#1-152-11##");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "140" + "'", str18, "140");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
    }

    @Test
    public void test02400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02400");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                           3435");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 3435.0f + "'", float1 == 3435.0f);
    }

    @Test
    public void test02401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02401");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "--###");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: --###");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100#-1" + "'", str21, "100#-1");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100 -1" + "'", str24, "100 -1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
    }

    @Test
    public void test02402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02402");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 16, 125);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str10, "52.0 10.0 -1.0 -1.0 10.0 52.0");
    }

    @Test
    public void test02403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02403");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("         1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#                            16.0A1.0001a1-a1a001a001a010#-1#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test02404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02404");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#0", (double) 30L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
    }

    @Test
    public void test02405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02405");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4###1041001041001041001041.010.0-1.0hi! 10 100.hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02406");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("16.0#1.01a016.0A1.0001a1-a1a001a001a010#-1#016.0#1.01a0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a1-a1a01a1-a1a!IH041-401400145341001a1-a1a001a001a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02407");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("97A100A1A0A100A3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02408");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("001a1-a1a001a001a01");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02409");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("!4ih4!4ih                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02410");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaa0#-10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02411");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 40, 0.0f, 13.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 40.0f + "'", float3 == 40.0f);
    }

    @Test
    public void test02412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02412");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(16L, 0L, (long) 6);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test02413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02413");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 15, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
    }

    @Test
    public void test02414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02414");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1#10" + "'", str7, "-1#10");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test02415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02415");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02416");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(174, (int) (short) 0, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 174 + "'", int3 == 174);
    }

    @Test
    public void test02417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02417");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-110), (float) 6, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-110.0f) + "'", float3 == (-110.0f));
    }

    @Test
    public void test02418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02418");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AAAAAAAAAAAAAA                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02419");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 112, 17.0f, (float) 2);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 112.0f + "'", float3 == 112.0f);
    }

    @Test
    public void test02420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a!ahia!1#35#100#10#-1#000001#35#100#10#-1#01#35#...4a4aa4a4aa4a4hi!hi!aa4a400aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02421");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(16, 652, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 652 + "'", int3 == 652);
    }

    @Test
    public void test02422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02422");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1", 405);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 405 + "'", int2 == 405);
    }

    @Test
    public void test02423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02423");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 180, (float) 59, (float) 824);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 59.0f + "'", float3 == 59.0f);
    }

    @Test
    public void test02424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02424");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(39, 16, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
    }

    @Test
    public void test02425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1A10A#-1A10A#-1A10A#-1-1.041.040.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A#-1A10A#-1A10A#-1-1.041.040.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02426");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                               #4#                                                4");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                #4#                                                4");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100a-1" + "'", str22, "100a-1");
    }

    @Test
    public void test02427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02427");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 104100.0f, (double) 32L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 104100.0d + "'", double3 == 104100.0d);
    }

    @Test
    public void test02428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02428");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#", 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test02429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02429");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4, (float) 64, (float) 104100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104100.0f + "'", float3 == 104100.0f);
    }

    @Test
    public void test02430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#35#444#44#-4#4hi!44444.ii  0 000.00.  0 00  0 00  0 0\r#35#444#44#-4#4hi!44444.ii  0 000.00.  0 00  0 00  0 0\r#35#444#44#-4#4hi!44444.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02431");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 44L, (float) 124, (float) 34);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 124.0f + "'", float3 == 124.0f);
    }

    @Test
    public void test02432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02432");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 40, (long) (byte) 100, (long) 34);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test02433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02433");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 7, 819);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test02434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02434");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("001a1-a1a001a001a010#-1#0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test02435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02435");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(44L, 391L, (long) 3);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3L + "'", long3 == 3L);
    }

    @Test
    public void test02436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02436");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                            16.041.0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                             16.041.0                                              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02438");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(97L, (long) 37, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test02439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02439");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("7a100a1a0a100a3");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02440");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("041HI! 10 100.1#0.1-0.010.11#0.1-0.010.11#0.1-0.010.", (short) 14);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 14 + "'", short2 == (short) 14);
    }

    @Test
    public void test02441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02441");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(271, 0, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test02442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02442");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(571L, 100L, (long) (-110));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 571L + "'", long3 == 571L);
    }

    @Test
    public void test02443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02443");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(125, 125, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 125 + "'", int3 == 125);
    }

    @Test
    public void test02444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02444");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 16.0d, (double) 1878L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1878.0d + "'", double3 == 1878.0d);
    }

    @Test
    public void test02445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02445");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                          143541004a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4", (float) 26);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test02446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02446");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444", (long) 125);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 125L + "'", long2 == 125L);
    }

    @Test
    public void test02447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02447");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test02448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02448");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#1.0#0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02449");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 40, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 40 + "'", short3 == (short) 40);
    }

    @Test
    public void test02450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02450");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 15, (long) 28);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 28L + "'", long3 == 28L);
    }

    @Test
    public void test02451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02451");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass18 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 1 + "'", byte12 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test02452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02452");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("   !IH       !IH       !IH       !IH    97A100A1A0A100A3   !IH       !IH       !IH       !IH     1#35#100#10#-1#01#35...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02453");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02454");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...0#-hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...", (long) 39);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 39L + "'", long2 == 39L);
    }

    @Test
    public void test02455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02455");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("\r1#35#100#10#-1#0hi!10100.0-1A10A100A97A97A35-1A10A10", (float) 1815);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1815.0f + "'", float2 == 1815.0f);
    }

    @Test
    public void test02456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02456");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                       -1A1A1A97A97A1#hia-1A1A1A97A97A1#!-1A1A1A97A97A1#ahia-1A1A1A97A97A1#!", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test02457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02457");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(90L, (long) 391, 30L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 391L + "'", long3 == 391L);
    }

    @Test
    public void test02458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02458");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 19, 140L, 47L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test02459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02459");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                            00  0 0\r4a a a#a#a#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02460");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1041001041001041001041.010.0-1.0tring;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                                    a-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02461");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("# # #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02462");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 13.0f, (double) 4, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test02463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02463");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                      ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test02464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02464");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 44, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 44");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1a0" + "'", str20, "1a0");
    }

    @Test
    public void test02465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02466");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test02467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02467");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                               a4a                                                4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test02468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02468");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test02469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02469");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#-10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test02470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02470");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 5, (double) 64.0f, (double) 79);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 79.0d + "'", double3 == 79.0d);
    }

    @Test
    public void test02471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02471");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0 10.0 -1.0" + "'", str7, "1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0410.04-1.0" + "'", str10, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1.0 10.0 -1.0" + "'", str12, "1.0 10.0 -1.0");
    }

    @Test
    public void test02472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02472");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("35.0                               ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test02473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02473");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02474");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("        0#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02475");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02476");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1" + "'", str13, "-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1" + "'", str15, "-1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1" + "'", str19, "-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1" + "'", str21, "-1");
    }

    @Test
    public void test02477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02477");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(21.0d, (double) 39.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 39.0d + "'", double3 == 39.0d);
    }

    @Test
    public void test02478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02478");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaa0#-10a-1                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    4444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4A 4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02480");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 28, (double) (-110), (double) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 28.0d + "'", double3 == 28.0d);
    }

    @Test
    public void test02481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02481");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                          143541004a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4", (double) 271);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 271.0d + "'", double2 == 271.0d);
    }

    @Test
    public void test02482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02482");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4                                                a4a                                               4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4                                                a4a                                               4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140" + "'", str11, "140");
    }

    @Test
    public void test02483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02483");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1aa4a435.0                               -1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0-1.0 1.0 0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test02484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02484");
        long[] longArray6 = new long[] { (short) -1, 10L, 100L, 'a', 'a', 35 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-1, 10, 100, 97, 97, 35]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1a10a100a97a97a35" + "'", str8, "-1a10a100a97a97a35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14104100497497435" + "'", str10, "-14104100497497435");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a10a100a97a97a35" + "'", str12, "-1a10a100a97a97a35");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1#10#100#97#97#35" + "'", str16, "-1#10#100#97#97#35");
    }

    @Test
    public void test02485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02485");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(14.0d, 4.0d, 81.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4.0d + "'", double3 == 4.0d);
    }

    @Test
    public void test02486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI! AA AAAAAA##AAA#AA#AA#A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI! AA AAAAAA##AAA#AA#AA#A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02487");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (byte) 1, (int) (byte) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) '4', 7);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str17, "52.0a10.0a-1.0a-1.0a10.0a52.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "52.0#10.0#-1.0#-1.0#10.0#52.0" + "'", str24, "52.0#10.0#-1.0#-1.0#10.0#52.0");
    }

    @Test
    public void test02488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02488");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 5, (double) 390);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 390.0d + "'", double3 == 390.0d);
    }

    @Test
    public void test02489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02489");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 405, 35.0d, 7.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7.0d + "'", double3 == 7.0d);
    }

    @Test
    public void test02490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02490");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100a1a-1a100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02491");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test02492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02492");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 40, (long) 35, 39L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 40L + "'", long3 == 40L);
    }

    @Test
    public void test02493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02493");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("3543");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...35#h!!#h!#-h#!h#35#h!!#h!#h...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test02495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02495");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!10100.0143541004");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test02496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02496");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1#0HI! 10 100.03");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test02497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02497");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(103.0d, 301.0d, (double) 17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 301.0d + "'", double3 == 301.0d);
    }

    @Test
    public void test02498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02498");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 95, 33);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16.0a1.0" + "'", str13, "16.0a1.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 1.0f + "'", float14 == 1.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
    }

    @Test
    public void test02499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02499");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4# # ######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest4.test02500");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10414100" + "'", str6, "10414100");
    }
}

