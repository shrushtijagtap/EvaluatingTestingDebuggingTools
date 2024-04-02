package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test12001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("      0.001A0.25A0.01A0.1-      #0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      0.001A0.25A0.01A0.1-      #0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12002");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 840, (double) 100, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 840.0d + "'", double3 == 840.0d);
    }

    @Test
    public void test12003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12003");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.", (float) (-1L));
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test12004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12004");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-4-4--4--");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12005");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-1.0a10.0a52.0a100.-10.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12006");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("104-141414-14100####################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12007");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#", 840);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 840 + "'", int2 == 840);
    }

    @Test
    public void test12008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12008");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.1--1.0...a0.01a0.25a#0#100.001-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12009");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12010");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12011");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                      10a0a10");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12012");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "10A0A10#AA");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10A0A10#AA");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
    }

    @Test
    public void test12013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12013");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 165L, (float) 0L, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12014");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1952, (float) (short) 10, (float) 189);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test12015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12015");
        float[] floatArray3 = new float[] { 526, 100L, 4096 };
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray3, ' ', 526, 104041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 526");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[526.0, 100.0, 4096.0]");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 100.0f + "'", float4 == 100.0f);
    }

    @Test
    public void test12016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12016");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444444444444444444444444444444444444444444444444444444444444444444444444444     -1 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12017");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1#32", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12018");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) (byte) 0, 1952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    public void test12019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12019");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', 0, 4096);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test12020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12020");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) 568, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12021");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#-1#1#1#-1#100", (long) 998);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 998L + "'", long2 == 998L);
    }

    @Test
    public void test12022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12022");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12023");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0a1a132 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12024");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12025");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10041004-14041");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12026");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#1#0#-1#10" + "'", str8, "100#1#0#-1#10");
    }

    @Test
    public void test12027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12027");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.100101E7d, (double) 1L, (double) 954);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.100101E7d + "'", double3 == 1.100101E7d);
    }

    @Test
    public void test12028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12028");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.Class<?> wildcardClass10 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#-1#10#1" + "'", str9, "1#-1#10#1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12029");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12030");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12031");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444-.1A-1.1A52.1A-1#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-1", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12032");
        int[] intArray0 = new int[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray0, '#', 565, (int) (byte) 10);
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
    public void test12033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12033");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("...-a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a-...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12034");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str11, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                                                                                                                                                                                                                                                                                                                                                              A1.1-A1.--#0#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#10                                                                                                                                                                                                                                                                                                                                                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1.1-A1.--#0#A1.1-A1.--#100#.#001#A#0#.#25#A#0#.#01#A#0#.#1#--#1#.#0#A#10#.#0#A#52#.#0#A#100#.#010#A1.1-A1.--#0#A1.1-A1.--#10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("110a0a1010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 110a0a1010                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            0a0a10...a52.0a1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a0a10...a52.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12038");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 958.0f, (float) 1755);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12039");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12040");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A0.25A0.01A0.1-", (double) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test12041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12041");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#0#10" + "'", str14, "10#0#10");
    }

    @Test
    public void test12042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12042");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12043");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.01 0.00.01 0.00.01 0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a10.01 0.00.01 0.00.01 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".01 0.00.01 0.00.01 0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a10.01 0.00.01 0.00.01 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12044");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("014--.1A-1.1A404--.1A-1.1A40104.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40014--.1A-1.1A404--.1A-1.1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"014--.1A-1.1A404--.1A-1.1A40104.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40014--.1A-1.1A404--.1A-1.1A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12046");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) ' ', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test12047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1#32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12048");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("     -1 32", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12049");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12050");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4089.0d, (double) 1055, (double) 404.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test12051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12051");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12052");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 559, (int) (short) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 62, 558);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a-1a10a1" + "'", str13, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test12053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("      0.001A0.25A0.01A0.1-      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:       0.001A0.25A0.01A0.1-       is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12054");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 0.0a100.0a0.0                                    ", (float) 954);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 954.0f + "'", float2 == 954.0f);
    }

    @Test
    public void test12055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12055");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444440.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#044444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12056");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...A52.0A1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1A0.25A0.01A0.1--1.0......a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12057");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAA#AA#A#A#AA#AAA4A4AAAA4A4aAAAAaAAAAA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12058");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 558, (float) 478, (float) 4360);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4360.0f + "'", float3 == 4360.0f);
    }

    @Test
    public void test12059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12059");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaA10.100100.0010.250.010.1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12060");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(840, 451, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test12061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A1.1-A1.--1040410A10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12062");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A10...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12063");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#404#41004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104#404#410");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12064");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 565, 559);
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 1665, 3240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1665");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "104-141414-14100" + "'", str14, "104-141414-14100");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test12065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12065");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("41A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-10#0#10100444444444444444444.a.25a.a.--.a.a52.a.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12066");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa a4a aaa#a4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12067");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(559, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test12068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12068");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001a0.25a0.01a0.1-                                                                                0.0 10.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12069");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                 32 0", 780);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 780 + "'", int2 == 780);
    }

    @Test
    public void test12070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12070");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12071");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 558, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str20, "-1.0a10.0a52.0a100.0");
    }

    @Test
    public void test12072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12072");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (short) 0, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test12073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12073");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0a10.0a52.0100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12074");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 1, (int) (short) -1);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0.0a10.0" + "'", str5, "0.0a10.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 10.0" + "'", str12, "0.0 10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test12075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12075");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 3240, 4114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4114 + "'", int3 == 4114);
    }

    @Test
    public void test12076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12076");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                             ...0#0#...                                            ", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test12077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12077");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(574.0f, (float) 559, 604.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 604.0f + "'", float3 == 604.0f);
    }

    @Test
    public void test12078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12078");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 100, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a1a0a-1a10" + "'", str17, "100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test12079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12079");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "1-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1-1.010.052.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test12080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12080");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1055, (double) 780, (double) 1040410L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 780.0d + "'", double3 == 780.0d);
    }

    @Test
    public void test12081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12081");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12082");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 559, (long) 4510, 574L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4510L + "'", long3 == 4510L);
    }

    @Test
    public void test12083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12083");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, 0L, 3240L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test12084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12084");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 840, 657);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12085");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#-1 32", 1665);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1665 + "'", int2 == 1665);
    }

    @Test
    public void test12086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12086");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
    }

    @Test
    public void test12087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12087");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(568, 998, 958);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 998 + "'", int3 == 998);
    }

    @Test
    public void test12088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12088");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-10#0#10100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12089");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test12090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12090");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0a0.25a0.01a0.1--1.0...                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0a0.25a0.01a0.1--1.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12091");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("  4   a # 4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12092");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#0#101010#-1#1#1#-1#1004041010404");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12093");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 104041, 104041);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12094");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(526L, (long) 568, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test12095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12095");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12096");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.001a0.25a0.01a0.1-100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12097");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test12098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12098");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12099");
        double[] doubleArray5 = new double[] { 10.0d, 559, 1040410, 574, 559.0d };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray5, ' ', 574, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray5, 'a', 0, 3240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 559.0, 1040410.0, 574.0, 559.0]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10.0 559.0 1040410.0 574.0 559.0" + "'", str7, "10.0 559.0 1040410.0 574.0 559.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1040410.0d + "'", double8 == 1040410.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12100");
        float[] floatArray1 = new float[] { 0.0f };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
    }

    @Test
    public void test12101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12101");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12102");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 10 + "'", byte10 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
    }

    @Test
    public void test12103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12103");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1", (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test12104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12104");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                            1-4014040");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12106");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 574, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1a0a-1a10" + "'", str12, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100 1 0 -1 10" + "'", str14, "100 1 0 -1 10");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12107");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A10.10a0a100.001a0.25a0.01a0.1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (float) 1040410L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1040410.0f + "'", float2 == 1040410.0f);
    }

    @Test
    public void test12108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12108");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, 3240);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12109");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("00#1#0#-1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12111");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str11, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12112");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12113");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test12114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12114");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10041004-14041", 559.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 559.0f + "'", float2 == 559.0f);
    }

    @Test
    public void test12115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12115");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--ahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12116");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12117");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str8, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test12118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12118");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0000A.000..000A.00A##A00.A000..000.A0000", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12119");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444a4444a4444a44444444444444444444444444444444444444444444444444444a4444a44444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12120");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12121");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12123");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#1000#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00#0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12124");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-1.0A10.0A52.0A100.-10.1--1.0...A0.01A0.25A#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-A52.0A1-1.0A10.0A52.0A", 559.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 559.0d + "'", double2 == 559.0d);
    }

    @Test
    public void test12125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12125");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 558, 998);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 558");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
    }

    @Test
    public void test12126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12126");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.044444444444423", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12128");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 0, 100, 574);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 574 + "'", int3 == 574);
    }

    @Test
    public void test12129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12129");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1314, (long) (byte) -1, (long) 568);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test12130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12130");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12131");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#0.0#100.0#0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12132");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 559L, 0.0f, (float) 85L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12133");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a0a10...a52.0a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12134");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 3637, 0.0d, (double) 604.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3637.0d + "'", double3 == 3637.0d);
    }

    @Test
    public void test12135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12135");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 4510);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4510L + "'", long2 == 4510L);
    }

    @Test
    public void test12136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12136");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("104-141414-14100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12137");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0#559.0#1040410.0#574.0#559.0", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12138");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      10#0#100.001A0.25A0.", 38);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 38 + "'", int2 == 38);
    }

    @Test
    public void test12139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0a10.0a52.0a100.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a10.0a52.0a100.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12140");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(62.0d, (double) 954.0f, (double) 565);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 62.0d + "'", double3 == 62.0d);
    }

    @Test
    public void test12141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A                                             ...0#0#...                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A                                             ...0#0#...                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12142");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0f), 0.0f, 3240.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12143");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1055, 14100.0f, 565.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14100.0f + "'", float3 == 14100.0f);
    }

    @Test
    public void test12144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12144");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0423");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12145");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, 478);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1#0#-1#10" + "'", str12, "100#1#0#-1#10");
    }

    @Test
    public void test12146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12146");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("52 526 4089a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12147");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ');
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', (int) (byte) 100, 0);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) 'a', 1755);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100 1 0 -1 10" + "'", str9, "100 1 0 -1 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test12148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12148");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(85, 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12149");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1--.1A-1.1A4040101404001#1-#1#1#1-#01010.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1--.1A-1.1A4040101404001#1-#1#1#1-#01010.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12150");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A1.1-A1.--100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12151");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA6");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12152");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12153");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                 32 0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12154");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str11, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12155");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 1, 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1#-1#10#1" + "'", str9, "1#-1#10#1");
    }

    @Test
    public void test12156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12156");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12157");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10.0A10", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12158");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#100", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12159");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ', (int) (byte) 10, (int) (short) 10);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test12160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.044444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12161");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1 1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12162");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 'a', 1L, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test12163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12163");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0 10.0 52.0 100.0A0.25A0.01A0.1-", 62);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test12164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12164");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32 0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 840L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 840L + "'", long2 == 840L);
    }

    @Test
    public void test12165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12165");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1L), (double) 526.0f, (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 526.0d + "'", double3 == 526.0d);
    }

    @Test
    public void test12166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12166");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(104041, 574, 4510);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 574 + "'", int3 == 574);
    }

    @Test
    public void test12167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12167");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("040");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test12168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12168");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0" + "'", str10, "32 0");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32a0" + "'", str13, "32a0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32a0" + "'", str15, "32a0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test12169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12169");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAA#AA#A#A#AA#AAA4A4AAAA4A4AAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0010010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0010010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12171");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("################################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     410010#", 954);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 954 + "'", int2 == 954);
    }

    @Test
    public void test12172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12172");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A-0.0100a1a0a-1a10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12173");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test12174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12174");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 109, 3637);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 109");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test12175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12175");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12176");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 547, (long) 780, 4089L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4089L + "'", long3 == 4089L);
    }

    @Test
    public void test12177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12177");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 656, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100a1a0a-1a10" + "'", str9, "100a1a0a-1a10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12178");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.04444444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.044444444440.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12179");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.250.010.1--1.0...                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12180");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1--.1A-1.1A4040101404001#1-#1#1#1-#01010.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A0.01A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12181");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001a0.25a0.01a0.1-                                                                                0.0 10.0", (long) '4');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test12182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12182");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 1980, 1980);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12183");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1#####################################################10.0 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12184");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 559, (int) 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10 0 10" + "'", str18, "10 0 10");
    }

    @Test
    public void test12185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12185");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("##############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444440#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.04444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12187");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, 0, 3240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3240 + "'", int3 == 3240);
    }

    @Test
    public void test12188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12188");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("A10.10a0a100.001a0.25a0.01a0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A10.10a0a100.001a0.25a0.01a0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12189");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0#4096.0#10.0", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12190");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1501, (float) 165, (float) 4017);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4017.0f + "'", float3 == 4017.0f);
    }

    @Test
    public void test12191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12191");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12192");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 565L, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12193");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (byte) 1, 998);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test12194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12194");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test12195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12195");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12196");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12197");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0a0.25a0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12198");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.Class<?> wildcardClass15 = shortArray3.getClass();
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 0 10" + "'", str14, "10 0 10");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12199");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', (int) (short) 100, (int) (byte) -1);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test12200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-0.001A0.25A0.01A0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12201");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("  4     #0...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12203");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("104041                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 104041.0f + "'", float1 == 104041.0f);
    }

    @Test
    public void test12204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12204");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 604.0f, (float) 165);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12205");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) -1, 565);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a100.0a0.0" + "'", str14, "0.0a100.0a0.0");
    }

    @Test
    public void test12206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12206");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("14-140.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a141");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.01-1.010.052.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12208");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test12209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10a0a10#aa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a0a10#aa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12210");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 21, (double) 3637, (double) 558L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 21.0d + "'", double3 == 21.0d);
    }

    @Test
    public void test12211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12211");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.Class<?> wildcardClass13 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04100.040.0" + "'", str8, "0.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0 100.0 0.0" + "'", str10, "0.0 100.0 0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test12212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12212");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12213");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str17, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12214");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1422, 3240.0f, (float) 4114);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4114.0f + "'", float3 == 4114.0f);
    }

    @Test
    public void test12215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12215");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0a1 100", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12216");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) 100, 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 604, 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12217");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0aa0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12218");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A", (float) 62);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 62.0f + "'", float2 == 62.0f);
    }

    @Test
    public void test12219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12219");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("11111111111111111111111111110100110110A1001A1010A100AA001A0101A1001A01101111111111111111111111111                                                                                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A1001A101\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12220");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-4-4--4--1a.a1a-aAa1a.a--a1040410");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12221");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12222");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1422, 0, 1980);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1980 + "'", int3 == 1980);
    }

    @Test
    public void test12223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12223");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.04100.040.0" + "'", str8, "0.04100.040.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0 100.0 0.0" + "'", str10, "0.0 100.0 0.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a100.0a0.0" + "'", str12, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test12224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12224");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 32", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test12225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12225");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A                                             ...0#0#...                                             ", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test12226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12226");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(21.0d, (double) 526.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12227");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 476, 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 1040410, 840);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12228");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("     -1 320404104-1                                                                            #0#10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.00.0010.250.010.1-100.0-1.010.052.0100.001#0#010.0010.250.010.1--1.010.052.0100.0.001A0.25A0.01A0.1--1.0A10.0A52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12230");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 574, (int) (short) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 10, 1501);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0a10.0" + "'", str14, "0.0a10.0");
    }

    @Test
    public void test12231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12231");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(657, (int) (short) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 657 + "'", int3 == 657);
    }

    @Test
    public void test12232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12232");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0#10#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0#0#10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#1010#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12233");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 100, (float) 3996, 404.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test12234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12234");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 954, 1952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 954");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
    }

    @Test
    public void test12235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12235");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) 'a', 109);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test12236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12236");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 3637, 4360);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3637");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test12237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12237");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("4-4--4--1a.a1a-aAa1a.a--a1040410######################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12238");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#", 574.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 574.0f + "'", float2 == 574.0f);
    }

    @Test
    public void test12239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12239");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...a0.25a0.01a0.1-1a0.25a0.01a0.1-0.001a0.25a0.01a0.1-1a0.25a...-1.0A10.0A52.0A0.040.00140.0#     4");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12240");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12241");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12242");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1952, (double) 1314, (double) (short) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test12243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12243");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12244");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', 189, 1665);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 189");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test12245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12245");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0A.25A..0A.0000.A0..A52.A0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12246");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#10.00.0#0.01 0.010#0#101.11-A1.25A1.1-A1.--                                                                                  ", (float) 488);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 488.0f + "'", float2 == 488.0f);
    }

    @Test
    public void test12247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12247");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(526, 840, 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 165 + "'", int3 == 165);
    }

    @Test
    public void test12248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12248");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("104041010-111-1100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12249");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001A0.25A0.01A0.1--1.0A10.0A52.0A", (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12250");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("...-a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12252");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.0f, (double) 100, (double) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test12253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12253");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short20 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 0 10" + "'", str15, "10 0 10");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10#0#10" + "'", str17, "10#0#10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1040410" + "'", str19, "1040410");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 0 + "'", short20 == (short) 0);
    }

    @Test
    public void test12254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12254");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("    # 0 # 100 . 001 A 0 . 25 A 0 . 01 A 0 . 1 -- 1 . 0 A 10 . 0 A 52 . 0 A 100 . 010 # 0 # 10    ", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12255");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test12256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12256");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12257");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".10.1.10....0.25..0.0000.0..52.0...0.1.10.0.1.10.1.10....0a.25a..0a.0000.a0..a52.a0...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12258");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0 100.0 0.0", (float) 4360);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4360.0f + "'", float2 == 4360.0f);
    }

    @Test
    public void test12259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12259");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 4510, 958);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1.0#97.0#32.0#100.0#0.0#1.0" + "'", str11, "1.0#97.0#32.0#100.0#0.0#1.0");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test12260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.1--1.0.....A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.1--1.0.....A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12261");
        long[] longArray5 = new long[] { 10, (-1), 62, (short) 1, (-1L) };
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 38, 993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 38");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[10, -1, 62, 1, -1]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 62L + "'", long6 == 62L);
    }

    @Test
    public void test12262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12262");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 488, (float) 565L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12263");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.01a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12264");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12265");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "3240");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 3240");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
    }

    @Test
    public void test12266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12266");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 4096.0f, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4096.0f + "'", float3 == 4096.0f);
    }

    @Test
    public void test12267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                         00                                                                                                                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12268");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "3240" + "'", str8, "3240");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test12269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12269");
        long[] longArray4 = new long[] { (byte) 0, (short) 0, 10L, (byte) -1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 0, 1314);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[0, 0, 10, -1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test12270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12270");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                        -1.0a10.0a52.0a1-1.0a10.0a52.0a1                                                                    ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12271");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1980, (long) 85, 4360L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4360L + "'", long3 == 4360L);
    }

    @Test
    public void test12272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12272");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.01A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A104041041A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A10404101A.A1A-AaA1A.A--A1040410");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12273");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 565, (long) 1, (long) 547);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 565L + "'", long3 == 565L);
    }

    @Test
    public void test12274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12274");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12275");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 998L, (float) 1980, (float) 568);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 568.0f + "'", float3 == 568.0f);
    }

    @Test
    public void test12276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12276");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 165L, 558.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443240");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444443240\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12278");
        double[] doubleArray6 = new double[] { 1.0f, 'a', ' ', 100.0f, 0L, 1 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 97.0, 32.0, 100.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1.0a97.0a32.0a100.0a0.0a1.0" + "'", str9, "1.0a97.0a32.0a100.0a0.0a1.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test12279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12279");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#0#10#0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#10#0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12280");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass17 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12281");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.", (float) 998);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 998.0f + "'", float2 == 998.0f);
    }

    @Test
    public void test12282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12282");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 565, 1952);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 565");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test12283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12283");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 1040410, 0);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', (int) (short) 1, 0);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 0, (-1));
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 38, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test12284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12284");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test12285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12285");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 104041, (float) 478, (float) 104041);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 478.0f + "'", float3 == 478.0f);
    }

    @Test
    public void test12286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12286");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                            1-4014040");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12287");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 1, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', 21);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12288");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12289");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(565, 1040410, 451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 451 + "'", int3 == 451);
    }

    @Test
    public void test12290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12290");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 526, 604.0d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test12291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12291");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12292");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12293");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 565);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 565.0f + "'", float2 == 565.0f);
    }

    @Test
    public void test12294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12294");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100#100.001a0.25a0.01a0.1--1.0a", (long) 451);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 451L + "'", long2 == 451L);
    }

    @Test
    public void test12295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12295");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0L, 0.0f, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test12296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12296");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 62, 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test12297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12297");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str10, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str12, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test12298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12298");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#0#444444#0#", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12299");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12300");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12301");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(574.0f, 574.0f, (float) 85L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 574.0f + "'", float3 == 574.0f);
    }

    @Test
    public void test12302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12302");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0000A.000..000A.00A11A00.A000..0000000a.000..000a.00a11a00.a000..000.a00000000A.000..000A.00A11A00.A000..000.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"000A.000..000A.00A11A00.A000..0000000a.000..000a.00a11a00.a000..000.a00000000A.000..000A.00A11A00.A000..000.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12303");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray2, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1L + "'", long5 == 1L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-141" + "'", str7, "-141");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test12304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12304");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.---.---A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12305");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(404.0d, (double) 189, 604.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 604.0d + "'", double3 == 604.0d);
    }

    @Test
    public void test12306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12306");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#-1#1#1#-1#10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12307");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("  4     #0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12308");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) -1 + "'", short14 == (short) -1);
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 100 + "'", short15 == (short) 100);
    }

    @Test
    public void test12309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12309");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#0#10#0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12310");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str11, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test12311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12311");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#-1 32");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12312");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a0a10" + "'", str13, "10a0a10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a0a10" + "'", str16, "10a0a10");
    }

    @Test
    public void test12313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12313");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#101A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A...A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-1A0.25A", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12314");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1-.---A-.25A-.--A-.--");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12315");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.001a0.25a0.01a0.1-                                                                                0.0 10.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12316");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A1.1-A1.--");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12317");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#100.001a0.25a0.01a0.1-10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.0444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12318");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1040410, (long) (byte) 1, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test12319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12319");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4096.0d, 3637.0d, 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 780.0d + "'", double3 == 780.0d);
    }

    @Test
    public void test12320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12320");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 0, (int) (byte) 0);
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float20 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) (byte) 10, 100);
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str13, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + (-1.0f) + "'", float18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + (-1.0f) + "'", float19 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + (-1.0f) + "'", float20 == (-1.0f));
    }

    @Test
    public void test12321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("...A52.0A110#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.010#0#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12322");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4732, (float) 4360, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test12323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12323");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
    }

    @Test
    public void test12324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12324");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test12325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12325");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12326");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#0#101.11-A1.25A1.1-A1.--", 451);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 451 + "'", int2 == 451);
    }

    @Test
    public void test12327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12328");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 0, (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 0, (int) (short) 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', (int) (byte) 10, (int) (byte) -1);
        short short25 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short26 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) 10 + "'", short25 == (short) 10);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) 10 + "'", short26 == (short) 10);
    }

    @Test
    public void test12329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0404104-1                                                                            #0#10#0#1.1A0.25A0.01A0.1--1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12330");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.01 0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12331");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("       0.001a0.25a0.01a0.1-        ##############################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12332");
        double[] doubleArray0 = new double[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(doubleArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12333");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 574L, 404.0d, (double) 565L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 404.0d + "'", double3 == 404.0d);
    }

    @Test
    public void test12334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12334");
        short[] shortArray0 = new short[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(shortArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            short short3 = org.apache.commons.lang3.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test12335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12335");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                             ...0#0#...                                            ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12336");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(998.0f, (float) 'a', (float) 656);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 998.0f + "'", float3 == 998.0f);
    }

    @Test
    public void test12337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12337");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12338");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 1501, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12339");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1040410, 958);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 1, 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test12340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12340");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 526, 0);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#-1#1#1#-1#100" + "'", str10, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#-1#1#1#-1#100" + "'", str12, "10#-1#1#1#-1#100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) -1 + "'", short17 == (short) -1);
    }

    @Test
    public void test12341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12341");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4089L, (double) 958.0f, 780.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 780.0d + "'", double3 == 780.0d);
    }

    @Test
    public void test12342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12342");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    0#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#1000#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.00#0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12343");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4096.0d, 998.0d, (double) 1040410L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1040410.0d + "'", double3 == 1040410.0d);
    }

    @Test
    public void test12344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12344");
        int[] intArray1 = new int[] { 0 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 104041, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12345");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A                                                                444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12346");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400...A52.0A1-A10.0-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12347");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                             ", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12348");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0-1.0410.0452.04100.0...A52.0A110#0#100.001#0.25#0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0######################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0######################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12350");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a', (int) '#', (int) (byte) -1);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (short) 0, (int) (byte) 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
    }

    @Test
    public void test12351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12351");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("I!AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12352");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 559, 1055);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 559");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
    }

    @Test
    public void test12353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12353");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#0#100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.010#0#10", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test12354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12354");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a4#0.001a0.25a0.01a0.1-", (long) 4732);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4732L + "'", long2 == 4732L);
    }

    @Test
    public void test12355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12355");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3996, (long) 4510, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12356");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12357");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', (int) (byte) 10, (int) (short) 1);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', 4360, 4360);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 0 + "'", short9 == (short) 0);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10#0#10" + "'", str12, "10#0#10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12358");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-0.1--1.0...a0.01a0.25a#1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-a52.0a1-1.0", 109);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 109 + "'", int2 == 109);
    }

    @Test
    public void test12359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12359");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 109L, (double) 488, 993.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 109.0d + "'", double3 == 109.0d);
    }

    @Test
    public void test12360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12360");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str14, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str16, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12361");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-13240aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-10a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a0a10a-132400a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void test12362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12362");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(565L, (long) 565, 574L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 574L + "'", long3 == 574L);
    }

    @Test
    public void test12363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12363");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("A1.1-A1.--1040410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12364");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.      ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12365");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#-1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12366");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("526.01--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12367");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 558, 526);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12368");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("     -1 320404104-1                                                                            #0#10", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test12369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12369");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 100, (float) 4089L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4089.0f + "'", float3 == 4089.0f);
    }

    @Test
    public void test12370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12370");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 823, 4017);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test12371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12371");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str11, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0410.0452.04100.0" + "'", str13, "-1.0410.0452.04100.0");
    }

    @Test
    public void test12372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12372");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) 1L, 565.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12373");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0a0.25a0.01a0.1--1.0a10.0a52.0a100.0A1.1-A1.--404A1.1-A1.--41004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104A1.1-A1.--404A1.1-A1.--410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12374");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12375");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                0.1--1.0...A0.01A0.25A#0#100.001-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0.1--1.0...A0.01A0.25A#0#100.001-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12376");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 559, (int) 'a');
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#', 547, 993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 547");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 10 + "'", short17 == (short) 10);
    }

    @Test
    public void test12377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12377");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1040410.0f, (float) 104041, (float) 942);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1040410.0f + "'", float3 == 1040410.0f);
    }

    @Test
    public void test12378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12378");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12379");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("  4     #0...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12380");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a', 559, (int) (short) -1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray5, ' ', 559, (int) (byte) 10);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray5, '#', 4096, 165);
        int int23 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(intArray5, '4', 547, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100#1#0#-1#10" + "'", str17, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test12381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12381");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 38, 604);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 38");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test12382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12382");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(526.0f, 4360.0f, (float) 565L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 526.0f + "'", float3 == 526.0f);
    }

    @Test
    public void test12383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12383");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray3, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#0#10" + "'", str9, "10#0#10");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
    }

    @Test
    public void test12384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12384");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 233, 0L, 4732L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12385");
        long[] longArray2 = new long[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray2, 'a', (int) 'a', 1);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray2, ' ');
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 1" + "'", str12, "-1 1");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test12386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12386");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                   0.001A0.25A0.01A0.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12387");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("  4     #0...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A...A52.0A", (double) 993);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 993.0d + "'", double2 == 993.0d);
    }

    @Test
    public void test12388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12388");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 62, 526);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 62");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str11, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str13, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12389");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 526.0f, (double) 116);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 526.0d + "'", double3 == 526.0d);
    }

    @Test
    public void test12390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12390");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 62L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12391");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-", 1314);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1314 + "'", int2 == 1314);
    }

    @Test
    public void test12392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12392");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12393");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ', 526, 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
    }

    @Test
    public void test12394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12394");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#-1 32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a10a-1a144444444444444444444444444444444444444444444444444444444444444444444444444444444.a.25a.a.--.a.a52.a.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12396");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.04100.040.0A0.25A0.01A0.1-...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a...a52.0a1-1.0a10.0a52.0a100.0-0000a.000..000a.00a11a00.a000..000.a0000");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12397");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 565, (double) 478.0f, (double) 993);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 478.0d + "'", double3 == 478.0d);
    }

    @Test
    public void test12398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12398");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0a0a10...a52.0a1a0.25a...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12399");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(526, 62, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12400");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaa0a1a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12401");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1422, 954, 1755);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 954 + "'", int3 == 954);
    }

    @Test
    public void test12402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" 0 10 0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  0 10 0...30.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A100.00.001A0.25A0.01A0.1--1.0A10.0A52.0A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12403");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 10, (double) 488, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 488.0d + "'", double3 == 488.0d);
    }

    @Test
    public void test12404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a0a0a10a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a0a10a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12405");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12407");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a10.0a52.0a", 958);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 958 + "'", int2 == 958);
    }

    @Test
    public void test12408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12408");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444440.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#044444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444440.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#044444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12409");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#', (int) (byte) 0, 104041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test12410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12410");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.4444444444444444444444444444444444444444444444444444444444444444444444444444     -1 32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12411");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a-1.0a10.0a52.0a100.", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12412");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1755, (float) 104041, (float) 4732L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104041.0f + "'", float3 == 104041.0f);
    }

    @Test
    public void test12413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12413");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0", (float) 4732);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4732.0f + "'", float2 == 4732.0f);
    }

    @Test
    public void test12414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12414");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test12415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12415");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray5, 'a');
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a1a0a-1a10" + "'", str8, "100a1a0a-1a10");
    }

    @Test
    public void test12416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12416");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAA4A4AAAA4A4AAA#AA#A#A#AA#AAAAa1.1-a1.--404a1.1-a1.--41004.40014a404.4254a404.4014a404.414--414.404a4104.404a4524.404a41004.40104a1.1-a1.--404a1.1-a1.--410");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12417");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12418");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 109.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 109.0d + "'", double2 == 109.0d);
    }

    @Test
    public void test12419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12419");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 558, 0);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float23 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str14, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str20, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str22, "-1.0 10.0 52.0 100.0");
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + (-1.0f) + "'", float23 == (-1.0f));
    }

    @Test
    public void test12420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12420");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12421");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(998, 1952, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1952 + "'", int3 == 1952);
    }

    @Test
    public void test12422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12422");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 547, 233);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test12423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12423");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray3, ' ', (int) '#', 478);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040410" + "'", str11, "1040410");
    }

    @Test
    public void test12424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12424");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("11001010  ", (long) 85);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 85L + "'", long2 == 85L);
    }

    @Test
    public void test12425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12425");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a1-1.0a10.0a52.0a1100.a52.0a10.0a0.1--1.0a0.01a0.25a100.001#0#010.001a52.0a10.0a-1.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12426");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10#0#100.001#0.25#0.01#0.1--1.0#10.0#52.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12427");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12428");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 10.0 52.0 100.0", 85.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 85.0f + "'", float2 == 85.0f);
    }

    @Test
    public void test12429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12429");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.00.001a0.25a0.01a0.1441.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12430");
        long[] longArray6 = new long[] { 1, (short) 1, 62L, (byte) 0, 62L, 10L };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 1040410, 1);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[1, 1, 62, 0, 62, 10]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 62L + "'", long12 == 62L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test12431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12431");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4510, 100L, (long) 657);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test12432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12432");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-A10.0", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test12433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12433");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 954, (double) (short) 1, (double) 85);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test12434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12434");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, 1422);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1422 + "'", int3 == 1422);
    }

    @Test
    public void test12435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12435");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a10#0#1010a0a10#4410a0a10#4410a0a10#4410a0a10#4410a0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12436");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12437");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0404104-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0404104-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12438");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4360.0f, (double) 4732L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4732.0d + "'", double3 == 4732.0d);
    }

    @Test
    public void test12439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12439");
        int[] intArray2 = new int[] { ' ', (byte) 0 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 10, (int) (short) 10);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        int int11 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 780, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 0]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "3240" + "'", str10, "3240");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32#0" + "'", str17, "32#0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test12440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12440");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', (int) (byte) 1, 656);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str11, "-1.0#10.0#52.0#100.0");
    }

    @Test
    public void test12441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.01-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#1-A1.25A1.1-A1.-44444444444444444444444444444444444444444444444444444444444444444444444444444444.A.25A.A.--.A.A52.A.0a1a132 00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0a0.00.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12442");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a10.0" + "'", str9, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0a10.0" + "'", str12, "0.0a10.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test12443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12443");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 574, (int) (byte) -1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 189, (int) (byte) 100);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12444");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 958, (long) 4732, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 4732L + "'", long3 == 4732L);
    }

    @Test
    public void test12445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12445");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray1, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray1, "A0.01A0.1--1.0A10.0A52.0A                                                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: A0.01A0.1--1.0A10.0A52.0A                                                                ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test12446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12446");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(4096.0d, (double) 565L, 993.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4096.0d + "'", double3 == 4096.0d);
    }

    @Test
    public void test12447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#...32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.10#0#...32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12448");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444########");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12449");
        float[] floatArray4 = new float[] { (-1.0f), 0, 62, (byte) 1 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 0.0, 62.0, 1.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + (-1.0f) + "'", float6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 62.0f + "'", float7 == 62.0f);
    }

    @Test
    public void test12450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12450");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(3240L, 62L, (long) 1314);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 62L + "'", long3 == 62L);
    }

    @Test
    public void test12451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12451");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test12452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12452");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4');
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10a0a10" + "'", str10, "10a0a10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1040410" + "'", str16, "1040410");
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test12453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12453");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A1.1-A1.--404A1.1-A1.--41004.40014A404.4254A404.4014A404.414--414.404A4104.404A4524.404A41004.40104A1.1-A1.--404A1.1-A1.--410");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12454");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a10.0a52.0a100.0                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test12455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12455");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0#0#100.001a0.25a0.01a0.-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A0#0#100.001a0.25a0.01a0.1", 3637);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3637 + "'", int2 == 3637);
    }

    @Test
    public void test12456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12456");
        short[] shortArray6 = new short[] { (short) 10, (byte) -1, (short) 1, (short) 1, (byte) -1, (short) 100 };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, -1, 1, 1, -1, 100]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#-1#1#1#-1#100" + "'", str8, "10#-1#1#1#-1#100");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) -1 + "'", short9 == (short) -1);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
    }

    @Test
    public void test12457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12457");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0 4 #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0 4 # is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12458");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test12459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12459");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1422, (float) (-1L), (float) 958);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1422.0f + "'", float3 == 1422.0f);
    }

    @Test
    public void test12460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a.5a.1a.1-1a.5a.1a.1-.1a.5a.1a.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a.5a.1a.1-1a.5a.1a.1-.1a.5a.1a.1- is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12461");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#0#100.001a0.25a0.01a0.1--1.0...                                                                    ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12462");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a4#0.001a0.25a0.01a0.1-", (double) 104041.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104041.0d + "'", double2 == 104041.0d);
    }

    @Test
    public void test12463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.001a0A1.1-A1.--1040410A10.00 10.0Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.001a0A1.1-A1.--1040410A10.00 10.0Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#Aa1a.a--a10404101a.a1a-aAa1a.a--a104041041a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a10404101a.a1a-aAa1a.a--a1040410#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12464");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12465");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, 100L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12466");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 10 + "'", byte4 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
    }

    @Test
    public void test12467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12467");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1A0.25A0.01A0.1-1A0.25A0.01A0.1-0.001A0.25A0.01A0.1-", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12468");
        long[] longArray2 = new long[] { 0, (-1L) };
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray2);
        java.lang.Class<?> wildcardClass5 = longArray2.getClass();
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[0, -1]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test12469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12469");
        short[] shortArray3 = new short[] { (short) 10, (byte) 0, (byte) 10 };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray3, '4', (int) '4', (int) (byte) 0);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray3, 'a', 998, 165);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray3);
        org.junit.Assert.assertNotNull(shortArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray3), "[10, 0, 10]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 0 + "'", short8 == (short) 0);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
    }

    @Test
    public void test12470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12470");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 604, 404L, (long) 526);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 604L + "'", long3 == 604L);
    }

    @Test
    public void test12471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12471");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 165L, (double) 165L, (double) 574L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 574.0d + "'", double3 == 574.0d);
    }

    @Test
    public void test12472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12472");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(4360, 116, 3240);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 116 + "'", int3 == 116);
    }

    @Test
    public void test12473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12473");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 104041.0f, 478.0d, 558.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 478.0d + "'", double3 == 478.0d);
    }

    @Test
    public void test12474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12474");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 574, 476);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-141" + "'", str9, "-141");
    }

    @Test
    public void test12475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12475");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str11, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str15, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0 10.0 52.0 100.0" + "'", str17, "-1.0 10.0 52.0 100.0");
    }

    @Test
    public void test12476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12476");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444A10.10a0a100.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.0.001A0.25A0.01A0.1--1.0A10.0A52.0A444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 1980L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1980L + "'", long2 == 1980L);
    }

    @Test
    public void test12477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12477");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...a52.0a...A52.0A1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12478");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0-1.0a10.0a52.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12479");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                    0.0a100.0a0.0                                    ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12480");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4360L, (double) 574.0f, (double) 1755);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4360.0d + "'", double3 == 4360.0d);
    }

    @Test
    public void test12481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12481");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("##4", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12482");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#0#100.001A0.25A0.01A0.1--1.0...#a#aAaAaAaAaAaA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#0#100.001A0.25A0.01A0.1--1.0...#a#aAaAaAaAaAaA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12483");
        long[] longArray4 = new long[] { (byte) 1, (byte) -1, 10L, (byte) 1 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 559, (int) (short) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1a-1a10a1" + "'", str7, "1a-1a10a1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1a-1a10a1" + "'", str13, "1a-1a10a1");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test12484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12484");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1.0A10.0A52.0A...A52.0A1-1.0A10.0A52.0A100.0-1.0A10.0A52.0A1-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12485");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#############################################################-1.0a10.0a52.0a100.001#0#010.001a0.25a0.01a0.1--1.0a10.0a52.0a100.", (float) 4732);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 4732.0f + "'", float2 == 4732.0f);
    }

    @Test
    public void test12486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12486");
        int[] intArray5 = new int[] { 100, (short) 1, (byte) 0, (-1), 10 };
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray5, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 0, -1, 10]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#1#0#-1#10" + "'", str9, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1#0#-1#10" + "'", str12, "100#1#0#-1#10");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test12487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12487");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12488");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12489");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("14100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12490");
        float[] floatArray4 = new float[] { (byte) -1, 10.0f, '4', (short) 100 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        float float17 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 52.0, 100.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str7, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0a10.0a52.0a100.0" + "'", str14, "-1.0a10.0a52.0a100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#10.0#52.0#100.0" + "'", str16, "-1.0#10.0#52.0#100.0");
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + (-1.0f) + "'", float17 == (-1.0f));
    }

    @Test
    public void test12491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12491");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test12492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12492");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(823, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 823 + "'", int3 == 823);
    }

    @Test
    public void test12493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12493");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.001a0.25a0.01a0.1--1.0a10.0a52.0a100.001#0#01#0#0101#0#010.001A0.25A0.01A0.1--1.0A10.0A52.0A100.001#0#01#0#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12494");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  10#0#100.001A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                      \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12495");
        double[] doubleArray3 = new double[] { (short) 0, 100.0f, 0.0d };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 0, 476);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0.0a100.0a0.0" + "'", str8, "0.0a100.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.04100.040.0" + "'", str10, "0.04100.040.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0#100.0#0.0" + "'", str13, "0.0#100.0#0.0");
    }

    @Test
    public void test12496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12496");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A0.25A0.01A0.1--1.0A10.0A52.0A100.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12497");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("23", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 23L + "'", long2 == 23L);
    }

    @Test
    public void test12498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12498");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(byteArray1, '#');
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray1);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray1, '4');
        java.lang.Class<?> wildcardClass9 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 10 + "'", byte5 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 10 + "'", byte6 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12499");
        double[] doubleArray2 = new double[] { 0.0f, 10.0f };
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 190, 1501);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 190");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test12500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test12500");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("14100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }
}

