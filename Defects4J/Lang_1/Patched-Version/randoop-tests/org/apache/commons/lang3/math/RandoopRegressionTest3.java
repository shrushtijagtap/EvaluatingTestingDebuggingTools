package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1501");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 156, (long) '4', (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 41L + "'", long3 == 41L);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1502");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("     aa #a #a #a #a #a #a #a #a #a #     ", 2881);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2881 + "'", int2 == 2881);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1503");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1504");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("    -1.0A52.0                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1505");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(32L, (long) 867, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 867L + "'", long3 == 867L);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1506");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("# a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1-110010-1.0true-1-1100a##-1-110010-1.0true-1-1100a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1508");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                            10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1509");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1510");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 0, (long) (short) 52, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1511");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (byte) 10, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1512");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(188, (int) (short) 100, 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1513");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1514");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                 a1", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1515");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(45L, 45L, (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 41L + "'", long3 == 41L);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1516");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(133, 0, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 185 + "'", int3 == 185);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1517");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0" + "'", str7, "0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.0" + "'", str11, "0.0");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1518");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1519");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1520");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (-141.0f));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-141.0d) + "'", double2 == (-141.0d));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0A52.0#########################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A52.0#########################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1522");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 408, 111);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 0.0f + "'", float12 == 0.0f);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1523");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".0 # # # # # # # # #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1524");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0a10.0a-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1525");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1526");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" 10 -1.0 true-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa...2.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52....");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 10 -1.0 true-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa...2.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52....\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1527");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1528");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0 10.0 -1.0                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1529");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 55, 0.0f, (float) 197L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1530");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) -1, 53, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1531");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.040.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1532");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 12, 100.0d, (double) 44);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1533");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 42, 32);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1534");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 35);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1535");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a52  44444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1536");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1537");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(97, 8, 3224);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1538");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("97 100 10 0 0 102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1539");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a4#4a", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1540");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1541");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10410497-1a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1542");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1543");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(408L, (long) 24, (long) 102);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 408L + "'", long3 == 408L);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1544");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1545");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100a1", (double) 42.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.0d + "'", double2 == 42.0d);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1547");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n4444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1548");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(90, 3224, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3224 + "'", int3 == 3224);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1549");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 72, 4.4444444444444445E51d, 35.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1550");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1551");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 28, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1552");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2881, 42, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 42 + "'", int3 == 42);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1553");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0 10.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1554");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 197L, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 197.0f + "'", float3 == 197.0f);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1555");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....-1.0#52.0-1...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1556");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (byte) 1, (float) 45L, 9.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1557");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 1 + "'", short11 == (short) 1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1558");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1559");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("25A0.1-#########################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1560");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                            -1A1A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1561");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 44, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1562");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10.0 -1.0100.0 10.0 -1.010#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1563");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1#-1#100#10#-1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1564");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa9752.01021hi!", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1565");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(34.0f, (float) 41L, (float) 72);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 72.0f + "'", float3 == 72.0f);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1566");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("####################################################-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1567");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 65, 48);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray5, '#', 408, 41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1568");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0A          .0A52.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1569");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0", (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1570");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 42");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1571");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 0, 50);
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
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1-110010-1.0TRUE-1-1100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1-110010-1.0TRUE-1-1100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1573");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                   #A 001 1- 1-EURT 0.1- 01 001 1- 1-#", (double) (short) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1574");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 14.0d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1575");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) (short) -141, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -141");
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
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1576");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 -1 100 10 -1.0 true-1 -1 100 ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1577");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10#10#97");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1578");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1579");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ');
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1580");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 -1 100 10 -1.0 TRUE-1 -1 100 AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA10041AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1581");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("141004-1", (long) (short) 52);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1582");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(2.0f, (float) 197L, (float) 12L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 197.0f + "'", float3 == 197.0f);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1583");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 0 1 0" + "'", str10, "-1 0 1 0");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1584");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("  44444444  44444444  44444444  44444444 0#1#1#0#1#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1585");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aaaaa aaaa -aaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaa aaaa -aaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaa");
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1041410040410" + "'", str14, "1041410040410");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1586");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("            a # a             ", 16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1587");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("T.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T-1.TA52.TT.T # # # # # # # # # #971TT1TTT1T", (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1588");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0 10.0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1aaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1589");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3224, (float) 14L, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3224.0f + "'", float3 == 3224.0f);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1590");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 45, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 119, 185);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 119");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1404140" + "'", str12, "-1404140");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1591");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1592");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0 10 0 1 10 10 0 1 10 10 0 1 .0a52.ing;");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1593");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1594");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1595");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "10a1a100a0a10");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10a1a100a0a10");
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
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1596");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hi...", 49);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1598");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("101.0#10041.0#30.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a###a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a###a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1600");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("141-class [Ljava.laa4#4ava.l", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1601");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 31, (double) 7, 1098504.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1098504.0d + "'", double3 == 1098504.0d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1602");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1603");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 52);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 52 + "'", short2 == (short) 52);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1604");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 54L, (float) 61);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 61.0f + "'", float3 == 61.0f);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1605");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 7, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1606");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1607");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) 41, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1608");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 133, (float) 48L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.0 10.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 10.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1610");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# #...-1 -1 100 10 -1.0 TRUE-1 -1 100", (double) Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + Double.POSITIVE_INFINITY + "'", double2 == Double.POSITIVE_INFINITY);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1611");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0a52.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1612");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("001 1- 1-eurt 0.1- 01 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1613");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#####-1 -1 100 10 -1.0 TRUE#####");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1614");
        int[] intArray1 = new int[] { 9 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', 30, 169);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[9]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(80, 28, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1616");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("... .0a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"... .0a...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1618");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1619");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1620");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1621");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1622");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(49, 24, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 185 + "'", int3 == 185);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1623");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1#1#", 185.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 185.0f + "'", float2 == 185.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1624");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("01A0A0A01A001A79# A# A# A# A# A# A# A# A# A# A0.0", 41);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 41 + "'", int2 == 41);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("####################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1626");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a52.0 .\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1627");
        float[] floatArray5 = new float[] { 1098504L, Float.POSITIVE_INFINITY, 5, 35, 2560 };
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[1098504.0, Infinity, 5.0, 35.0, 2560.0]");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + Float.POSITIVE_INFINITY + "'", float6 == Float.POSITIVE_INFINITY);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + Float.POSITIVE_INFINITY + "'", float7 == Float.POSITIVE_INFINITY);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1628");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a#", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1629");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, (double) 34.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1630");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(18L, 97L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1631");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1632");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hi!-1 -1 100 10 -100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1633");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(28.0f, 0.0f, 1.0410497E7f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0410497E7f + "'", float3 == 1.0410497E7f);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1634");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-0", (float) 30);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 30.0f + "'", float2 == 30.0f);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1635");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 1-1 -1 100 10 -1.0 true-1 -1 100 -1.-1 -1 100 10 -1.0 true-1 -1 100 TRUE-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 A                                                                                             -1A1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1636");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("101097101097101097101097101097101097101097101097", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1637");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((-1), 2, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1638");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1a1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1639");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1640");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(359, 6, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1641");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 10, (float) 6, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1642");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0", (-141));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-141) + "'", int2 == (-141));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1643");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (byte) 1, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1644");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(11, 197, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 197 + "'", int3 == 197);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1645");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1646");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1a0a1a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a0a1a0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1647");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 25, (long) 55);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 55L + "'", long3 == 55L);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1648");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) (short) 1, 0);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 0.0f + "'", float11 == 0.0f);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1649");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 408, (long) (byte) 100, (long) 41);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 408L + "'", long3 == 408L);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1650");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#1#100#0#1010041");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1651");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 12.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 12.0d + "'", double2 == 12.0d);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1652");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1653");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("            a # a             ", 8.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 8.0f + "'", float2 == 8.0f);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1654");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1655");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("######################################################################################################", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1656");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#0.0", 10041);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10041 + "'", int2 == 10041);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1657");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaa aaaa -aaa141004-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1658");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97 100 10 0 0 102" + "'", str11, "97 100 10 0 0 102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "97 100 10 0 0 102" + "'", str14, "97 100 10 0 0 102");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1659");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaa               0.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaa               0.040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".040.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1661");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.040.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1662");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 124.0f, (double) 56L, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1663");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', 25, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1664");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0 is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1665");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1 100 -1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1666");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("    -1.0A52.0    ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1667");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '#', (int) (short) 10, 140);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 140 + "'", int3 == 140);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1668");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3.0f, 0.0f, (float) 104L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 104.0f + "'", float3 == 104.0f);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1669");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                    -1 -1 100 10 -1.0 true-1 -1 100 ", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 20 + "'", int2 == 20);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1670");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0-1.0 100.0 1.0 -1.0", 34L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1671");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0" + "'", str9, "0.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1672");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#########");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1673");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 110, (float) 102L, (float) 104);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 110.0f + "'", float3 == 110.0f);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1674");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 52, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 52 + "'", short3 == (short) 52);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1675");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("F[ ssalcJ[ ssalcB[ ssalc;gnirtS.gnal.avajL[ ssalc001 1- 1-eurt 0.1- 01 001 1- 1-#", (long) 32);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1676");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2560, (int) '4', 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1677");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 10.0f + "'", float1 == 10.0f);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1678");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####################################################-1.0a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1679");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', (int) (byte) -1, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0 1 1 10" + "'", str12, "0 1 1 10");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 0 + "'", short13 == (short) 0);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1680");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 871, 11L, (long) 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1681");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-14-1-14-1AAAAAAAAAAAAAAAAAAA...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1682");
        float[] floatArray3 = new float[] { 10, (short) 10, 102L };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0, 102.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10.0a10.0a102.0" + "'", str5, "10.0a10.0a102.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 102.0f + "'", float6 == 102.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 102.0f + "'", float7 == 102.0f);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1684");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("AAAAA AAAA -AAA141004-");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1685");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaa #", 9.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1686");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1687");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("TRUE-1 -1 100 A#                                                                   # a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1688");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#A 001 1- 1-EURT 0.1- 01 001 1- 1-#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa###############################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1-1 -1aaaaaaaaaaaaaaaaaaaaaaaa###############################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1690");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 46, 102.0f, (float) 61);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1691");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1692");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) 'a', 41);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1693");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".0 # # # # # # # # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0 # # # # # # # # #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1694");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1695");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##        ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1696");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 53, 8);
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 133, 2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1697");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1698");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1699");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 15, (-1));
        short short17 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
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
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 100 + "'", short17 == (short) 100);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1700");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, 0.0d, (double) 49);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1701");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1--1 11-1 1A-1 11-1 1A-1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1702");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa", (double) 42);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 42.0d + "'", double2 == 42.0d);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1703");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a#a#a#a#a-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0-1a0a1a0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0a510a-1.0-1.0#a#a#a#a#a#a#a#a#a#a#a#a#aa#a#a#a#a#a#a#a#a#", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1704");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1705");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1706");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (byte) -1, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1707");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 52, 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (byte) 10, 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 11, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
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
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1708");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 95, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 95");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97 100 10 0 0 102" + "'", str11, "97 100 10 0 0 102");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1709");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(32.0d, 1098504.0d, (double) 48L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1098504.0d + "'", double3 == 1098504.0d);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1710");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 110, 8);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 52.0d + "'", double9 == 52.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0452.0" + "'", str16, "-1.0452.0");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#######");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1712");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (int) (short) -141, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -141");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 23.0d + "'", double7 == 23.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1713");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\r                                                4#4a                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1714");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 17, 3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#52.0" + "'", str16, "-1.0#52.0");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1715");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1716");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 2, 111);
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
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1717");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1718");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 52, 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1719");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 17, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1720");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1721");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(197L, (long) 10041, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1722");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                                                                                                                                                                                                                                                                        ", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1723");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 4.444444444444444E99d + "'", double1 == 4.444444444444444E99d);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1724");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0" + "'", str7, "0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1725");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1726");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 56, (double) 10041L, (double) 124.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1727");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-110a5210a5297AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1728");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 104, (long) 19, (long) 72);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1729");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10a10a0a0a10a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1730");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("         aaaaa aaaa -aaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"         aaaaa aaaa -aaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1731");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                            -1A1A", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1732");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 185, 87L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 185L + "'", long3 == 185L);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1733");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(23, 1458, 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1734");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1735");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1736");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1737");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#1#1#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1738");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("####################################################-1.0a52.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1739");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (short) 52, 408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1740");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(5, 101, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1741");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 10, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1742");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 12, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 12");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1743");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 52.0f, (double) 34L, (double) 101);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1744");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
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
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0a52.0" + "'", str17, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1745");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1 0 1 0" + "'", str12, "-1 0 1 0");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1746");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0a #a #a #a #a #a #a #a #a               0a0a0a10 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1747");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(104L, (long) 16, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1748");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1749");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("!!!!!!IH!IH1-!!!!!!!!!!!!!!!!!!!II11-1-eurtIH1-I1", (double) 104.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 104.0d + "'", double2 == 104.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1750");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 45, (int) (short) 1);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 11, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1404140" + "'", str12, "-1404140");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1751");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a ", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1752");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("52.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0#-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 1-1 -1 100 10 -1.0 TRUE-1 -1 100 -1.-1 -1 100 10 -1.0 TRUE-1 -1 100 true-1 -1 1-1 -1 100 10 -1.0 TRUE-1 -1 100-1 -1 100 10 -1.0 TRUE-1 -1 100 a                                                                                             -1a152.0-1A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A52.0-10A52.0-1.0A52.0-1.0A52.0-1.0A0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1753");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(34L, (long) 56, (long) 9);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 56L + "'", long3 == 56L);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1754");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (int) ' ', 867);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97#100#10#0#0#102" + "'", str19, "97#100#10#0#0#102");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1755");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(90, 30, 185);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30 + "'", int3 == 30);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1756");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100 100 100 10 1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("...-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1758");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 29, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 29");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100.0410.04-1.0" + "'", str8, "100.0410.04-1.0");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1759");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 11L, (float) 65, (float) 111L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 11.0f + "'", float3 == 11.0f);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10410497141004-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10410497141004-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1761");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1#1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1.0a52. -1a1#1#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1762");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100", 42.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 42.0f + "'", float2 == 42.0f);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1763");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 17, 156);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1764");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1765");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 14, 119L, (long) 17);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 119L + "'", long3 == 119L);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1766");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a52.0aaaaaaaaaaaaaaaaaaaa", 10041.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10041.0f + "'", float2 == 10041.0f);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1767");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 95, (float) 111, (float) 188L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 95.0f + "'", float3 == 95.0f);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1768");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1769");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a4#4a100.010.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1770");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1771");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(34L, (long) 140, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1772");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("# AA #A #A #A #A #A #A #A #A #A #a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1773");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1 #A #A #A #A #A #A #A #A #A #444444444444444444444444444444444444444444444444444444444444-1.0a52.0", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1774");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0", (long) 359);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 359L + "'", long2 == 359L);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1775");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (long) 20, (long) 2881);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1776");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 102L + "'", long13 == 102L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97410041040404102" + "'", str15, "97410041040404102");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1777");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1778");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1779");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 90, (float) 140, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 140.0f + "'", float3 == 140.0f);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1780");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("97#100#10#0#0#102-1 100 10 -1.0 tru");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"97#100#10#0#0#102-1 100 10 -1.0 tru\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1781");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                     -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
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
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1782");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(53.0d, (double) (short) 10, (double) 14.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1783");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 true", (float) 22);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 22.0f + "'", float2 == 22.0f);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1784");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-               -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-     ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1785");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-");
        } catch (java.io.UnsupportedEncodingException e) {
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 0 + "'", byte19 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + byte24 + "' != '" + (byte) 0 + "'", byte24 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) 0 + "'", byte25 == (byte) 0);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1786");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("               aaaaaaaaaa", 32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 32.0d + "'", double2 == 32.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1787");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 32, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1.0" + "'", str13, "-1.0");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1788");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1789");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-rr-rrruurrur-r.urTRUE-rr-rrruu");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1790");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1791");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0 10.0 -1.0100.0 10.0 -1.010#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1792");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1793");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                            -1A1Aue-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297hi!-1 -1 100 10 -1.0 true-1 -1 10a #a #a #a #a #a #a #a #a #10a5210a5297");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1794");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#1#1#");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1795");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1796");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 97);
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
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1798");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 12L, (double) 111, 10041.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10041.0d + "'", double3 == 10041.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1799");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "#-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1 -1 100 10 -1.0 true-1 -1 100 a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 100 -1" + "'", str6, "1 100 -1");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1800");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1801");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (short) 1, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a52.0" + "'", str15, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0#52.0" + "'", str17, "-1.0#52.0");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1802");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("A A A A ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1803");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1804");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 18, (double) 0, (double) 17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1805");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 18);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 18L + "'", long2 == 18L);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1806");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 41L, (double) 17.0f, 1.0410497E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0410497E7d + "'", double3 == 1.0410497E7d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1807");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" # # # # # # # # # #");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1808");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 359L, (double) 22, (double) 188);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 359.0d + "'", double3 == 359.0d);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1809");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                            ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1810");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) ' ', 9);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 3, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0.0 0.0" + "'", str10, "0.0 0.0");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1811");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0 a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1812");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a##A0011-1-EURT0.1-010011-1-#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1813");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1814");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 102.0f, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.0d + "'", double3 == 102.0d);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1815");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(11L, (long) 49, (long) 44);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 49L + "'", long3 == 49L);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1816");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 185, 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1817");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1818");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAA                                                    -1.0A52.0AAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1819");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("          .0a5-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1820");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1821");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("         10a-1         ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1822");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("class [Ljava.laa4#4ava.lang.String;", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1823");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1824");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1825");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02-1.0a52.0                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1826");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#A 001 1- 1-EURT 0.1- 01 001 1- 1-#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1827");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0a1a1a10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1828");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(52L, (long) 140, (long) 30);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 140L + "'", long3 == 140L);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1829");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 110, 8);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', 0, 34);
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
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1830");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4#4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1831");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("##04141410", 104L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 104L + "'", long2 == 104L);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1832");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("# aa #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1833");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("class [Ljava.laa4#4ava.lang.String;444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1834");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                  100.0 10.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                   100.0 10.0");
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
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1835");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 111, 0);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 102L + "'", long12 == 102L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 102L + "'", long18 == 102L);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1836");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1837");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.1-");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1838");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1839");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-110a5210a5297AAAAA AAAA -AAA141004-1AAAAA AAAA -AAA141004-1", (float) 124L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 124.0f + "'", float2 == 124.0f);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1840");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                        #A #A #A #A #A #A #A #A #A #", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1841");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                      1004100410041041                     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1842");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1843");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        float float7 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 5, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0.0" + "'", str6, "0.0");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("...     ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...     ...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1845");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 3, 0);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1846");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 55L, (float) 18L, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1847");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D-1 -1 100 10 -1.0 true-1 -1 100class [D is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1849");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("9752.0102");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1850");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 15, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1.0452.0" + "'", str14, "-1.0452.0");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1851");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1852");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 52L, 0.0f, 56.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 56.0f + "'", float3 == 56.0f);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1853");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1854");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1855");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 52, (double) 11L, (double) 188.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1856");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), (long) (-141), (long) (short) -141);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1857");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1858");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    -1.0a52.0", (float) 92);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 92.0f + "'", float2 == 92.0f);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1859");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1860");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 140, 3224.0f, (float) 867);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3224.0f + "'", float3 == 3224.0f);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1861");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 31.0f, (double) 19, (double) 188.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 188.0d + "'", double3 == 188.0d);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1862");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...2.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52....####################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1863");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1864");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2881, 60, 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1865");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 13, 235);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1866");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (short) -141, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -141");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1867");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1868");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...-1 -1 100aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaa...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1869");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 52, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1870");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 56, 10);
        long long18 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 104, 55);
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1871");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1872");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-               -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-     ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-               -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1873");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1874");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(140.0f, (float) 34L, (-141.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 140.0f + "'", float3 == 140.0f);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1875");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1876");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(49, (int) (short) 52, 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 49 + "'", int3 == 49);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1877");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 ", 34);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1878");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (int) (short) 1, 0);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 52.0d + "'", double14 == 52.0d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1879");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1A0A1A0-1.0A.0a52..0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1880");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0-1a0a1a0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0a5         10a-1         .0-1.0#a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a ", (short) 52);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 52 + "'", short2 == (short) 52);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1881");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1882");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 9, (double) 4141410L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4141410.0d + "'", double3 == 4141410.0d);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1883");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("000009701a001");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1884");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(24, 42, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1885");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 0, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 18, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0#52.0" + "'", str7, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1886");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray1, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2" + "'", str5, "2");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2" + "'", str7, "2");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1887");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1888");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(75, 119, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1889");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 48, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1890");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "04141410" + "'", str8, "04141410");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 0 + "'", short10 == (short) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "04141410" + "'", str12, "04141410");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1891");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0" + "'", str7, "0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0" + "'", str9, "0.0");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1892");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', (int) (short) -1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1041410040410" + "'", str13, "1041410040410");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10 1 100 0 10" + "'", str15, "10 1 100 0 10");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1893");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', 46, 8);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 27, 22);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10 10 97" + "'", str11, "10 10 97");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a10a97" + "'", str13, "10a10a97");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1894");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 25 + "'", int2 == 25);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1895");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 5, (int) (short) 1);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 0 + "'", byte17 == (byte) 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1896");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 0, 7);
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
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1897");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1898");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1-110010-...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1899");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1900");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("##########A #A #A #A #A #A #A #A #A #A #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1901");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 52, (short) (byte) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1902");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("A 001 1-", (double) 102);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.0d + "'", double2 == 102.0d);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1903");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1904");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("a#a#a#a#a#a#a#a#a#a#97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1905");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                         ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1906");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a###a          .0 52.0          .0 52.0          .0 52.0          .0 52.0          .0 52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1907");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("####################################################a-a1a.a0aaa52a.a0aaaa52a52a52a52a52a52a52a52a52a52", (double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1908");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.toString(byteArray5, " 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100");
        } catch (java.io.UnsupportedEncodingException e) {
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
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 100 + "'", byte18 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10a1a100a0a10" + "'", str20, "10a1a100a0a10");
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1909");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HHHH!IH1-IH!IH1-IH!IH1-IH!IH1-IH!IH1-IHHHH!!!!!!!!!!!!!!!!!!!!IH!IH1-!!!!!!!!!!!!!!!!!!!II11-1-eurtIH1-I10a1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1910");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', (int) '#', 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 0 + "'", short16 == (short) 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0a1a1a10" + "'", str18, "0a1a1a10");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1911");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10a1a100a0a10-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1912");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1913");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) -141);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1914");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1915");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("               aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1916");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a4#4aaaaaaaaaaaAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1917");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.040.0" + "'", str9, "0.040.0");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1918");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 1098504, (long) 185);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1098504L + "'", long3 == 1098504L);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1919");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa14001aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 001 1- 1-eurt 0.1- 01 001 1- 1-01a0a001a1a01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1920");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 0, 1);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1921");
        long[] longArray6 = new long[] { 34, 34, 56, 14, 52, 97 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[34, 34, 56, 14, 52, 97]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14L + "'", long7 == 14L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 97L + "'", long8 == 97L);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1922");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444497#100#10#0#0#102-1 100 10 -1.0 tru");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1923");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1924");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0.0a0.0" + "'", str7, "0.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#0.0" + "'", str9, "0.0#0.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1925");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1926");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("# A# A# A# A# A# A# A# A# A# A.0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0# a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1927");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (double) 8.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1928");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int11 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int12 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10a10a97" + "'", str8, "10a10a97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10#10#97" + "'", str14, "10#10#97");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1929");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.0f + "'", float7 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0a0.0" + "'", str9, "0.0a0.0");
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1930");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(56, (int) (short) 100, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1931");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1932");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("##0414141                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"##0414141\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1933");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("       00  0   .0 true       00 0.0##########...");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1934");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a#a#a#a#a#a#a#a#a#a#97a100a10a0a0a102", 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1935");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(132, 1, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1936");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1937");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '4', 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 60, 2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0410.04-1.0" + "'", str17, "100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1938");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 489);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 489 + "'", int2 == 489);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                        \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1940");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray5, ' ', 52, (int) '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a100a100a10a1" + "'", str19, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1L + "'", long20 == 1L);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1941");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a10.0a-1.0" + "'", str10, "100.0a10.0a-1.0");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1942");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 12L, 188.0d, 61.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1943");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1944");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 53, (int) (short) -141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1945");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                      1004100410041041               ", 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 28 + "'", int2 == 28);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1946");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a4#0 1 0 1--1.0a52.0-1a...", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1947");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(14.0f, (float) 55, 27.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 55.0f + "'", float3 == 55.0f);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1948");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 119L, 52.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1949");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("................................a#0#0#a#0#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1950");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[35.0, 23.0, 97.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 23.0d + "'", double5 == 23.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35.0a23.0a97.0a52.0" + "'", str7, "35.0a23.0a97.0a52.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 23.0d + "'", double8 == 23.0d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1951");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 55, (float) (byte) 0, (float) 56L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 56.0f + "'", float3 == 56.0f);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1952");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 110, 8);
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass16 = doubleArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1953");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 87L, (float) 97, 6.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1954");
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
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 -1 100 10 -1.0 true-1 -1 100");
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
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1955");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 41.0f, 0.0d, (double) 408L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 408.0d + "'", double3 == 408.0d);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1956");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1957");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("# AA #A #A #A #A #A #A #A #A #A #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1958");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 51, (int) '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', (int) (byte) 0, 0);
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
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10L, (double) 51.0f, (double) 54L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1960");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 55, 2560);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2560 + "'", int3 == 2560);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1961");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1962");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 41, (int) (byte) -1);
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 41, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short19 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 100 + "'", short10 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100#1" + "'", str12, "100#1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100#1" + "'", str18, "100#1");
        org.junit.Assert.assertTrue("'" + short19 + "' != '" + (short) 100 + "'", short19 == (short) 100);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1963");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a10", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1964");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 185, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 185.0f + "'", float3 == 185.0f);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1965");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) 'a', 15);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1966");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".0#52.0-1.0#A aA aA aA aA aA aA aA aA aA a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: .0#52.0-1.0#A aA aA aA aA aA aA aA aA aA a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1967");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long20 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97#100#10#0#0#102" + "'", str19, "97#100#10#0#0#102");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1968");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" 100 10 -1.0 true-1 -1 100 a#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1969");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', (int) (byte) 1, 0);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0410.04-1.0" + "'", str7, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1970");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1971");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1972");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10.0 -1.0# AA #A #A #A #A #A #A #A #A #A #", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1973");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" HI!", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1974");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1975");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(".0a52.0-1a...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1976");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0410.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1977");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("####################################################a-a1a.a0aaa52a.a0aaaa52a52a52a52a52a52a52a52a52a52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1978");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 0, (int) (byte) -1);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1979");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) 'a', 489);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1980");
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
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 15, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
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
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1982");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 15.0d, (double) 22.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1983");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1984");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "hi!-1 -1 100 10 -100.0a10.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hi!-1 -1 100 10 -100.0a10.0a-1.0");
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
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 0 + "'", byte16 == (byte) 0);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1985");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(41, (int) '#', 40);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1986");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-141" + "'", str6, "-141");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1#1" + "'", str10, "-1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1#1" + "'", str12, "-1#1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1987");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 0, 359);
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
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1988");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', 87, 42);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0#52.0" + "'", str5, "-1.0#52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0a52.0" + "'", str12, "-1.0a52.0");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1989");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-...          0.1-", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1990");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10.0 10.0 102.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1991");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAA                         AAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1993");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                   -1.0a52.0aaaaaaaaaaaaaaaaaaaa", (float) 185);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 185.0f + "'", float2 == 185.0f);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1994");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1995");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                     aaaaaaaaaaaaaaaaaaaaaaaa1a1-          ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1996");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("           -1aa1-a1-a1-a1-a1-a1-a1-a1-a1-a1-0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("  44444444  44444444  44444444  44444444 0#1#1#0#1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444  44444444  44444444  44444444 0#1#1#0#1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1998");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#", (double) 871);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 871.0d + "'", double2 == 871.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test1999");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 408, 111);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0" + "'", str12, "0.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest3.test2000");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041410040410" + "'", str11, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 1 100 0 10" + "'", str14, "10 1 100 0 10");
    }
}

