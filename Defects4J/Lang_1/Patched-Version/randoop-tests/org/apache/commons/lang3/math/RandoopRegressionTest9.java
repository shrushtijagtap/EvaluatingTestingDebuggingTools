package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("########################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#######################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4502");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2881, (float) 871L, 45.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2881.0f + "'", float3 == 2881.0f);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4504");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(113, 20, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 20 + "'", int3 == 20);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4505");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4506");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...###################10-1.0TRUE-1-1100-1A1AA...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...###################10-1.0TRUE-1-1100-1A1AA...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4507");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 1 100 0 10" + "'", str14, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a1a100a0a10" + "'", str16, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4508");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1#1" + "'", str19, "-1#1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4509");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) (short) 1, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4510");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (short) 52, (int) (byte) 1);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4511");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 75, 53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', 35, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4512");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 110, 8);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4513");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-110A5210A5297AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4514");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4515");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(89, 10041, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4516");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 886, 15);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4518");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 44, (long) 36, 163L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 163L + "'", long3 == 163L);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4519");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4520");
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
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 0, (-1));
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "444444444444442.0    100.0A10.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 444444444444442.0    100.0A10.0A-1.0");
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
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#1#100#0#10" + "'", str15, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10#1#100#0#10" + "'", str27, "10#1#100#0#10");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4521");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1-.-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4522");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4523");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" a52");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4524");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4525");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 23, (int) (byte) 1);
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 0 + "'", short22 == (short) 0);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4526");
        short[] shortArray4 = new short[] { (byte) -1, (byte) -1, (short) 0, (short) 10 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (byte) 100, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 55, 12);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, -1, 0, 10]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-14-140410" + "'", str10, "-14-140410");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1a-1a0a10" + "'", str14, "-1a-1a0a10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4527");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444444444-1.0a52.0 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444-1.0a52.0 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4528");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A# # a.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4529");
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
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 204, 68);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 50, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4530");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#10#97" + "'", str14, "10#10#97");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4531");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 77, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4532");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4533");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4534");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 100, 22);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 63, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-141" + "'", str14, "-141");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1a1" + "'", str16, "-1a1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("- 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 ....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"- 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 ....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4536");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a4#4a100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4537");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("9752.01021hi!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4538");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0 10.0 -1.0" + "'", str8, "100.0 10.0 -1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a-1.0" + "'", str10, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0#10.0#-1.0" + "'", str13, "100.0#10.0#-1.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4539");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("          .0a52.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4540");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4541");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 100, 25);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "...################### 10 -1.0 TRUE-1 -1 100-1A1AA...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...################### 10 -1.0 TRUE-1 -1 100-1A1AA...");
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
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4542");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0452.0" + "'", str9, "-1.0452.0");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4543");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".0a52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4544");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1a0a1a0" + "'", str11, "-1a0a1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1404140" + "'", str13, "-1404140");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4545");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 169, 55);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ', 3866, 30);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 23.0d + "'", double11 == 23.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35.0#23.0#97.0#52.0" + "'", str13, "35.0#23.0#97.0#52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4546");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#####-1 -1 100 10 -1.0 true#####444444444444444444444444444444444444444444444444444444444444444#########");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4547");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 124, 49);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 188, 12);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4548");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0 a 4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4549");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.1-", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4550");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 97, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4551");
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
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "           ##a#a#a###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.                                                                                                                                                                                                  0.1- 0.01 0.001");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:            ##a#a#a###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.                                                                                                                                                                                                  0.1- 0.01 0.001");
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
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#100#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#100#-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4553");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("    1 true   hi!    1 true  ", 144.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 144.0d + "'", double2 == 144.0d);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4554");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 46, 44);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4555");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 1143, 235);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10#-1" + "'", str6, "10#-1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4556");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!-1 -1 100 10 -1.0 TRUE-1 -1 100 ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4557");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...A52.0-1A4#0 1 0 1--1.0A##########################");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4558");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 140L, (long) 47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4559");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4560");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10.0 -1.0                                                                                                                                                                                      ", (double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4561");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4562");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', (int) (short) 1, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 102, 23);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0a1a1a10" + "'", str16, "0a1a1a10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 0 + "'", short21 == (short) 0);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4564");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 10, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4565");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(867, 4141410, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4141410 + "'", int3 == 4141410);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4566");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 20, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0" + "'", str10, "0.0");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4567");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1151, 1098504, 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 113 + "'", int3 == 113);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4568");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                     4444444444444444444444444            -1.0a52.0-1a...", 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4569");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4570");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...##########a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a#a       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4571");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1404140-1.0452.0-1.0452.0-1.0452.0-1.0452.0-1.0452.0-1TRUE-1 -1 100 A#                                                                   # 4-1404140-1.0452.0-1.0452.0-1.0452.0-1.0452.0-1.0452.0-1.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4572");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 52, (short) 0, (short) 52);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4573");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 72.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 72.0f + "'", float2 == 72.0f);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4574");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("9752-#1#29752-#1#29752-#1#2class [ljava-lang-string;class [ljava-lang-string;class [ljava-lang-string");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4575");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(5.0f, (float) 136, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 136.0f + "'", float3 == 136.0f);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4576");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 65, 48);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ');
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100 100 100 10 1" + "'", str18, "100 100 100 10 1");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4577");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 0.0##########\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4578");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4579");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a ", 88);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4580");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1-.-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1--1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- --1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1-.-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.00.25a0.1- true\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4581");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# A# A# A# A# A# A# A# A# A# AA #0.1- 0.01 0.001", 183);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 183 + "'", int2 == 183);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1 100 10 -1.0 true-1 -1 100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4583");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4584");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(5L, (long) 16, 75L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 75L + "'", long3 == 75L);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4585");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(126L, 33L, (long) 386);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 386L + "'", long3 == 386L);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4586");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                   #a 001 1- 1-eurt 0.1- 01 001 1- 1-#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4587");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(188L, 1458L, (long) 197);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4588");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4590");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) 19.0f, (double) 101097.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4591");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 408, 0);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4592");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4593");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 6, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4594");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "1-400141");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1-400141");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4595");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0" + "'", str9, "0.0");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4596");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("A# A# A# A# A# A# A# A# AA# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A# A100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA.0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4597");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4598");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, 10);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 16, 11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
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
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1#0#1#0" + "'", str23, "-1#0#1#0");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4599");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#................................a#0#0#a#0#0#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4600");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4601");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0" + "'", str16, "0.0");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4602");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaa0011-1-eurt0.1-010011-1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0011-1-eurt0.1-010011-1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4603");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#a#aa#aa#aa#aa#aa#aa#aa#aa#aa#", (float) 67);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 67.0f + "'", float2 == 67.0f);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4604");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 140, 42);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0a52.0" + "'", str9, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4605");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("................................A#0#0#A#0#0#", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4606");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100a-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100#-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100#-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100#-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100a-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100", (float) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4607");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(106, 33, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4608");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) (byte) 10, 1100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10 1 100 0 10" + "'", str12, "10 1 100 0 10");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4609");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4610");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 47L, (float) 86, (float) 66);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4611");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 52);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4612");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4613");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4614");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4615");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                4\n4a                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4616");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) 'a', 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 119, 183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 119");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4618");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4619");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 97, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4620");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) 'a', 0);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 1089, 16);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 14, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 359, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4621");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 0, 0);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4622");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(132, 28, 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4623");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...-1 10a #a #a #a #a #a #a #a #a #", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4624");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 2560, 201);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10410497" + "'", str15, "10410497");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("             10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:              10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497                          10410497              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4626");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "04141410" + "'", str13, "04141410");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "04141410" + "'", str16, "04141410");
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4627");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a52.0aaaaaaaaaaaaaaaaaaaa", (float) 54);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 54.0f + "'", float2 == 54.0f);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4628");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0a52.0-1a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a52.0-1a...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4629");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041410040410" + "'", str14, "1041410040410");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 1 100 0 10" + "'", str18, "10 1 100 0 10");
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4630");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 1#1#0#1#1#0 44444444  44444444  44444444  44444444                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4631");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 117, 104);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 10 97" + "'", str11, "10 10 97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a10a97" + "'", str13, "10a10a97");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10#10#97" + "'", str15, "10#10#97");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4632");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 408, 111);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0" + "'", str14, "0.0");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4633");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 977, (long) 2560, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4634");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 13, (long) 352, (long) 101097);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 13L + "'", long3 == 13L);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4635");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaa", (double) 75);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 75.0d + "'", double2 == 75.0d);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4636");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 52, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (byte) 10, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 20, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0A.0 52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4638");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 12, (int) (short) 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100#100#100#10#1" + "'", str20, "100#100#100#10#1");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4639");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 35, 386);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 0 + "'", byte13 == (byte) 0);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4641");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0410.04-1.0                                                                                                  ", (long) 120);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 120L + "'", long2 == 120L);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4642");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4643");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(92, 760, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4644");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 15.0f, (double) 880.0f, (double) 4141410.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4645");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 492, 110.0f, (float) 101L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 492.0f + "'", float3 == 492.0f);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4646");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 111, 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 102L + "'", long17 == 102L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97410041040404102" + "'", str19, "97410041040404102");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4647");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), 0.0f, (float) 111L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 111.0f + "'", float3 == 111.0f);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4648");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) 'a', 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4649");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-#######00.04#0.04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-#######00.04#0.04\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4650");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4651");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaa", (float) 96L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 96.0f + "'", float2 == 96.0f);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4652");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("###.0-1.0a52.0-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4653");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 169, 55);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (byte) 0, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35.0423.0497.0452.0" + "'", str16, "35.0423.0497.0452.0");
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4654");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.25A0.1-", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4655");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4656");
        long[] longArray3 = new long[] { 72, 188L, 65 };
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[72, 188, 65]");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 65L + "'", long4 == 65L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 188L + "'", long5 == 188L);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4657");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00 10 ", (long) 864);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 864L + "'", long2 == 864L);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4658");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0#1#1#10" + "'", str15, "0#1#1#10");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4659");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 1 1 10" + "'", str16, "0 1 1 10");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4660");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 0, 2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 23.0d + "'", double6 == 23.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.0d + "'", double8 == 23.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35.0a23.0a97.0a52.0" + "'", str10, "35.0a23.0a97.0a52.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35.0423.0" + "'", str14, "35.0423.0");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4661");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 16L, 90.0f, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4662");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Aaaaaaaaaaaaa -14-141004104-1.04true-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-1414-141--1411-141A-1411-141A-141");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4663");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("###############################          .0a5-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0 100ang.string;class [ljava.lang.string;class [ljava.lang.string;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4664");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 101);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 101 + "'", int2 == 101);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4665");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4666");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#-1 -1 100 10 -1.0 true-1 -1 100 a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4667");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4668");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0 10.0 -1.0                                                                                                                                                                                      ", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4669");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 47L, (double) 1089, (double) 197L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1089.0d + "'", double3 == 1089.0d);
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4670");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".0A52.0 .0A52.0 .0A52.0 .0A52.0 .0A52.0 0#1#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4671");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 12, 4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 0, 104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4672");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4673");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("97#100#10#0#0#102", (long) 169);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 169L + "'", long2 == 169L);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4674");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa true-1 -1 100 a                                                                                             -1a1##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4675");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', (int) (byte) 100, 10);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray5, '4');
        long long24 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1004100410041041" + "'", str23, "1004100410041041");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4676");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0A52.0 .0A52.0 .0A52.0 .0A52.0 .0A52.0 0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A52.0 .0A52.0 .0A52.0 .0A52.0 .0A52.0 0#1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4677");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4678");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("01a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0a0a01\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4679");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 88, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 88");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10a10a97" + "'", str7, "10a10a97");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4680");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAr.251r.t1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4681");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 100 100 10 1", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4682");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -141, (short) 1, (short) 52);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4683");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("   ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4684");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4685");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long15 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1#1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1#1#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4687");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                               aaaaaaaaaaaaaaaaaaaaaaaaaa #                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4688");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(252, (int) (short) -1, 204);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4689");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 56.0f, 12.0d, (double) 22.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4690");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4691");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 128, (int) (short) 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0#1#1#10" + "'", str19, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4692");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".0a5-1 -1 100 10 -1.0 true-1 -1 100 0.0-1.0a52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4693");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10a10a0a0a10a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4694");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 124, 61);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0a0.0" + "'", str6, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4695");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97#########################################-1.0a52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4696");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 54, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4697");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 86, 68);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4698");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1432, (-141), (int) (short) 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-141) + "'", int3 == (-141));
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4699");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(46, 152, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4700");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 56, 10);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 489, 859);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 489");
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
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4701");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 100, 25);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 183, 1458);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 183");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4702");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaa # a                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaa # a                           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4703");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("           a4#4a            ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4704");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#-1-1#-1AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4705");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 188, 90);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 100, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
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
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4706");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;9752.01029752.01029752.0102class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4707");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
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
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4708");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a5-1 -1-1 -1AAAAAAAAAAAAAAAAAAA...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-aaaa52a52a52a5-1 -1-1 -1AAAAAAAAAAAAAAAAAAA...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041410040410" + "'", str8, "1041410040410");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4709");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("Aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4710");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...AAAAAAAAAAAAAAAAAAA1- 1-1- 1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4711");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 2881, 65);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4712");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#52.0", 22.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22.0f + "'", float2 == 22.0f);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4713");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3866, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4714");
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
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 101, (int) (short) -1);
        long long27 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 197, 2572);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 197");
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1#0#1#0" + "'", str20, "-1#0#1#0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1 0 1 0" + "'", str22, "-1 0 1 0");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4715");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 102, 0);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
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
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4716");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("...################### 10 -1.0 TRUE-1 -1 100-1A1AA...", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4717");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10041" + "'", str14, "10041");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4718");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -141, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4719");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 102L, (double) 33L, (double) 89);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 33.0d + "'", double3 == 33.0d);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4720");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4721");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("true-1 1 aaaa52a52a52a52a52a52a52a52a52a520.25a0.1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4722");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                               44a4aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4723");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 32L, (double) 44.0f, (double) 124L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 124.0d + "'", double3 == 124.0d);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4724");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 55L, (double) 48.0f, (double) 1.0410497E7f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4725");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4726");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 24, 359L, (long) 36);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4727");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1041410040410" + "'", str12, "1041410040410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10a1a100a0a10" + "'", str14, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1041410040410" + "'", str18, "1041410040410");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#1#100#0#10" + "'", str20, "10#1#100#0#10");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4728");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...2.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52....####################################################", (double) 54);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 54.0d + "'", double2 == 54.0d);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4729");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 53, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4730");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("             101097                              a #                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4731");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0#1#1#0#1#1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4732");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-rr-rrruurrur-r.urTRUE-rr-rrruu52.0                                                     -1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4733");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("- 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 . 0 - 1 . 0 # 52 ....", (float) 26L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 26.0f + "'", float2 == 26.0f);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4734");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4735");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4736");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1 ", 54);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 54 + "'", int2 == 54);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4737");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 13, (double) 16L, 1041049.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 13.0d + "'", double3 == 13.0d);
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4738");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4739");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4740");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaa aaaa -aaa141004-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4741");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(52, 48, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4742");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(51, 45, 2881);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4743");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa-1-1-1-1aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4744");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 23, 8);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-141" + "'", str17, "-141");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4745");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1#1" + "'", str14, "-1#1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4746");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, 55.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4747");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 0 + "'", byte9 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 0 + "'", byte10 == (byte) 0);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4748");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-141-141-141-141-141-10.00.0-141-141-141-141-141-1444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4749");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4750");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4751");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0-1.######################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4752");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 169, 140);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 386, 3995);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 386");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4753");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("true-1 -1 100 -1 -1 100 10 -1.0 tru44444444440#1#1#10\n          10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100 -1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4754");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 49, 864);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 49");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4755");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 5.0f, 144.0d, (double) 79);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4756");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0" + "'", str8, "0.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4757");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(51.0f, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4758");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A                                                                                             -1A1##", (double) 5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 5.0d + "'", double2 == 5.0d);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4759");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a4#0 1 0 1--1.0a52.0-1a...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4760");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97##00##0#0#0##02-1.0a52.", 4.4444444444444445E51d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E51d + "'", double2 == 4.4444444444444445E51d);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4761");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
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
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4762");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("CL SS [lJ V .L NG.sTRIN          .0 52.0a          .0 52.0a          .0 52.0a          .0 52.0a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"CL SS [lJ V .L NG.sTRIN          .0 52.0a          .0 52.0a          .0 52.0a          .0 52.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4763");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#####-1 -1 100 10 -1.0 true#####444444444444444444444444444444444444444444444444444444444444444#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4764");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 867, 119);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#0.0" + "'", str9, "0.0#0.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0a0.0" + "'", str11, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4765");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 124, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#10#97" + "'", str10, "10#10#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#10#97" + "'", str12, "10#10#97");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10a10a97" + "'", str18, "10a10a97");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#10#97" + "'", str20, "10#10#97");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4766");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("           ##a#a#a###-rr-rrruurrur-r.urTRUE-rr-rrruu52.0                                                     -1.   0#1#1.           ", (long) 163);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 163L + "'", long2 == 163L);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4767");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.0 ....0a52.0 .0a52.0 .0a52.04444444444444 #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4768");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  -#a#aaaaaaaaaaaaaaaaaaaaaaaa####################################################aaaaaaaaaaaaaaaaaaaaaaaa#################################### #-## #true-##-###  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4769");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(75.0d, (double) 75.0f, 41.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 75.0d + "'", double3 == 75.0d);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-4-1#1-1#1-#######00.04#0.04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4771");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(16, 179, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 179 + "'", int3 == 179);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4772");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 16L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4773");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 1, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4774");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("35.0 23.0 97.0 52.", (long) 4);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4775");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', 0, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4776");
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
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 408, 80);
        short short28 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
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
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 1 + "'", short23 == (short) 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + short28 + "' != '" + (short) 100 + "'", short28 == (short) 100);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4777");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0410.04-1.0                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4778");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
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
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4779");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 174);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 174 + "'", int2 == 174);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4780");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4781");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 12, (long) 26, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4782");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                               aaaaaaaaaaaaaaaaaaaaaaaa -1a1", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4783");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 60, 54);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10041" + "'", str11, "10041");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 1 + "'", short17 == (short) 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100#1" + "'", str19, "100#1");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4784");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("... ## ## ## ## ## ...10a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110a-110");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4785");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(36, 2439, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2439 + "'", int3 == 2439);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4786");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 52, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4787");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.25a0.1--1404140-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.25a0.1--1404140-1 -1 100 10 -1.0 true-1 -1 100 a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4788");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 3224, 49);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 14, 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4789");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                            1004                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4790");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 97, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4791");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97410041040404102" + "'", str14, "97410041040404102");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4792");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410104141004041010414100404101041410040410");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4793");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) ' ', (int) (byte) 1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4794");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4795");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 169, 55);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 1100, 34);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 23.0d + "'", double11 == 23.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35.0#23.0#97.0#52.0" + "'", str13, "35.0#23.0#97.0#52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 23.0d + "'", double19 == 23.0d);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1-110010-1.0true-1-11000#1#1#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1-110010-1.0true-1-11000#1#1#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4797");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4798");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(263L, (long) 91, (long) 105);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 91L + "'", long3 == 91L);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4799");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0410.04-1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100.0410.04-1.0                                          is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4800");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0a10.0a-1.0" + "'", str11, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0410.04-1.0" + "'", str14, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4801");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4802");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 15.0f, (double) (short) 10, (double) 263.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4803");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a###a          .0 52.0          .0 52.0          .0 52.0          .0 52.0          .0 52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4804");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("A4#4A100.0 10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4805");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ", (double) 1432);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1432.0d + "'", double2 == 1432.0d);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4806");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) -141, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4807");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 107L, (float) 60L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4808");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(864, 40, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 40 + "'", int3 == 40);
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A #A #A #A #A #A #A #A #A #A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A #A #A #A #A #A #A #A #A #A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4810");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 35, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 489, 1);
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 10 + "'", short22 == (short) 10);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 10 + "'", short23 == (short) 10);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4811");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 162, 107);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 760, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1.0a52.0#0.0#A #A #A #A #A #A #A #A #A #A ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0a52.0#0.0#A #A #A #A #A #A #A #A #A #A ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4812");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#a52.0 .0a52.0 .0a52.0 .0a52.0 .0a5-4--a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#a52.0 .0a52.0 .0a52.0 .0a52.0 .0a5class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4813");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(87.0f, (float) 204, (float) 204L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 204.0f + "'", float3 == 204.0f);
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4814");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("##############################################################################################################################################################################################97    -1.0A52.0    ####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n52.0    -1.0A52.0    ####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##############################################################################################################################################################################################97    -1.0A52.0    ####################################################-1.0a52????????????????????????????????????????????????????52.0    -1.0A52.0    ####################################################-1.0a52????????????????????????????????????????????????????102\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" #a #a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4816");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 22.0f, 0.0d, (double) 110L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4817");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 124, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 124");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4818");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("####");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4819");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 2762, 22);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4820");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (short) 1, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1#1" + "'", str22, "-1#1");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4821");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 106, (long) 49, (long) 3995);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3995L + "'", long3 == 3995L);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4822");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4823");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4824");
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
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 867, 120);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4825");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10", 72.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 72.0d + "'", double2 == 72.0d);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4826");
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
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
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
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10a1a100a0a10" + "'", str21, "10a1a100a0a10");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 0 + "'", byte22 == (byte) 0);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4827");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 5, (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#1#100#0#10" + "'", str18, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4828");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44a4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 44a4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4829");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                              -1.0a52.0aaaaaaaaaaaaaaaaaaaa                           ##############################################################97#100#10#0#0#102-1 100 10 -1.0 tru");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4830");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0a1a1a10" + "'", str17, "0a1a1a10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4831");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(82, 34, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 82 + "'", int3 == 82);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4832");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A          A          A          A          A       -1-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4833");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("TRUE--AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"TRUE--AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4834");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0", (double) 1143.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1143.0d + "'", double2 == 1143.0d);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4835");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 96, 53);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100a1" + "'", str6, "100a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4836");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4837");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
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
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4838");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1" + "'", str14, "100 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100#1" + "'", str16, "100#1");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4839");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4840");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4841");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 52.0d + "'", double10 == 52.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4842");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 44, (int) (short) -141);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 104, 33);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 1 + "'", short10 == (short) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100 1" + "'", str20, "100 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100a1" + "'", str22, "100a1");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4843");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4844");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, '#');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100#100#100#10#1" + "'", str15, "100#100#100#10#1");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4845");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 169, 140);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, 0);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4846");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 11, 0);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int22 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int23 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4847");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0a52.0" + "'", str13, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4848");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4849");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA100A100A100A10A1              1004100410041041               ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4850");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 408, 56);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4851");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 52, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97410041040404102" + "'", str19, "97410041040404102");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4852");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-eurt 0.1- 01 001 1- 1-!ih7925a0125a01# a# a# a# a# a# a# a# a# a01 1- 1-euA1A1-                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4853");
        double[] doubleArray3 = new double[] { 3.0f, 3224.0f, 72.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 48, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[3.0, 3224.0, 72.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.0d + "'", double8 == 3.0d);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4854");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0" + "'", str7, "0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0" + "'", str9, "0.0");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4855");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 263, (long) 144, (long) 77);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 77L + "'", long3 == 77L);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4856");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#1" + "'", str10, "-1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1a1" + "'", str12, "-1a1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4858");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(3866.0f, 0.0f, (float) 22);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4859");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 10);
        double double20 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0" + "'", str15, "100.0");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4860");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 102, (int) (byte) 1);
        long long21 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 100L + "'", long21 == 100L);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4861");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("           ##a#a#a###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a52.###.#a5          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1.            ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4862");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("TRUE44 44 444 A4                                                                   4 a", 262);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 262 + "'", int2 == 262);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4863");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("          .0A52.0   -1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...0          .0A52.0          .0A52", 65.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 65.0f + "'", float2 == 65.0f);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4864");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 57, 4141410);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4865");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4866");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA#################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4867");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 54, (float) 144, 2881.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2881.0f + "'", float3 == 2881.0f);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4868");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 169, 140);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 0, 78);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4869");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4870");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 11, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short21 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a1" + "'", str15, "100a1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 1" + "'", str17, "100 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10041" + "'", str19, "10041");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
        org.junit.Assert.assertTrue("'" + short21 + "' != '" + (short) 1 + "'", short21 == (short) 1);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4871");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# A# A# A# A# A# A# A# A# A#                                                                        ", (long) 117);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 117L + "'", long2 == 117L);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4872");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 1432, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4873");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 0, 60);
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
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 1 100 0 10" + "'", str13, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10#1#100#0#10" + "'", str16, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" a ################# # # #a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  a ################# # # #a  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4875");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 15, 14);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4876");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("04141410", 1.0410497E7d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4141410.0d + "'", double2 == 4141410.0d);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4877");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 871, 867);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 52.0d + "'", double13 == 52.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4878");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("####", 676);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 676 + "'", int2 == 676);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4879");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 10041.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10041.0d + "'", double2 == 10041.0d);
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4880");
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
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 90, 10);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 94, 0);
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4881");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# A# A# A# A# A# A# A# A# A# A", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4882");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("01110-1a1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4883");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(55L, 0L, 41L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4884");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 56L, (double) 32, (double) 119L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 119.0d + "'", double3 == 119.0d);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4885");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a", (long) 26);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 26L + "'", long2 == 26L);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4886");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0A52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4887");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("##a##a##a##a##a##a##a##a##aa##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##a##a##a##a##a##a##a##a##aa##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a##a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4888");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3, 30, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4889");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        short short18 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0a1a1a10" + "'", str17, "0a1a1a10");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 10 + "'", short18 == (short) 10);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4890");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("... #A #A #A #A #A #A #9752.0102");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4891");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 11, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a1" + "'", str15, "100a1");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4892");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a 100 10 -1.0 true-1 -1 100 a# #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String; #a #a #a #a #a #a #a #a #a # #a #a #a #a #a-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa010410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaatrue10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-10410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa110410497141004-1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4893");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("# A# A# A# A# A# A# A# A# A# A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4894");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!11-11-1  -1 -111 - 10 11-11-1  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4895");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 90, 9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0#52.0" + "'", str17, "-1.0#52.0");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4896");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4897");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02-1.052.0", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4898");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(58, 33, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4899");
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
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1041410040410" + "'", str19, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 0 + "'", byte20 == (byte) 0);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4900");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 867, 263);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a10.0a-1.0" + "'", str13, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0a10.0a-1.0" + "'", str16, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4901");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0a1a1a10" + "'", str19, "0a1a1a10");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4902");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4903");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444440#1#1#0#1#11-400141");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4904");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 156, 5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 0, 117);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4905");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4906");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444444444444444444444444-1 -1-1 -1AAAAAAAAAAAAAAAAAAA...", (long) 14);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 14L + "'", long2 == 14L);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4907");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1#1" + "'", str17, "-1#1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1#1" + "'", str19, "-1#1");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4908");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a-1.0" + "'", str10, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0 10.0 -1.0" + "'", str13, "100.0 10.0 -1.0");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4909");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97#100#10#0#0#102" + "'", str12, "97#100#10#0#0#102");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97a100a10a0a0a102" + "'", str14, "97a100a10a0a0a102");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4910");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0410.04-1.0ru1ru1u--1u-1ru-1trueru1ru1u--1hi!ru1ru1u--1u-1ru-1trueru1ru1u--ru1ru1u--1u-1ru");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4911");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 2560L, (double) 86, Double.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4912");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 101L, (float) 45L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4913");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A #A #A #A #A #A #A #A #A #A #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A #A #A #A #A #A #A #A #A #A #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4914");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1404140#-1 -1 100 10 -1.0 true-1 -1 100 a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4915");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a1" + "'", str9, "-1a1");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4916");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 55, 1151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 55");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4917");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52    -1.0A52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4918");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("35.0 23.0 97.0 52.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35.0 23.0 97.0 52.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4919");
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
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
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
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "100 1" + "'", str27, "100 1");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4920");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(87, 1100, 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 87 + "'", int3 == 87);
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4921");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 0, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 45, 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4922");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 48, (double) 9752.01f, (double) 53);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4923");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(35.0d, (double) 263.0f, 163.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 263.0d + "'", double3 == 263.0d);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4924");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 11, (int) (short) -141);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4925");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4926");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 102, 35);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1 0 1 0" + "'", str11, "-1 0 1 0");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4927");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, (double) 90L, (double) 100L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4928");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1a100a-1" + "'", str8, "1a100a-1");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4929");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4930");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0A52.0-4--", (float) 188);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 188.0f + "'", float2 == 188.0f);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4931");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##1#1-                                                                                             # 001 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97410041040404102aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                   -1404140# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a-1#1-1#1-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4932");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0410.04-1.0ru1ru1u--1u-1ru-1trueru1ru1u--1hi!ru1ru1u--1u-1ru-1trueru1ru1u--ru1ru1u--1u-1ru", 19.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 19.0f + "'", float2 == 19.0f);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4933");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 100, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0452.0" + "'", str9, "-1.0452.0");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4934");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4935");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 101097L, 0.0f, (float) 492);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4936");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a0.0" + "'", str10, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 0.0" + "'", str12, "0.0 0.0");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4937");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1151, (double) 408L, (double) 90.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1151.0d + "'", double3 == 1151.0d);
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4938");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 29, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray5, " #\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...a5.5");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  #?????????????????????????????????????????????????????????????????????...a5.5");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041410040410" + "'", str15, "1041410040410");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4939");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "97a100a10a0a0a102" + "'", str12, "97a100a10a0a0a102");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4940");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 1170, 67);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 10 97" + "'", str10, "10 10 97");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4941");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" HI!10.0a10.0a102.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4942");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4943");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0a0.0" + "'", str10, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0#0.0" + "'", str12, "0.0#0.0");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4944");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                            -1A1A", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                  #-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4946");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 0, 61);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4947");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("             10410497                              a #                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297", (float) 34L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 34.0f + "'", float2 == 34.0f);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4948");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4949");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0 1 1 10...                                             ...100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4950");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 65, 15);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
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
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.0f + "'", float15 == 0.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.0f + "'", float16 == 0.0f);
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4951");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#1#100#0#10" + "'", str14, "10#1#100#0#10");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4952");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...     ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4953");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("     44444444  44444444  44444444  44444444 0#1#1#0#1#1#", (double) 103);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 103.0d + "'", double2 == 103.0d);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4954");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0410497", (double) 880);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 410497.0d + "'", double2 == 410497.0d);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4955");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 179, 96.0f, (float) 97);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 96.0f + "'", float3 == 96.0f);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4956");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 17, 3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double16 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 52.0d + "'", double16 == 52.0d);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4957");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("HI!", (double) 20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 20.0d + "'", double2 == 20.0d);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4958");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(36, 136, 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 36 + "'", int3 == 36);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4959");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1432, 101L, (long) 204);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1432L + "'", long3 == 1432L);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4960");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 34, 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10 1 100 0 10" + "'", str16, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10 1 100 0 10" + "'", str19, "10 1 100 0 10");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4961");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0410.04-1.0" + "'", str8, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.0 10.0 -1.0" + "'", str11, "100.0 10.0 -1.0");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4962");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
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
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 0.0f + "'", float19 == 0.0f);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4963");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("class [Ljava.laa4#4ava.lang.String;");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4964");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 201, 0);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 0 + "'", short15 == (short) 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4965");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                               44a4aaaaaaaaaaaaaaaaaaaaaaa", (float) 49);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 49.0f + "'", float2 == 49.0f);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                               aaaaaaaaaaaaaaaaaaaaaaaa -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                               aaaaaaaaaaaaaaaaaaaaaaaa -1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4967");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaa # a", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4968");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" -1 100 9752.0102", (float) 169);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 169.0f + "'", float2 == 169.0f);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4969");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                     444444444444# #...4444444444444", (short) -141);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -141 + "'", short2 == (short) -141);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("       # a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"# a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4971");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
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
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4972");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           a###a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            a###a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4973");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) 0 + "'", short18 == (short) 0);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4974");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(63, 1098504, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46 + "'", int3 == 46);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4975");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa97410041040404102aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4976");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a1a100a0a10" + "'", str11, "10a1a100a0a10");
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4977");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("               35.0a23.0a97.0a52", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4978");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 41, 8);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1.0452.0" + "'", str21, "-1.0452.0");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1.0452.0" + "'", str23, "-1.0452.0");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4979");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(31.0d, (double) Float.POSITIVE_INFINITY, (double) 864L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + Double.POSITIVE_INFINITY + "'", double3 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4980");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1--1--1--1--1--1--1--1--1--1-1--1--1--1--1--1--1--1--1--1-1--1--1--1--1--1--1--1--1--1-cl-ss...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4981");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52", 87);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 87 + "'", int2 == 87);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4982");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(91, 95, 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4983");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 102, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 11, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (-1), 18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 1 + "'", short13 == (short) 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a1" + "'", str15, "100a1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100 1" + "'", str17, "100 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10041" + "'", str19, "10041");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 1 + "'", short20 == (short) 1);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4984");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 0 + "'", byte12 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4985");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 87, 0);
        long long21 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4986");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1-110010-1.0true-1-1100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUE-1 -1 100-1A1AAAAAAAAAAAAAAAAAAAAAAAA                                                    AAAAAAAAAAAAAAAAAAAAAAAA################################## 10 -1.0 TRUEaaa1aaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4987");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#-1-110010-...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1-110010-...");
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
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4988");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35.0423.0497.0452.0" + "'", str8, "35.0423.0497.0452.0");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4989");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 169, 55);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#');
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '4', 1100, 34);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 23.0d + "'", double11 == 23.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35.0#23.0#97.0#52.0" + "'", str13, "35.0#23.0#97.0#52.0");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 97.0d + "'", double14 == 97.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35.0 23.0 97.0 52.0" + "'", str20, "35.0 23.0 97.0 52.0");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4990");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 60.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4992");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 166, 60);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 52.0" + "'", str13, "-1.0 52.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4993");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1A0A1A0-1.0A.0a52..0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4994");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                        ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4995");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1404140.0f), 1432.0f, (float) 252);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1432.0f + "'", float3 == 1432.0f);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4996");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4997");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4998");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test4999");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("52.0-1a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0#-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 1-1 -1 100 10 -1.0 true-1 -1 100 -1.-1 -1 100 10 -1.0 true-1 -1 100 TRUE-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 A                                                                                             -1A152.0-1a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest9.test5000");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 72, 22.0d, (double) 101);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.0d + "'", double3 == 22.0d);
    }
}

