package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test05001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05001");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05002");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 11, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int24 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 1" + "'", str22, "-1 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test05003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05003");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) 'a', 41);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 52.0" + "'", str11, "-1.0 52.0");
    }

    @Test
    public void test05004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05004");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test05005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05005");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05006");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a#-1 -1 100 10 -1.0 TRUE-1 -1 1-1 -1-1 -1AAAAAAAAAAAAAAAAAAA...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05007");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05008");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test05009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05009");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 211, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 10.0 -1.0" + "'", str8, "100.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05010");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 10 97" + "'", str10, "10 10 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 10 97" + "'", str15, "10 10 97");
    }

    @Test
    public void test05011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05011");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a971a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05012");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                      aaaaaaaaaa0.1- 01 001 1- 1-                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                       aaaaaaaaaa0.1- 01 001 1- 1-                       ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test05013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05013");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 1432, 8);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 1 100 0 10" + "'", str12, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test05014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05014");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0#10.0#-1.0" + "'", str18, "100.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test05015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05015");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("..#..#..#..#..#..#..#..#..##-1 -1 100 10 -1 0 2.ue-1 -1 10052.00 .L#.2. 2..0 S2.i.0;52.00 .B52.00 .J52.00 .F", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05016");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                    -1 -1 100 10 -1.0 true-1 -1 100 ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05017");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(5, 63, 1170);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test05018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05018");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa10a-1.0atrue-1a-1a100aaaaaaaaaaaaaaaaaaaa-1.0a52.0aaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...1- 01 001 1- 1-5a0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05020");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt##1#1-                                                                                             # 001 1- 1-eurt10 10 97", (float) 1151);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1151.0f + "'", float2 == 1151.0f);
    }

    @Test
    public void test05021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05021");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 25, (double) 124.0f, 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 124.0d + "'", double3 == 124.0d);
    }

    @Test
    public void test05022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05022");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 3224, 87);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100a100a100a10a1" + "'", str24, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100a100a100a10a1" + "'", str26, "100a100a100a10a1");
    }

    @Test
    public void test05023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05023");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(42, 163, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05024");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.-1a1.0a52.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                         -1a1##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05026");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 49, (long) 82, (long) 867);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test05027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0100.0410.04-1.0                                   97a100a10a0a0a102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05028");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                        -14-1-14-1aaaaaaaaaaaaaaaaaaa...", (short) -141);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -141 + "'", short2 == (short) -141);
    }

    @Test
    public void test05029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05029");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("####...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05030");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(28, 3995, 1297);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3995 + "'", int3 == 3995);
    }

    @Test
    public void test05031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05031");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 9L, (double) 4, (double) 12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test05032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05032");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 1458, 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test05033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05033");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05034");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("####################97##00##0#0#0##02", 263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 263 + "'", int2 == 263);
    }

    @Test
    public void test05035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05035");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 44.0f, (double) 1297.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1297.0d + "'", double3 == 1297.0d);
    }

    @Test
    public void test05036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05036");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 52, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97#100#10#0#0#102" + "'", str19, "97#100#10#0#0#102");
    }

    @Test
    public void test05037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05037");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#1010#1#100#0#10101097101097101097101097101097101097101097101097A aA aA aA aA aA aA aA aA aA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05038");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test05039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05039");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 11, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 169, (int) 'a');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 100 + "'", short18 == (short) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10041" + "'", str20, "10041");
    }

    @Test
    public void test05040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05040");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05041");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(359, 42, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05042");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 2, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test05043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05043");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 110, 166);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 110");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test05044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05044");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 44, 188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 44");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test05045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05045");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.004100410041041E15d, (double) 140, 4.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.004100410041041E15d + "'", double3 == 1.004100410041041E15d);
    }

    @Test
    public void test05046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05046");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 5, (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#1#100#0#10" + "'", str18, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
    }

    @Test
    public void test05047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05047");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1A0A1A0-1.0A.0a52..0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0", (double) 60L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 60.0d + "'", double2 == 60.0d);
    }

    @Test
    public void test05048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05048");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("9752.0102");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05049");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05050");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(49L, (long) (short) 52, (long) 101);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test05051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05051");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 57, 55);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041410040410" + "'", str14, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05052");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 97);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test05053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05053");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 47, (long) 262, (long) 106);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 262L + "'", long3 == 262L);
    }

    @Test
    public void test05054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05054");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 174, 140L, (long) 128);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 174L + "'", long3 == 174L);
    }

    @Test
    public void test05055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05056");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-10410497141004-1                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05057");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 52, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test05058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05058");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 1098504, 82);
        long long28 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long29 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test05059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05059");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("141-class [Ljava.laaaaaa aaaa -aaa141004-1141-class [Ljava.la");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("true-1 -1 100 #                                                                                             -1#1#################################################################################################          ##########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true-1 -1 100 #                                                                                             -1#1#################################################################################################          ##########################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05061");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test05062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05062");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0          97100100010");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05063");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("r.251r.t1#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a#-1 -1 100 10 -1.0 TRUE-1 -1 1-1 -1-1 -1AAAAAAAAAAAAAAAAAAA..");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05064");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #", (double) 65L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 65.0d + "'", double2 == 65.0d);
    }

    @Test
    public void test05065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05065");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 13.0f, (double) 1089);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("        .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n10a-1                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1#-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0????????????????????????????????????????????????????10a-1                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1#-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1hI!-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05069");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(103, 0, 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05070");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.04-1.0" + "'", str7, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0 10.0 -1.0" + "'", str17, "100.0 10.0 -1.0");
    }

    @Test
    public void test05071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05071");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0", 45);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05072");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("     44444444  44444444  44444444  44444444 0#1#1#0#1#1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05073");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 262L, (double) 1143.0f, (double) 30L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 30.0d + "'", double3 == 30.0d);
    }

    @Test
    public void test05074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05074");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 60L, 489.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05075");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97410041040404102aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 29.0d + "'", double2 == 29.0d);
    }

    @Test
    public void test05076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05076");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#0.0" + "'", str9, "0.0#0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test05077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05077");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) (short) 10, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test05078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05078");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("class [Ljava.laa4#4ava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05079");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05080");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 53, 8);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test05081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05081");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 77L, (double) 34);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05082");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 -1 100 10 ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test05083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05083");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97524.40102");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 97524.4f + "'", float1 == 97524.4f);
    }

    @Test
    public void test05084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05084");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 140, 55);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05085");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" a52", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05086");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa true-1 -1 100 a                                                                                             -1a1##", 2517);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2517 + "'", int2 == 2517);
    }

    @Test
    public void test05087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05087");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2881, (float) 75, (float) 87);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 75.0f + "'", float3 == 75.0f);
    }

    @Test
    public void test05088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05088");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("  -1.0 100.0 1.0 -1.0 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1...   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05089");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05090");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 10);
        double double20 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 94, 0);
        double double25 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double26 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 408, 79);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test05091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05091");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 35, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 489, 1);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 0 + "'", short23 == (short) 0);
    }

    @Test
    public void test05092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05092");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#10#97" + "'", str12, "10#10#97");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10410497" + "'", str14, "10410497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a10a97" + "'", str16, "10a10a97");
    }

    @Test
    public void test05093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05093");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         #1#1#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a####################a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a####################a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05095");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 111, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100 1" + "'", str15, "100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#1" + "'", str17, "100#1");
    }

    @Test
    public void test05096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05096");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05097");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
    }

    @Test
    public void test05098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#1#0       0.250.          0.250.          0.250.          0.250.          0.250.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0       0.250.          0.250.          0.250.          0.250.          0.250.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05099");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 100, 53);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97#100#10#0#0#102" + "'", str11, "97#100#10#0#0#102");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 102L + "'", long16 == 102L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test05100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05100");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 53, 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 156, 3);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 1151, 47);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test05101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05101");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 102, (int) (byte) 1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        long long24 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long25 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1004100410041041" + "'", str23, "1004100410041041");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
    }

    @Test
    public void test05102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#1#0#1#1#0 44444444  44444444  44444444  44444444  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0#1#1#0 44444444  44444444  44444444  44444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05103");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0" + "'", str15, "0.0");
    }

    @Test
    public void test05104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05104");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("f[ SSALCj[ SSALCb[ SSALC;GNIRTs.GNAL.AVAJl[ SSALC001 1- 1-EURT 0.1-1.0                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f[ SSALCj[ SSALCb[ SSALC;GNIRTs.GNAL.AVAJl[ SSALC001 1- 1-EURT 0.1-1.0                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05106");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05107");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100a1" + "'", str13, "100a1");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 1 + "'", short14 == (short) 1);
    }

    @Test
    public void test05108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("##################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05109");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0a5210a5297", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05110");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0a10.0a-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05111");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# A# A# A# A# A# A# A# A# A# A", 103.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 103.0d + "'", double2 == 103.0d);
    }

    @Test
    public void test05112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05112");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(12L, (long) 966, (long) 2762);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 12L + "'", long3 == 12L);
    }

    @Test
    public void test05113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05113");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05114");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test05115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05115");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 100.0 1.0 -1.0-1.-1.0 100.0 1.0 -1.0-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05116");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (long) 55);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 55L + "'", long2 == 55L);
    }

    @Test
    public void test05117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05117");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 0, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05118");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) (byte) 100, (int) (byte) 0);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test05119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05119");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0a1a1a10" + "'", str15, "0a1a1a10");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test05120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05120");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
    }

    @Test
    public void test05121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05121");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (short) 1, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 1" + "'", str22, "-1 1");
    }

    @Test
    public void test05122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05122");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a  A 001 1- 1-EURT 0.1- 01 001 1- 1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05123");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 0, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 95, 41);
        java.lang.Class<?> wildcardClass25 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test05124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05124");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05125");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 97, (short) (byte) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 97 + "'", short3 == (short) 97);
    }

    @Test
    public void test05126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05126");
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
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 61, 5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0.0" + "'", str24, "0.0");
    }

    @Test
    public void test05127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #a #a #a #a #a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#1#1#0#1#1#044444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#1#1#0#1#1#044444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05129");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
    }

    @Test
    public void test05130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05130");
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
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 95, 0);
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test05131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05131");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05132");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 0 + "'", short7 == (short) 0);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test05133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05133");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 5, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2" + "'", str10, "2");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test05134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05134");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 100, 25);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#1#100#0#10" + "'", str17, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
    }

    @Test
    public void test05135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05135");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#52.0-1.0#52.0-1.0#52.0-...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05137");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
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
    public void test05138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05138");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) 'a', 60);
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test05139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05139");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test05140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05140");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 124, 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#10#97" + "'", str10, "10#10#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#10#97" + "'", str12, "10#10#97");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test05141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05141");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10041" + "'", str9, "10041");
    }

    @Test
    public void test05142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05142");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.04-1.0" + "'", str7, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test05143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05143");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 183, 98);
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
    }

    @Test
    public void test05144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05144");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                          ...", (double) 128);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 128.0d + "'", double2 == 128.0d);
    }

    @Test
    public void test05145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05145");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("35.0a23.0a97.0a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05147");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1.0A52.                                                                                             -1A1#1#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05148");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#1#          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100#1                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05150");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05151");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("97a100a10a0a0a102                -1.0A52.0AAAAAAAAAAAAAAAAAAAA                           ##############################################################97#100#10#0#0#102-1 100 10 -1.0 TRU");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05152");
        long[] longArray6 = new long[] { 34, 34, 56, 14, 52, 97 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 1100, 87);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[34, 34, 56, 14, 52, 97]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14L + "'", long7 == 14L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test05153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05153");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#################...", (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.0d + "'", double2 == 104.0d);
    }

    @Test
    public void test05154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05154");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(32L, 97L, 111L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test05155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05155");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) (short) 1, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
    }

    @Test
    public void test05156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05156");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short19 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 0 + "'", short19 == (short) 0);
    }

    @Test
    public void test05157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05157");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a0a1a0a #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05158");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(864, (int) (byte) -1, 1432);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05159");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 52, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long22 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 859, 1058);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 859");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97a100a10a0a0a102" + "'", str19, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 102L + "'", long21 == 102L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 102L + "'", long22 == 102L);
    }

    @Test
    public void test05160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05160");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 11, 0);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-141" + "'", str22, "-141");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1 1" + "'", str25, "-1 1");
    }

    @Test
    public void test05161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05161");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(33, 51, 489);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test05162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05162");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 102, (int) (byte) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0 0.0" + "'", str13, "0.0 0.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
    }

    @Test
    public void test05163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05163");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -...", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test05164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05164");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 197, 156);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100 1" + "'", str16, "100 1");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 1 + "'", short18 == (short) 1);
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test05165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05165");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 100, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0a52.0" + "'", str9, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
    }

    @Test
    public void test05166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05166");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a # a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a # a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test05167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05167");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.la-1.0...aa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lang.String;class [Bclass [Jclass [Faa#aa#aa#aa#aa#aa#aa#aa#aa##-1 -1 100 10 -1.0 true-1 -1 100class [Ljava.lan", 119.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 119.0d + "'", double2 == 119.0d);
    }

    @Test
    public void test05168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05168");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, (int) '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', (int) (byte) 0, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
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
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#1#100#0#10" + "'", str24, "10#1#100#0#10");
    }

    @Test
    public void test05169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05169");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.Class<?> wildcardClass19 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a1a100a0a10" + "'", str18, "10a1a100a0a10");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test05170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05170");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 144, 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05171");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test05172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05172");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041410040410" + "'", str15, "1041410040410");
    }

    @Test
    public void test05173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05173");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (short) 52, 0);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test05174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05174");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test05175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05175");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#10#97" + "'", str10, "10#10#97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#10#97" + "'", str13, "10#10#97");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test05176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05176");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...                      ...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05177");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a100.0 10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 136);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 136.0f + "'", float2 == 136.0f);
    }

    @Test
    public void test05178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05178");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test05179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05179");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #44444444             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #44444444             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #44444444             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #             10410497                              a #011011");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05180");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 102, (int) (byte) 1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 5, 67);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100 100 100 10 1" + "'", str22, "100 100 100 10 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "100#100#100#10#1" + "'", str24, "100#100#100#10#1");
    }

    @Test
    public void test05181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05181");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0" + "'", str7, "0.0");
    }

    @Test
    public void test05182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05182");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 9, 1143);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#100#0#10" + "'", str15, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test05183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("######...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"######...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05184");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, 9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 102, 0);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test05185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05185");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".0a52.01.01.0.000.001. 00true1.01.0.000", (float) 3995L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3995.0f + "'", float2 == 3995.0f);
    }

    @Test
    public void test05186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05186");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 90, 9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a52.0" + "'", str15, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0452.0" + "'", str17, "-1.0452.0");
    }

    @Test
    public void test05187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05187");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" HI!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05188");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.Class<?> wildcardClass17 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#1#100#0#10" + "'", str14, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test05189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05189");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05190");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 50, (-141));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1-110010-1.  44444444  44444444  44444444  44444444 0#1#1#0#1#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1-110010-1.  44444444  44444444  44444444  44444444 0#1#1#0#1#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05192");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#################101100010                   aaaaaaaaaaaaaaaaa##################################10-1.0true-1-1100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05194");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1a0a1a0-1.0a5         10a-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05195");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0100.010.0-1.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05196");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(43, 1098504, 156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1098504 + "'", int3 == 1098504);
    }

    @Test
    public void test05197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05197");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a52.0" + "'", str13, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#52.0" + "'", str15, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a52.0" + "'", str18, "-1.0a52.0");
    }

    @Test
    public void test05198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05198");
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
        short short29 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
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
        org.junit.Assert.assertTrue("'" + short29 + "' != '" + (short) 100 + "'", short29 == (short) 100);
    }

    @Test
    public void test05199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05199");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1a1" + "'", str15, "-1a1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test05200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05200");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -141, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test05201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05201");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444", 133.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E43d + "'", double2 == 4.4444444444444445E43d);
    }

    @Test
    public void test05202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05202");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
    }

    @Test
    public void test05203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-1a1- a 001 1- 1-eurt 0.1- 01 001 1- 1-#         ##########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-0.25#0.1-1a1- a 001 1- 1-eurt 0.1- 01 001 1- 1-#         ########## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05204");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(54, 0, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test05205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05205");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test05206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05206");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                          ...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05207");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 10041L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10041L + "'", long2 == 10041L);
    }

    @Test
    public void test05208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05208");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 8, 1452);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 10.0 -1.0" + "'", str8, "100.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test05209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  aaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05210");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(14.0f, 0.0f, (float) 1458L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1458.0f + "'", float3 == 1458.0f);
    }

    @Test
    public void test05211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05211");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05212");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a1" + "'", str11, "-1a1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test05213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05213");
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
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#0#1#0" + "'", str20, "-1#0#1#0");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test05214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05214");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("\naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  \naaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa   ", (long) 179);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 179L + "'", long2 == 179L);
    }

    @Test
    public void test05215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05215");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA aclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;.0#52.0-1.0#A aA aA aA aA aA aA aA aA aA a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05216");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 408, 56);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
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
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test05217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05217");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 102L + "'", long15 == 102L);
    }

    @Test
    public void test05218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05218");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1#1#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05219");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.1- 01 001 1- 1--1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HIlang.String;classa[Ljava.lang.String;classa[Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05220");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 63, (long) 124, (long) 352);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 63L + "'", long3 == 63L);
    }

    @Test
    public void test05221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05221");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a52.0", 169);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 169 + "'", int2 == 169);
    }

    @Test
    public void test05222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05222");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 -1 100 10 -1.0 ", 4141410);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4141410 + "'", int2 == 4141410);
    }

    @Test
    public void test05223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05223");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1100, 0, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1100 + "'", int3 == 1100);
    }

    @Test
    public void test05224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05224");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#-1 -1 100 10 -1.0 true-1 -1 100 a# # a#-1 -1 100 10 -1.0 true-1 -1 1-1 -1-1 -1aaaaaaaaaaaaaaaaaaa...-1.0#52.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05225");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05226");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 1, (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05227");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!aaaaaaa", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test05228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05228");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05229");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05230");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#-1#100#100#1", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05232");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test05233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05233");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!aaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05234");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05235");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test05236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05236");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05237");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05238");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!aaaaaaa", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05239");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test05240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05240");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test05241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05241");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!AAAAAAA", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05242");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) (byte) -1, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test05243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05243");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05244");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#aaa#aa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05245");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05246");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05247");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 0, (double) (short) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test05248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05248");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05249");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test05250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05250");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#4#4 4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05251");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test05252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05253");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05255");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test05256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05256");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05258");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test05259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05259");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05260");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 0L, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test05261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05261");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0 100.0", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05262");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test05263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05263");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05264");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, (float) 0L, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test05265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05265");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05266");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(100L, (long) (short) 1, (long) '#');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test05267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05267");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05268");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!aaaaaaa", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05269");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05270");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05271");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0 -1.0", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05272");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, 0L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05273");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) (short) -1, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05274");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                             #aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                             #aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05275");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#aaa#aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05276");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!#aaa#aa#aaa#aahi!aaaaaaa#aaa#aahi!#aaa#aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.0 100.0                  10#-1#100#100#1                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 100.0                  10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05278");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#4#4 4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05279");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                 10#-1#100#100#1                   hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05280");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "10 -1 100 100 1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10 -1 100 100 1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test05281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05281");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             #aaa#aa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05282");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                 10#-1#100#100#1                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.04-1.0410.04100.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04-1.0410.04100.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05284");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                             #AAA#AA", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test05285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05285");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test05286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05286");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#4#4 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05287");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05288");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, (double) (-1.0f), (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test05289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05289");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05290");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) '4', (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test05291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05291");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05292");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#4 4a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05293");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAA#AA", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05294");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1" + "'", str5, "1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1" + "'", str7, "1");
    }

    @Test
    public void test05295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05295");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#### #a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"### #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05296");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test05297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05297");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 0L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05298");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#AAA#AA", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05299");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAA#AA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05300");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) '4', (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test05301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05301");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#aaa#aa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05302");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05303");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!hi!hi!", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05304");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1004-141410040", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05305");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                             #aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05306");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1.0 100.0                  10#-1#100#100#1                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05307");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                 10#-1#100#100#1                   hi!aaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test05308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05309");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '4', 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test05310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05310");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10L, (float) 1L, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05311");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#4#4 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#4 4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05312");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.04-1.0410.04100.040.0", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05314");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), (-1L), 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test05315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1.0 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05316");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10#-1#100#100#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05318");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05319");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) (short) 0, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05320");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05321");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test05322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05322");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                             #AAA#AA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05323");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05324");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10 -1 100 100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05325");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05326");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                 10#-1#100#100#1                   ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test05327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05327");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("00.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05328");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05329");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4', 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
    }

    @Test
    public void test05330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05330");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#4#44a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05332");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                 10#-1#100#100#1                   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05333");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#4#4 4a", (-1.0f));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05334");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!AAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05335");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#4 4a", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05336");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, 100.0d, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test05337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05337");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0 100.", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05338");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, (long) 'a', (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05339");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1004-141410040", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test05340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05340");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0 -1.0 10.0 100.0 0.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05341");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1004-141410040", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05342");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0 -1.0", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05343");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05344");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#AAA#AA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05345");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#### #a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#AAA#AA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAA#AA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05347");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#aaa#aa", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05348");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) '#', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test05349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05349");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, (long) 10, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test05350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05350");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05351");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05352");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05353");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.04-1.041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05354");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!                  10#-1#100#100#1                                    10#-1#100#100#1                  hi!aaaaaaa                  10#-1#100#100#1                  hi!                  10#-1#100#100#1                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05355");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!aaaaaaa                      ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05356");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "hi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!aaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test05357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05357");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1), 0.0d, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05358");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 'a', (double) (byte) -1, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test05359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05359");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05360");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#AAA#AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05361");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05362");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05363");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, (short) 0, 'a', 10.0f };
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray5, '#', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0, 97.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test05364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05365");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 0, (long) 'a', (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test05366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-141410040\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05367");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test05368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05368");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) 0L, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05369");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#4#44a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05371");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 99, 10L, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05372");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                 10#-1#100#100#1                   hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05373");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (double) (short) 0, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05374");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test05375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05375");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (short) 0, (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test05376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05376");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                 10#-1#100#100#1                   hi!aaaaaaa", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05377");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 0, (byte) 1, (byte) 1, (byte) 0, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, 0, 1, 1, 0, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test05378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05378");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(100.0f, 0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05379");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                              AAA#AA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05380");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05381");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05382");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05383");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 -1 100 100 1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05385");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05386");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0 100.0                  10#-1#100#100#1                   ", (double) (-140L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-140.0d) + "'", double2 == (-140.0d));
    }

    @Test
    public void test05387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1004-141410040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1004-141410040\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05388");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05389");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a-1.0a10.0a100.0a0.0", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test05390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05390");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0 100.0                  10#-1#100#100#1                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05391");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test05392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05392");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test05393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05393");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                             #AAA#AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444444444444444444444                  10#-1#100#100#1                   444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444                  10#-1#100#100#1                   444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05395");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#4#44a                       ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05396");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05397");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05398");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (byte) -1, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05399");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 -1.0                                                                                          ", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05400");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 0, 100.0d, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test05401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05401");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) ' ', (double) (short) 1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05402");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!AAAAAAA", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test05403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05403");
        float[] floatArray2 = new float[] { 1.0f, 100.0f };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0 100.0" + "'", str5, "1.0 100.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1.0#100.0" + "'", str7, "1.0#100.0");
    }

    @Test
    public void test05404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05404");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, (double) 0.0f, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05405");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) (byte) 1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05406");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) -1, (double) 10L, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test05407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05407");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a0.001a0.01a0.1-a0.0", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test05408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05408");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                              AAA#AA", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test05409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05409");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05410");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10a-1a100a100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05411");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) (byte) -1, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05412");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
    }

    @Test
    public void test05413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05413");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10 10 0 -1 100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 10 0 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10.0a100.0a0.0a97.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0a100.0a0.0a97.0a10.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05416");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#AAA#AA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05417");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test05418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05418");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10.0a100.0a0.0a97.0a10.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05419");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1#0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05420");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
    }

    @Test
    public void test05421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05421");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test05422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05422");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 0 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass8 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 0]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 0 + "'", byte4 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test05423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05423");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (float) '#', (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05424");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!H1004-141410040");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05425");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (-140.0d), (-140.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-140.0d) + "'", double3 == (-140.0d));
    }

    @Test
    public void test05426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05426");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#0", (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05427");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi!hi!hi!hi!h#4#4 4hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05428");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 1, 0.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: hi!hi!hi!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                 10#-1#100#100#1                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                  10#-1#100#100#1                    is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05431");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) (byte) 100, (int) '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        java.lang.Class<?> wildcardClass15 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test05432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05432");
        double[] doubleArray2 = new double[] { 100.0d, (-1L) };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100.0 -1.0" + "'", str4, "100.0 -1.0");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100.0#-1.0" + "'", str6, "100.0#-1.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test05433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05433");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) '#', (float) (-140L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test05434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05434");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test05435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05435");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1, 100, 100, 1]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#-1#100#100#1" + "'", str7, "10#-1#100#100#1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test05436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05436");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1      ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test05437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05437");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05438");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 100, (byte) 100, (byte) 10, (byte) 100 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "# #   a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: # #   a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 100, 100, 10, 100]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test05439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05440");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# #   a104-14100410041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411hi!hi!hi!", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05441");
        long[] longArray3 = new long[] { 0, (short) 100, (short) 100 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray3, '#', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[0, 100, 100]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test05442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05442");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.04-1.041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04-1.041\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05444");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(10L, (long) 176, (long) 99);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 176L + "'", long3 == 176L);
    }

    @Test
    public void test05445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05445");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, (long) (byte) -1, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05446");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05447");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 1, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05448");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 176L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 176.0d + "'", double2 == 176.0d);
    }

    @Test
    public void test05449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05449");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test05450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05450");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("i!", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05451");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05452");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaa#aa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05453");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#4#44a                       ...", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05454");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) ' ', (float) 1L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05455");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!aaaaaaaaaahi!aaaaaaaaaaaahi!aaaaa", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05456");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '4', (long) 520, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test05457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05457");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!hi!hi!                  10#-1#100#100#1                                     10#-1#100#100#1     ", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05458");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) 'a', 520);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    }

    @Test
    public void test05459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05459");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(176.0d, 176.0d, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 176.0d + "'", double3 == 176.0d);
    }

    @Test
    public void test05460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05460");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444441.0#100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05461");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("140.1-40.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05462");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05463");
        float[] floatArray5 = new float[] { (short) 0, (-1L), (short) 10, 100.0f, (short) 0 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray5, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray5, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[0.0, -1.0, 10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04-1.0410.04100.040.0" + "'", str8, "0.04-1.0410.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a-1.0a10.0a100.0a0.0" + "'", str10, "0.0a-1.0a10.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test05464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 176L, 10.0f, (-140.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-140.0f) + "'", float3 == (-140.0f));
    }

    @Test
    public void test05465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05465");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05466");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44a                       ...#4");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05467");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("HI!HI!HI!10041104-14100410041104-14100410041104-14100410041104-14100410041104-141004100411HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05468");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("AA#AAA#                                                                                             a44#4#0.0a0.001a0.01a0.1-a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05469");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#aaa#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#aaa#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05470");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test05471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05471");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, 176L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 176L + "'", long3 == 176L);
    }

    @Test
    public void test05472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05472");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.04-1.0410.04100.040.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05473");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05474");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05475");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0a-1....");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05476");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0 -1.0 10.0 100.0 0.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test05477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05477");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a-1....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05479");
        short[] shortArray1 = new short[] { (byte) 1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 100, (int) '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test05480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05480");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!aahi!aaaaaaaahi!a10 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 110 -1 100 100 11hi!hi!hi!", (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05481");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-140.0f), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05482");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaahi!aaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05483");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(176, 93, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 176 + "'", int3 == 176);
    }

    @Test
    public void test05484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05484");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# #4a#4a4#   a# ", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05485");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0#100.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05486");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10 10 0 -1 100 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05487");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 'a', 0L, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test05488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05488");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, (long) 520, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test05489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05489");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05490");
        int[] intArray5 = new int[] { (short) 10, (-1), (byte) 100, 100, (byte) 1 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', (int) 'a', (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', (int) (byte) 0, (int) '4');
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 -1 100 100 1" + "'", str15, "10 -1 100 100 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a-1a100a100a1" + "'", str17, "10a-1a100a100a1");
    }

    @Test
    public void test05491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05491");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05492");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#HI!HI!HI!                  10#-1#100#100#1                                     10#-1#100#100#1-1#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05493");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test05494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05494");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 176, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05495");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi!                                                                                              AAA#AAhi!aaaaaaaaaaaahi!aaaaa", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test05496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05496");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) (byte) -1, (float) 520);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 520.0f + "'", float3 == 520.0f);
    }

    @Test
    public void test05497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05497");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test05498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05498");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test05499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05499");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA4AAA#AA.AAA#AA.AAA#AA.AAA#AA");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest10.test05500");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }
}

