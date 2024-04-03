package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01001");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0 100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01002");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4aa4a4\r");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01003");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) 16, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test01004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01004");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" #35#   #  #- # hi!     . lass [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test01005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01006");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("97a100a1a0a100a3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97a100a1a0a100a3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01008");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 4L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4L + "'", long2 == 4L);
    }

    @Test
    public void test01009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01009");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 53, (long) 1, 16L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 53L + "'", long3 == 53L);
    }

    @Test
    public void test01010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01010");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 140L, (double) 1, (double) 140.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test01011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1hi! 10 100.hi!hi!010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01012");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aa4a4                                                52.010.0-1.0-1.010.052.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("lass [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"lass [Cclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01014");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0...10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h10...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h00001#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#010...10#-1#0...10#-1#0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test01015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01015");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a", (float) 81);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 81.0f + "'", float2 == 81.0f);
    }

    @Test
    public void test01016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01016");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 4, (long) 30);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 30L + "'", long3 == 30L);
    }

    @Test
    public void test01017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01017");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "44!!4444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44!!4444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 1 + "'", byte20 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 0 + "'", byte21 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 1 + "'", byte22 == (byte) 1);
    }

    @Test
    public void test01018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01018");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, (long) 824, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 824L + "'", long3 == 824L);
    }

    @Test
    public void test01019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01019");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01020");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.", (long) 140);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 140L + "'", long2 == 140L);
    }

    @Test
    public void test01021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01021");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 110, (float) 140);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01022");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, (double) 110, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01023");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01024");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("143541004\r", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("ii  0 000.00.  0 00  0 00  0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01026");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a-1A10A100A97A97A35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01027");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.Class<?> wildcardClass9 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01028");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                               aa4a4                                                100#-1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                aa4a4                                                100#-1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
    }

    @Test
    public void test01029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01029");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01030");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97A100A1A0A100A3", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01031");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(26, (int) 'a', 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test01032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01032");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1 0...10#-1#010a100a100a1a-1a", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test01033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01033");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01034");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01035");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01036");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                            a 4 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01037");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 32, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test01038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01038");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 25, 824);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a0" + "'", str18, "1a0");
    }

    @Test
    public void test01039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01039");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("tring;class[LjavalangString;class[LjavalangString;class[LjavalangString");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01040");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
    }

    @Test
    public void test01041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaa1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaa1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01042");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.Class<?> wildcardClass13 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01043");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01044");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("041hi! 10 100.1#0.1-0.010.11#0.1-0.010.11#0.1-0.010.", (float) 17L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test01045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01046");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1), 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01047");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "00a4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 00a4444aaa44444a4444aa44444a4444hia4444!a4444hia4444!a4444aaa44444a4444aa44444a4444 a4444aaa44444a4444aa444444a4444aaa44444a4444aa44444a4444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test01048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01048");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("3 35", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 47 + "'", int2 == 47);
    }

    @Test
    public void test01049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01049");
        double[] doubleArray6 = new double[] { 97.0d, 1.0f, 1L, (-1.0f), (byte) 1, (-1.0f) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[97.0, 1.0, 1.0, -1.0, 1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97.041.041.04-1.041.04-1.0" + "'", str8, "97.041.041.04-1.041.04-1.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test01050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01050");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#35#   #  #- # hi!     .");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        byte[] byteArray7 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray7, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray7, ' ', (int) (byte) 1, 0);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray7, 'a');
        java.lang.Class<?> wildcardClass17 = byteArray7.getClass();
        short[] shortArray19 = new short[] { (byte) -1 };
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray19);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray19, '4', (int) (short) 100, 0);
        short short25 = org.apache.commons.lang3.math.NumberUtils.max(shortArray19);
        short short26 = org.apache.commons.lang3.math.NumberUtils.min(shortArray19);
        java.lang.Class<?> wildcardClass27 = shortArray19.getClass();
        int[] intArray29 = new int[] { (byte) -1 };
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join(intArray29, ' ');
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(intArray29, '#');
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join(intArray29, '#');
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join(intArray29, ' ');
        int int38 = org.apache.commons.lang3.math.NumberUtils.max(intArray29);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(intArray29, ' ');
        java.lang.Class<?> wildcardClass41 = intArray29.getClass();
        java.lang.String[] strArray44 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray45 = org.apache.commons.lang3.StringUtils.stripAll(strArray44);
        java.lang.String str47 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray44, "1#0.1-0.010.1");
        java.lang.Class<?> wildcardClass48 = strArray44.getClass();
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.split("10a-1", "...10#-1#0");
        java.lang.Class<?> wildcardClass52 = strArray51.getClass();
        java.lang.reflect.Type[] typeArray53 = new java.lang.reflect.Type[] { wildcardClass4, wildcardClass17, wildcardClass27, wildcardClass41, wildcardClass48, wildcardClass52 };
        java.lang.reflect.Type[][] typeArray54 = new java.lang.reflect.Type[][] { typeArray53 };
        java.lang.String str55 = org.apache.commons.lang3.StringUtils.join(typeArray54);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#0" + "'", str9, "1#0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 1 + "'", byte14 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a0" + "'", str16, "1a0");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(shortArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray19), "[-1]");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) -1 + "'", short20 == (short) -1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-1" + "'", str33, "-1");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-1" + "'", str35, "-1");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "-1" + "'", str37, "-1");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-1" + "'", str40, "-1");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(typeArray53);
        org.junit.Assert.assertNotNull(typeArray54);
    }

    @Test
    public void test01051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01051");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 11, (float) 2L, (float) 30L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 30.0f + "'", float3 == 30.0f);
    }

    @Test
    public void test01052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01052");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("        0#-1#0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01053");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', (int) (short) 1, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test01054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01054");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("041");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 33 + "'", number1, 33);
    }

    @Test
    public void test01055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("52.0410.04-1.04-1.0410.0452.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0410.04-1.04-1.0410.0452.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01056");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1 0...1..", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test01057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01057");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01058");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01059");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0 100.0 52.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test01060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01060");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4a a a#a#a#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01061");
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
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "[Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;class");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: [Ljava.lang.String; [Ljava.lang.String;class [Ljava.lang.String;class 1041001041001041001041.010.0-1.0tring;class");
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
    public void test01062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01062");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01063");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4              -1a10a100a97a97a35                                                                                  4              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4              -1a10a100a97a97a35                                                                                  4              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01065");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0 10.0 -1.0i!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01066");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 33, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str13, "52.0 10.0 -1.0 -1.0 10.0 52.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52.0#10.0#-1.0#-1.0#10.0#52.0" + "'", str15, "52.0#10.0#-1.0#-1.0#10.0#52.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str17, "52.0a10.0a-1.0a-1.0a10.0a52.0");
    }

    @Test
    public void test01067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01067");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("16.041.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test01068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01068");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 95, (double) 47L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 95.0d + "'", double3 == 95.0d);
    }

    @Test
    public void test01069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01069");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("01A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01070");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444 0#-1#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01071");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1.0a0.0" + "'", str10, "1.0a0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test01072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01072");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                            a 4 4", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01073");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test01074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01074");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 9, 824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 824 + "'", int3 == 824);
    }

    @Test
    public void test01075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01075");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01076");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1#35#100#10#-1#0HI! 10 100.0143541004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1#35#100#10#-1#0\r                                               aa4a4                                                52.010.0-1.0-1.010.052.00#-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1#35#100#10#-1#0?                                               aa4a4                                                52.010.0-1.0-1.010.052.00#- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01078");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(271, 0, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 271 + "'", int3 == 271);
    }

    @Test
    public void test01079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01079");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 81, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test01080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01080");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test01081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01081");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, 10.0f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test01082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01082");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1010101010101010101010101010101010101010101010101010101010101010");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test01083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01083");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("143541004aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01084");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 52, 13);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 130, 17);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1" + "'", str18, "-1");
    }

    @Test
    public void test01085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01085");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3L + "'", long10 == 3L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test01086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01086");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 52.0f + "'", float12 == 52.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 52.0f + "'", float13 == 52.0f);
    }

    @Test
    public void test01087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01087");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.143541004104-1401.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.HI! AA AAAAAA##AAA#AA#AA#A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10#-1#01#35#100#10#-1#01#35#100#10#1-a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#-1#01#35#100#10#-1#01#35#100#10#1-a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01089");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01090");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a4a 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01091");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AA4A4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01092");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(130.0d, (double) 29, (double) 22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 22.0d + "'", double3 == 22.0d);
    }

    @Test
    public void test01093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01093");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test01094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01094");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97ii  0 000.00.  0 00  0 00  0 0\r");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01095");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) '4', (float) 109, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 109.0f + "'", float3 == 109.0f);
    }

    @Test
    public void test01096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01096");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01097");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(571, (int) (short) 1, 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01098");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10 1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01099");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0 10.0 -1.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01100");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4a a a#a#a#################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01101");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 10, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
    }

    @Test
    public void test01102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01102");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.Class<?> wildcardClass9 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" #35#   #  #- #  #35#   #  #- #  #35#   #  #- # ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#35#   #  #- #  #35#   #  #- #  #35#   #  #- #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01104");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(47.0d, (double) 1, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test01105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01105");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "   !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0\r                                               aa4a4                                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:    !i1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#116.0A1.0001a1-a1a001a001a010#-1#0#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#0?                                               aa4a4                                                ");
        } catch (java.io.UnsupportedEncodingException e) {
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
    }

    @Test
    public void test01106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01106");
        int[] intArray0 = new int[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, 'a', 16, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01107");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01108");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a7a3500aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4 aa4a44aa4a4\r00aa4a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01109");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                           #35#   #  #- # hi!     . ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01110");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, (double) 97L, 11.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01111");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 97, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test01112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01112");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("               !ih              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("104-140HI!a1a-1a10a1a-1a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"104-140HI!a1a-1a10a1a-1a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01114");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aa4a4hi!hi!aa4a4 aa4a44aa4a4\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01115");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 52, (long) 83, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test01116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01116");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, (-1));
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) -1 + "'", short12 == (short) -1);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
    }

    @Test
    public void test01117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01117");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa        0#-1#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01119");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 10, (long) 49, (long) 44);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test01120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01120");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 0, (double) 14, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.0d + "'", double3 == 14.0d);
    }

    @Test
    public void test01121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01121");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 2, (double) 95, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test01122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01122");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.00#-1#01#35#100#10#-1#0hi!10100.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test01123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01123");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("97ii  0 000.00.  0 00  0 00  0 0\r                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01124");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1-#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.01.010.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01127");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(20, 0, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test01128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("  1.0#2.0#10.0#16.0#3.0#2.0   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"  1.0#2.0#10.0#16.0#3.0#2.0   \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01129");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
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
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1a0" + "'", str20, "1a0");
    }

    @Test
    public void test01130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01130");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi4!4hi4!                        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01131");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01132");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test01133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01133");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01134");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 83, 49);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 52, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01135");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100a-1a1a100ahi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!ih.!h!.!-h.!hi35ih!!ih!i-hi!hi35ih!!ih!i-hi!hi35ih!!ih!i-100", (double) 17);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 17.0d + "'", double2 == 17.0d);
    }

    @Test
    public void test01136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01136");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 0, 35.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test01137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01137");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                           1 0...10#-1#0                                            971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.03", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test01138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01138");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1L), (double) 6, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test01139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01139");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 83, (double) 824L, (double) 107.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 83.0d + "'", double3 == 83.0d);
    }

    @Test
    public void test01140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01140");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#1-#01...0 10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("16.0 1.0######################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"16.0 1.0######################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h1 0...10#-1#010a100a100a1a-1a100hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01143");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 39, (float) 17L, (float) 83);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 83.0f + "'", float3 == 83.0f);
    }

    @Test
    public void test01144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01144");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("97A100A1A0A100A3", (float) 16);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test01145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01145");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01146");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 35, (double) 16.0f, (double) 24L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test01147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01147");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) ' ', (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "52.0a10.0a-1.0a-1.0a10.0a52.0" + "'", str18, "52.0a10.0a-1.0a-1.0a10.0a52.0");
    }

    @Test
    public void test01148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01148");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 107, 32);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test01149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01149");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01150");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("\ra#4#4", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test01151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01151");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(13, 109, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test01152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01152");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01153");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test01154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01154");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1 10" + "'", str7, "-1 10");
    }

    @Test
    public void test01155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01155");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                 a4                  ", 104100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 104100L + "'", long2 == 104100L);
    }

    @Test
    public void test01156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01156");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("##35##00##0####0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01157");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("A4444", (long) 24);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 24L + "'", long2 == 24L);
    }

    @Test
    public void test01158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01158");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0 0 -1 -1 1 1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01159");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(11111.0f, (float) 3, (float) 49);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11111.0f + "'", float3 == 11111.0f);
    }

    @Test
    public void test01160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01160");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a1a-1a    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01161");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4aa4a4\r", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test01162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01162");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01163");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("44 4 4#4#4#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01164");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01165");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.Class<?> wildcardClass20 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 0 + "'", byte14 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "140" + "'", str16, "140");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1a0" + "'", str18, "1a0");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test01166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01166");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444444444444444444HI!HI!", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01167");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1#35#100#10#-1#0HI! 10 100.0143541004", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test01168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01168");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 10, (float) 824L, (float) 140L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test01169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01169");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0#2.0#10.0#16.0#3.0#2.0aaaaaaaaaaaaaaaaaaaaaaaaa...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01170");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("\r1.0a10.0a-1.0", (double) 824);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 824.0d + "'", double2 == 824.0d);
    }

    @Test
    public void test01171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01171");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hia!ahia!1#35#100#10#-1#0HI! 10 100.0", (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test01172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01172");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1A10A100A97A97A35");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1A10A100A97A97A35");
        } catch (java.io.UnsupportedEncodingException e) {
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
    }

    @Test
    public void test01173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01173");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01174");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r97ii  0 000.00.  0 00  0 00  0 0\r");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01175");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("HI!10100.01435410044444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01176");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(2.0d, 0.0d, (double) 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01177");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444 0#-1#", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test01178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01178");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01179");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("041", (double) 107);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 41.0d + "'", double2 == 41.0d);
    }

    @Test
    public void test01180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01180");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) 10, 0);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray4, ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 100.0 -1.0 0.0" + "'", str12, "-1.0 100.0 -1.0 0.0");
    }

    @Test
    public void test01181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01181");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                            A 4 4\r\r\r\r\r\r\r\r\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01182");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("###################################010#-1#0a001a001a1a1-a001###################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01183");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01184");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...A97A35");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01185");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01186");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0100.0-1.00.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01187");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) -1, 14.0d, (double) 301);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 301.0d + "'", double3 == 301.0d);
    }

    @Test
    public void test01188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01188");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(40.0d, 0.0d, (double) 17.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01189");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("...10#-1#0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01190");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("...041001041.010.0-1.0a1041001041001041001041.010...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01191");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 0, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1.0 2.0 10.0 16.0 3.0 2.0" + "'", str21, "1.0 2.0 10.0 16.0 3.0 2.0");
    }

    @Test
    public void test01192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01192");
        short[] shortArray1 = new short[] { (byte) 10 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01193");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("143541004104-140HI!a1a-1a10a1a-1a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01194");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1A10A#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01195");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01196");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01197");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal3 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal5 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal7 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal[] bigDecimalArray8 = new java.math.BigDecimal[] { bigDecimal1, bigDecimal3, bigDecimal5, bigDecimal7 };
        java.math.BigDecimal bigDecimal10 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal12 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal14 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal bigDecimal16 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("35.0");
        java.math.BigDecimal[] bigDecimalArray17 = new java.math.BigDecimal[] { bigDecimal10, bigDecimal12, bigDecimal14, bigDecimal16 };
        java.math.BigDecimal[][] bigDecimalArray18 = new java.math.BigDecimal[][] { bigDecimalArray8, bigDecimalArray17 };
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(bigDecimalArray18);
        org.junit.Assert.assertNotNull(bigDecimal1);
        org.junit.Assert.assertNotNull(bigDecimal3);
        org.junit.Assert.assertNotNull(bigDecimal5);
        org.junit.Assert.assertNotNull(bigDecimal7);
        org.junit.Assert.assertNotNull(bigDecimalArray8);
        org.junit.Assert.assertNotNull(bigDecimal10);
        org.junit.Assert.assertNotNull(bigDecimal12);
        org.junit.Assert.assertNotNull(bigDecimal14);
        org.junit.Assert.assertNotNull(bigDecimal16);
        org.junit.Assert.assertNotNull(bigDecimalArray17);
        org.junit.Assert.assertNotNull(bigDecimalArray18);
    }

    @Test
    public void test01198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01198");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(6L, (long) 824, (long) 9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test01199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01199");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1a10a100a97a97a35aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01200");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a10000  0 0\rhi100a100a1a-1a100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0HI! 10 100hia!ahia!1#35#100#10#-1#0-#01#001#53#10#1-#01#001#53#10#1-#01#001#53#10.1-0.010.1#01#001#53#10#1-#01#001#53#10#1-#01#001#53#1 .     !ih # -#  #   #53# ", (float) 6L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 6.0f + "'", float2 == 6.0f);
    }

    @Test
    public void test01201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01201");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4aa4a4\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4aa4a4?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01203");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(23.0d, 824.0d, (double) 49L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 824.0d + "'", double3 == 824.0d);
    }

    @Test
    public void test01204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01204");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("35.035.035.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35.035.035.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01205");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(824, 90, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test01206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("##.#4###.#4##.#4#.#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#.#4###.#4##.#4#.#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01207");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 1, (-1));
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 22, (int) (byte) 0);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 16.0f + "'", float8 == 16.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 1.0f + "'", float9 == 1.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 16.0f + "'", float10 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01208");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("541004104-140HI!a1a-1a10a1a-1a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"541004104-140HI!a1a-1a10a1a-1a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01209");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 1 100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("52.44444444444444444444444444444444444144444444444444444444444444444444444.444444444444444444444444444444444441.444444444444444444444444444444444441.44444444444444444444444444444444444144444444444444444444444444444444444.4444444444444444444444444444444444452.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01211");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 0, (long) 104100, 301L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test01212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01212");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01213");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01214");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01215");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01216");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01217");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
    }

    @Test
    public void test01218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01218");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) -1 + "'", short4 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1" + "'", str6, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
    }

    @Test
    public void test01219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("--1.0a100.0a-1.0a0.01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01220");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                          ", (long) 391);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 391L + "'", long2 == 391L);
    }

    @Test
    public void test01221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01221");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01222");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0L, (double) 109, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test01223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01223");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(130.0d, (double) 17L, (double) 7);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 130.0d + "'", double3 == 130.0d);
    }

    @Test
    public void test01224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01224");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
    }

    @Test
    public void test01225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01225");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("541004104-140HI!a1a-1a10a1a-1a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01226");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("52.010.0-1.0-1.010.052.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01227");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 100, 9, 104100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104100 + "'", int3 == 104100);
    }

    @Test
    public void test01228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01228");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 140.0f, 83.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01229");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01230");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(27, 95, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01231");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".     !ih # -#  #   #53#                       ", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test01232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01232");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 571, 24);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "  111hi!hi!111111111\r  ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:   111hi!hi!111111111?  ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test01233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01233");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01234");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a4a4a4a4a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("00aa4a4hi!hi!aa4a4aa4a44aa4a4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00aa4a4hi!hi!aa4a4aa4a44aa4a4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01236");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI! 10 100.Ii  0 000.00.  0 00  0 00  0 0\r", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test01237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01237");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01238");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 24, (long) 22, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test01239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00  0 0\r1#35#100#10#-1#01#35#...                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0  0 0?1#35#100#10#-1#01#35#...                                                                                                                                                                                                                                                                              ?4a4aa4a4 aa4a4hi!hi!aa4a400aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01240");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test01241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01241");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                            a 4 4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#100.0#52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#100.0#52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01243");
        double[] doubleArray4 = new double[] { (short) -1, 100.0d, (-1.0d), 0L };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) 'a', 1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', 32, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, -1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test01244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01244");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("5.0      ", 23);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 23 + "'", int2 == 23);
    }

    @Test
    public void test01245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4     # # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4     # # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01246");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 107, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (-1), 47);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1" + "'", str8, "-1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test01247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01247");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 44, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 1, 27);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test01248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01248");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 30, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str13, "52.0 10.0 -1.0 -1.0 10.0 52.0");
    }

    @Test
    public void test01249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01249");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("        0#-1", 824);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 824 + "'", int2 == 824);
    }

    @Test
    public void test01250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01250");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0#-1#01#35#10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01251");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("3#353#353#353#353#353#353#353#353#353#353#353#353#353#353#353#1403#353#353#353#353#353#353#353#353#353#353#353#353#353#353#353#3", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01252");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01253");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01254");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("00  0 0\r1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01255");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1111111111");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test01256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01256");
        double[] doubleArray3 = new double[] { (-1), 1.0f, 0 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.041.040.0" + "'", str5, "-1.041.040.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a1.0a0.0" + "'", str8, "-1.0a1.0a0.0");
    }

    @Test
    public void test01257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("HI! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HI! 10 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01258");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 83);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 83.0d + "'", double2 == 83.0d);
    }

    @Test
    public void test01259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01259");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01260");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(31L, (long) 83, (long) 18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 83L + "'", long3 == 83L);
    }

    @Test
    public void test01261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01261");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 47.0f, (double) 21, 3.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 47.0d + "'", double3 == 47.0d);
    }

    @Test
    public void test01262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01262");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# # ", 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 128 + "'", int2 == 128);
    }

    @Test
    public void test01263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01263");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 6, 571.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1aa4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1aa4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01265");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(83, 47, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test01266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01266");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1aa4a435.0                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1aa4a435.0                               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01268");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(824, 23, 824);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 824 + "'", int3 == 824);
    }

    @Test
    public void test01269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01269");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97II  0 000.00.  0 00  0 00  0 0\r", (double) 30L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 30.0d + "'", double2 == 30.0d);
    }

    @Test
    public void test01270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01270");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...           ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01271");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0100.0-1.00.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01272");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1A1A1A97A97A1#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01273");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01274");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A4444", (float) 109);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 109.0f + "'", float2 == 109.0f);
    }

    @Test
    public void test01275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01275");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0.0f, (double) 1L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test01276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01276");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, ". hi! # #- # #35# #53# # -# # !ih .");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: . hi! # #- # #35# #53# # -# # !ih .");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test01277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01277");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01278");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) 128, 30L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 30L + "'", long3 == 30L);
    }

    @Test
    public void test01279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01279");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test01280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01280");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(47, 128, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
    }

    @Test
    public void test01281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01281");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test01282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01282");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (double) (byte) -1, (double) 23);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test01283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01283");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(16, 90, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 107 + "'", int3 == 107);
    }

    @Test
    public void test01284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01284");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.0f, 0.0d, (double) 97L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01285");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1aa4a435.0                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1aa4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01286");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0100AA4A4HI!HI!AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01287");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("ih # -#  #5.0      #53#5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0      5.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01288");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01289");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) 301, (long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test01290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01290");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1A1A1A97A97A1#hia-1A1A1A97A97-1#10#100#97#97#35-1A1A1A97A97A1#hia-1A1A1A97A97A", 17.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 17.0f + "'", float2 == 17.0f);
    }

    @Test
    public void test01291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01291");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("7A97A1#ahiahi4!4hi4!A1A1A97A97A1#!");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01292");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01293");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4L, (double) 3, (double) 130.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.0d + "'", double3 == 3.0d);
    }

    @Test
    public void test01294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01294");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100aa4a4hi!hi!aa4a4aa4a44aa4a4\r", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test01295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01295");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(301L, 33L, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 301L + "'", long3 == 301L);
    }

    @Test
    public void test01296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01296");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("3 353 353\n");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01297");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 83L, (float) 31L, (float) 24L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 24.0f + "'", float3 == 24.0f);
    }

    @Test
    public void test01298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01298");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(95, 824, 301);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 95 + "'", int3 == 95);
    }

    @Test
    public void test01299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0 0 -1 -1 1 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0 0 -1 -1 1  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01300");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa4a4                                                52.010.0-1.0-1.010.052.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01301");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".     !ih # -#  #   #53#                                                  #35#   #  #- # hi!     . ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01302");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', 23, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3a35" + "'", str13, "3a35");
    }

    @Test
    public void test01303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01303");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "44!!4444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44!!4444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test01304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01304");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 14, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test01305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01305");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, (-1));
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.Class<?> wildcardClass13 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test01306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01306");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01307");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 32, 7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 110, (-1));
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 24, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test01308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01308");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(9, 52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test01309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01309");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', 27, 391);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test01310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01310");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#-1#01#35#100#10#-1#01#35#100#10#", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01311");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a0a-1a-1a1a1" + "'", str9, "0a0a-1a-1a1a1");
    }

    @Test
    public void test01312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01312");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-1#01 0...10#-1#0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01313");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("143541004104-140HI!a1a-1a10a1a-1a100.0", 49L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 49L + "'", long2 == 49L);
    }

    @Test
    public void test01314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01314");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, (float) 39);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 39.0f + "'", float3 == 39.0f);
    }

    @Test
    public void test01315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01315");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test01316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01316");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 53, 35L, 30L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 53L + "'", long3 == 53L);
    }

    @Test
    public void test01317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01317");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("7A97A1#ahiahi4!4hi4!A1A1A97A97A1#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01318");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                           1 0...10#-1#0                                            971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.03");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                            1 0...10#-1#0                                            971#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.011#35#100#10#-1#0HI! 10 100.001#35#100#10#-1#0HI! 10 100.01001#35#100#10#-1#0HI! 10 100.03");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 0 + "'", byte5 == (byte) 0);
    }

    @Test
    public void test01319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01319");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("1#0.1-0.010.1", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test01320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01320");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 33, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01321");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) '#', (int) (short) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 0, 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 30, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
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
    public void test01322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01322");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test01323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01323");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1#35#100#10#-1#0hi!10100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01324");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test01325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01325");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\r4a4aa4a4 aa4a4hi!hi!aa4a400aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 53L, (float) 31);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.00#-1#01#35#100#10#-1#0HI! 10 100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01328");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01329");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 110);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 110.0d + "'", double2 == 110.0d);
    }

    @Test
    public void test01330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01330");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test01331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("        0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"        0#-1#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01332");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01333");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 44, (long) 100, (long) 47);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 44L + "'", long3 == 44L);
    }

    @Test
    public void test01334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01334");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 81, (float) 29);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01335");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 'a', (float) 22, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test01336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01336");
        float[] floatArray6 = new float[] { '4', 10, (-1L), (-1.0f), (short) 10, '4' };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 0, 0);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) (short) 10, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[52.0, 10.0, -1.0, -1.0, 10.0, 52.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 52.0f + "'", float7 == 52.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52.0 10.0 -1.0 -1.0 10.0 52.0" + "'", str14, "52.0 10.0 -1.0 -1.0 10.0 52.0");
    }

    @Test
    public void test01337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01337");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 0, (int) (short) -1);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
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
    }

    @Test
    public void test01338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01338");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("        0#-1#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test01339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01339");
        float[] floatArray1 = new float[] { 3L };
        float float2 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[3.0]");
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.0f + "'", float2 == 3.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test01340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01340");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01341");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                          -1.041.040.0                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01342");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 301, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 301 + "'", int3 == 301);
    }

    @Test
    public void test01343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01344");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 100, (int) (short) 100);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 90, 140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 90");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test01345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01345");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 30, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "10#-1#01#35#100#10#-1#01#35#100#10#1-a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10#-1#01#35#100#10#-1#01#35#100#10#1-a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test01346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01346");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 33, (double) 53, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 53.0d + "'", double3 == 53.0d);
    }

    @Test
    public void test01347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                             ...10#-1#0                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                             ...10#-1#0                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01348");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01349");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 24L, (float) 107, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 107.0f + "'", float3 == 107.0f);
    }

    @Test
    public void test01350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01350");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 26, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01351");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 11111L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 11111.0f + "'", float2 == 11111.0f);
    }

    @Test
    public void test01352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01352");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01353");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3#35" + "'", str9, "3#35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3a35" + "'", str11, "3a35");
    }

    @Test
    public void test01354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01354");
        int[] intArray1 = new int[] { (byte) -1 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 9, 0);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1" + "'", str3, "-1");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1" + "'", str5, "-1");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1" + "'", str9, "-1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test01355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01355");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                             1#35#100#10#-1#0hi!10100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01356");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a35a100a10a-1a0" + "'", str11, "1a35a100a10a-1a0");
    }

    @Test
    public void test01357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01357");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a10a100a97a97a35aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01358");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01359");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01360");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(47, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1a1a1a97a97a1#hia-1a1a1a97a97-1#10#100#97#97#35-1a1a1a97a97a1#hia-1a1a1a97a97a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1a1a1a97a97a1#hia-1a1a1a97a97-1#10#100#97#97#35-1a1a1a97a97a1#hia-1a1a1a97a97a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01362");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100a1a-1a100", (float) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test01363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01363");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01364");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (-1), 125);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test01365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01365");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0f), (float) (-1L), (float) 35L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test01366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01366");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
    }

    @Test
    public void test01367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01367");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("01A01A1-53A79A79A001A01A1-0.00101!ih0#1-#01#001#53#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01368");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 1 + "'", byte19 == (byte) 1);
    }

    @Test
    public void test01369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01369");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01370");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#35#100#10#-1#0HI! 10 100.0143541004", 42);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test01371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01371");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test01372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01372");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01373");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#35#100#10#-1#0hi!10100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01374");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(17, 110, 109);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test01375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01375");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0A10.0A-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01376");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# # #", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test01377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01377");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 35L + "'", long9 == 35L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3a35" + "'", str11, "3a35");
    }

    @Test
    public void test01378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01378");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(30.0d, 41.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test01379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01379");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaa16.0A1.0aaa410043541");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01380");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01381");
        long[] longArray6 = new long[] { (short) 1, '#', (short) 100, (short) 10, (byte) -1, 0L };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 35, 100, 10, -1, 0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1#35#100#10#-1#0" + "'", str8, "1#35#100#10#-1#0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1 35 100 10 -1 0" + "'", str10, "1 35 100 10 -1 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "143541004104-140" + "'", str12, "143541004104-140");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1a35a100a10a-1a0" + "'", str14, "1a35a100a10a-1a0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1a35a100a10a-1a0" + "'", str16, "1a35a100a10a-1a0");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test01382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01382");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                           1 0...10#-1#0                                            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01383");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("               !ih              ", (double) 97L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 97.0d + "'", double2 == 97.0d);
    }

    @Test
    public void test01384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##35##00##0####0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#35##00##0####0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01385");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!ahia!hia!...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01386");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test01387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01387");
        int[] intArray2 = new int[] { (byte) -1, 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, '#', (int) (short) 0, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a10" + "'", str4, "-1a10");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test01388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01388");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 39, (int) (byte) 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) -1 + "'", short5 == (short) -1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) -1 + "'", short6 == (short) -1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) -1 + "'", short8 == (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) -1 + "'", short13 == (short) -1);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
    }

    @Test
    public void test01389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01389");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(90, 47, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test01390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01390");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 23, (long) 824, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 824L + "'", long3 == 824L);
    }

    @Test
    public void test01391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01391");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(140, 24, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 140 + "'", int3 == 140);
    }

    @Test
    public void test01392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01392");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 29, (double) 23, (double) 107.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 23.0d + "'", double3 == 23.0d);
    }

    @Test
    public void test01393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01393");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...                                            a-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01394");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi100a100a1a-1a100hi100a100010#-1#0a001a001a1a1-a001hi100a100a1a-1a100hi100a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01395");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(7.0d, (double) 14.0f, (double) 'a');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test01396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01396");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("H1401H!!1H!1.H1!H1401H!!1H!1.H1!H1401H!!1H!1H1!H!1!.H1!H1401H!!1H!1.H1!H1401H!!1H!1.H1!H1401H!!1H!1.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01397");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0410.04-1.04-1.0410.0452.0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test01398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01398");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4a4                                                52.010.0-1.0-1.010.052.00#-", (double) 6L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 6.0d + "'", double2 == 6.0d);
    }

    @Test
    public void test01399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01399");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 44, 0.0d, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 44.0d + "'", double3 == 44.0d);
    }

    @Test
    public void test01400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01400");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("###################################################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01401");
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
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 6, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test01402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01402");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 391, 10.0f, (float) 52);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test01403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01403");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100aa4a4hi!hi!aa4a4aa4a44aa4a4\r");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01404");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("00aa4a4hi!hi!aa4a4 aa4a44aa4a4\r#35#444#44#-4#4hi!44444.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01405");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("00  0 0\r1#35#100#10#-1#01#35#...                                                                                                                                                                                                                                                                              \r4a4aa4a4 aa4a4hi!hi!aa4a400aa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01406");
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
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 140, 81);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01407");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0 100.0 52.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01408");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                            1", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test01409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01409");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(97.0f, 47.0f, (float) 90);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 47.0f + "'", float3 == 47.0f);
    }

    @Test
    public void test01410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01410");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("      ", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test01411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01411");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.04100.0452.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01412");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 103, (-1.0f), (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01413");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("\n");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test01414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01414");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a100", 16.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 16.0f + "'", float2 == 16.0f);
    }

    @Test
    public void test01415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01415");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("###################################010#-1#0a001a001a1a1-a001###################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###################################010#-1#0a001a001a1a1-a001###################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaa52.0#10.0#-1.0#-1.0#10.0#52.00#-aaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01417");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!", (double) 21);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 21.0d + "'", double2 == 21.0d);
    }

    @Test
    public void test01418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01418");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 2, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test01419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01419");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1#35#10HI! AA AAAAAA##AAA#AA#AA#A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01420");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "010101010101010101010101010");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 010101010101010101010101010");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void test01421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01421");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 95, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01422");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01423");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 83L, (float) 24, (float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test01424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01424");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(24.0d, (double) 39.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test01425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1.010.0-1.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01426");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test01427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01427");
        short[] shortArray1 = new short[] { (byte) -1 };
        short short2 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 301, (int) (byte) 10);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test01428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01428");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(43, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01429");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test01430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01430");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a105.0-1a10", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test01431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01431");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100aa4a4hi!hi!aa4a4aa4a44aa4a4\r", (double) 14L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.0d + "'", double2 == 14.0d);
    }

    @Test
    public void test01432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01432");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(27, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test01433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01433");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 23L, (float) 271);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test01434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01434");
        double[] doubleArray3 = new double[] { (byte) 1, 10.0f, (-1.0d) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, 103);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1.0410.04-1.0" + "'", str5, "1.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test01435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01435");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test01436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01436");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hia!ahia!1#35#100#10#-1#0HI! 10 100.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01437");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 107.0f, (double) (byte) 0, (double) 405);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test01438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01438");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a-1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test01439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01439");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("        0#-1#", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01440");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 140L, (double) 8, (double) 29.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 8.0d + "'", double3 == 8.0d);
    }

    @Test
    public void test01441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaAA4A4                                  hi!               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaAA4A4                                  hi!               \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01442");
        short[] shortArray6 = new short[] { (short) 10, (short) 100, (short) 100, (byte) 1, (short) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 24, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
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
    }

    @Test
    public void test01443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01443");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI4!4HI4!                        ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01444");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("00a100a1a-1a100", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test01445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01445");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) '4', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test01446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01446");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 4L, (long) 24);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 24L + "'", long3 == 24L);
    }

    @Test
    public void test01447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01447");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, (float) 104100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104100.0f + "'", float3 == 104100.0f);
    }

    @Test
    public void test01448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01448");
        long[] longArray2 = new long[] { 3, 35L };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray2, '4', (int) (byte) 100, 0);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 83);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[3, 35]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3 35" + "'", str9, "3 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3#35" + "'", str11, "3#35");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3#35" + "'", str15, "3#35");
    }

    @Test
    public void test01449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01449");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 2, (float) 44L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 44.0f + "'", float3 == 44.0f);
    }

    @Test
    public void test01450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01450");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1L), (float) 9, (float) 4);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test01451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01451");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaa", (double) 113);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 113.0d + "'", double2 == 113.0d);
    }

    @Test
    public void test01452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01452");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', 35, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 1.0f + "'", float11 == 1.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 16.0f + "'", float12 == 16.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str14, "1.042.0410.0416.043.042.0");
    }

    @Test
    public void test01453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01453");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4                                                A4A97ii  0 000.00.  0 00  0 00  0 0\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01454");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 21, (long) (short) -1, 83L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test01455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01455");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', 47, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1A1A97A97A1#hiahi4!4hi4!A1A1A97A97A1#!hi4!4hi4!A1A1A97A97A1#ahiahi4!4hi4!A1A1A97A97A1#!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1A1A97A97A1#hiahi4!4hi4!A1A1A97A97A1#!hi4!4hi4!A1A1A97A97A1#ahiahi4!4hi4!A1A1A97A97A1#!");
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
    public void test01456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01456");
        short[] shortArray6 = new short[] { (byte) 0, (short) 0, (byte) -1, (byte) -1, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 0, -1, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) -1 + "'", short7 == (short) -1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
    }

    @Test
    public void test01457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a44class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a44class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C                 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01458");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4a 4 4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test01459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01459");
        float[] floatArray6 = new float[] { 1.0f, 2L, 10, 16.0f, 3, 2L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 35, (int) (short) 1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#', (int) (short) 10, (int) (byte) 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4');
        float float17 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 33, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 33");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[1.0, 2.0, 10.0, 16.0, 3.0, 2.0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1.042.0410.0416.043.042.0" + "'", str16, "1.042.0410.0416.043.042.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 16.0f + "'", float17 == 16.0f);
    }

    @Test
    public void test01460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01460");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("ng.String;a.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljang.String;cla.lavass [Ljass [Cclacl");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ng.Stri\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01461");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test01462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01462");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1#040hi! aa aaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test01463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01463");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" #4#4###############################44 4 4#4#4# #4#4###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 128, (float) 109, 107.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 107.0f + "'", float3 == 107.0f);
    }

    @Test
    public void test01465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01465");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("00aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a7a3500aa4a4hi!hi!aa4a4aa4a44aa4a400aa4aaaaaaaaaaaaaaaaaaaaaaa100aa4a4hi!hi!aa4a4aa4a44aa4a400aa4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01466");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 10, (float) 31L, (float) 405);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test01467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01467");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(103, 40, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test01468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01468");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 128, 130);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 128");
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
    }

    @Test
    public void test01469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01469");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test01470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01470");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100a100a100a1a-1a100", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test01471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1A10A#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1A10A#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                               #4#                                                4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                               #4#                                                4\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("ii  01 0...1..00.00.  0 00  0 00  0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"ii  01 0...1..00.00.  0 00  0 00  0 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01474");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#1.0#0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01475");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97II  0 000.00.  0 00  0 00  0 0\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01476");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 31, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test01477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01477");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" #35#   #  #- # hi!     . 1#35#100#10#-1#01#35#100#10#-1#01#35#100#10#1.010.0-1.01#35#100#10#-1#01#35#100#10#-1#01#35#100#10#-", (double) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test01478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a4a4a4a4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4a4a4a4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01479");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1#10#100#97#97#35                                                                                  ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test01480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01480");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI! 10 100", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test01481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01481");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 31L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test01482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01482");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("         AA4A4         ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test01483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4              -1a10a100a97a97a35                                                                                  4              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4              -1a10a100a97a97a35                                                                                  4              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("... a-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"... a-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(391, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test01486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01486");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!10100.hi!hi!", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test01487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01487");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".1.010.0-1.1.010.0-1.1.1.0 10.0 -1.0i!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test01488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01488");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 100, 13, 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test01489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01489");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("              -1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:               -1a1a1a97a97a1#hia-1a1a1a97a97a1#!-1a1a1a97a97a1#ahia-1a1a1a97a97a1#! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01491");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1A1A97A97A1#hiahi4!4hi4!A1A1A97A97A1#!hi4!4hi4!A1A1A97A97A1#ahiahi4!4hi4!A1A1A97A97A1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01492");
        float[] floatArray2 = new float[] { 16, 1L };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', 6, 1878);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[16.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 16.0f + "'", float3 == 16.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16.041.0" + "'", str5, "16.041.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16.0 1.0" + "'", str7, "16.0 1.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 1.0f + "'", float8 == 1.0f);
    }

    @Test
    public void test01493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01493");
        byte[] byteArray2 = new byte[] { (byte) 1, (byte) 0 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', (int) (byte) 1, 0);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 16, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 59, (int) '4');
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1#0" + "'", str4, "1#0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1a0" + "'", str11, "1a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1#0" + "'", str17, "1#0");
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 0 + "'", byte18 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test01494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01494");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test01495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01495");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".     !ih # -#  #   #53#                       ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test01496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01496");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1#10#100#97#97#35", 16L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 16L + "'", long2 == 16L);
    }

    @Test
    public void test01497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01497");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 20, 571.0f, (float) 6L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test01498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444!4ih4!4ih44444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444!4ih4!4ih44444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test01499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01499");
        double[] doubleArray3 = new double[] { (short) -1, (short) 100, '4' };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 3, (int) (byte) 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 47, 9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 0, 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 100.0, 52.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test01500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest2.test01500");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 100 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10 1 100" + "'", str7, "10 1 100");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }
}

