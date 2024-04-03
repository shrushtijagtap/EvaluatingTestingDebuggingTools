package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 8, 110.0f, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 8.0f + "'", float3 == 8.0f);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#a #a #a #a #a #a #a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(5, 53, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                # aa #a #a #a #a #a #a #a #a #a #                                ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("     aa #a #a #a #a #a #a #a #a #a #     ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(9, (int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10410497-1a1a", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 1, (int) 'a');
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("class [Ljava.lang.String;class [Bclass [Jclass [F");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"clas\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!-1 -1 100 10 -1.0 true-1 -");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("A #A #A #A #A #A #A #A #A #A #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a52.0" + "'", str10, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3, (float) 97L, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(22.0f, (float) 32L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1004100410041041", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2, (float) 48L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 48.0f + "'", float3 == 48.0f);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 17, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 17 + "'", int3 == 17);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1 -1 100 10 -1.0 true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, " #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:  #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 10, (double) 32, (double) 1.0410497E7f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("2", (float) 102L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 2.0f + "'", float2 == 2.0f);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 2560, 32.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!");
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("10#1#100#0#1010041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#1#100#0#1010041\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 52, 6.0f, (float) 10041L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(15, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 34, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 34 + "'", int3 == 34);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2L, 0.0f, (float) 102);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), (double) 32L, (double) 60);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 60.0d + "'", double3 == 60.0d);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (short) 0, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    -1.0a52.0", (float) 31);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 31.0f + "'", float2 == 31.0f);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(9, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 4, (long) 408);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#4a", (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10.0", (double) 3);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.0d + "'", double2 == 3.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("a52");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                      1004100410041041                      ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.004100410041041E15d + "'", double1 == 1.004100410041041E15d);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("# a", (double) 22);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 22.0d + "'", double2 == 22.0d);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a #a #a #a #a #a #a #a #a #a #", 11L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 11L + "'", long2 == 11L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 65, (long) 23, (long) 188);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 48L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100#100#100#10#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 41, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 100, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0452.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) '4', 60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 102L + "'", long9 == 102L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0 10 0 1 10 10 0 1 10 10 0 1 .0a52.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("9752.010219752.010219752.010219752.010219752.0102197AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 6, (long) 0, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0 10.0 -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0410.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) 35, 52L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                # aa #a #a #a #a #a #a #a #a #a #                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#####-1 -1 100 10 -1.0 TRUE#####");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #####-1 -1 100 10 -1.0 TRUE#####");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041410040410" + "'", str9, "1041410040410");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-14-140410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-11");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1098504, 1.0410497E7f, (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0410497E7f + "'", float3 == 1.0410497E7f);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 0, (int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (byte) 10, 9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "         10a-1         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:          10a-1         ");
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
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
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
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) -1, (long) 54, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#####-1 -1 100 10 -1.0 TRUE#####");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#########################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 188L, 3.0d, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("# a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 0 + "'", number1, 0);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("# a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(6, 45, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1-110010-1.0true-1-11000.0##########...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1-110010-1.0true-1-11000.0##########...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("  44444444  44444444  44444444  44444444 0#1#1#0#1#1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:   44444444  44444444  44444444  44444444 0#1#1#0#1#1# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1A0A1A0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100.0f, (double) 35L, (double) 87);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 111, (float) 100, (float) 8);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 111.0f + "'", float3 == 111.0f);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 17L, 0.0f, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#1#1#10", (double) 4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.0d + "'", double2 == 4.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, (double) 1098504, (double) 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1098504.0d + "'", double3 == 1098504.0d);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("         10a-1         ", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                            -1a1a", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\n", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, (float) 15);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 15.0f + "'", float3 == 15.0f);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "#-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1 -1 100 10 -1.0 true-1 -1 100");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 102, 0.0d, (double) 13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.0d + "'", double3 == 102.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0.0a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(6.0f, (float) 25, (float) 56);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                   #A 001 1- 1-EURT 0.1- 01 001 1- 1-#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                   #A 001 1- 1-EURT 0.1- 01 001 1- 1-#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(41L, (long) 100, (long) 8);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".0a52.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a52.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 100L, 10041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10041L + "'", long3 == 10041L);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 22.0f, 4.4444444444444445E51d, (double) 15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 65, (double) (byte) 100, (double) (-1L));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 56, 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 185, 54);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 2L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 2L + "'", long2 == 2L);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0##########################################-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 32L, (double) 54, (double) 11L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 11.0d + "'", double3 == 11.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 50, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n25a0.1-#########################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0 10.0 -1.0" + "'", str10, "100.0 10.0 -1.0");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.math.BigInteger bigInteger7 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass8 = bigInteger7.getClass();
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!", 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.prependIfMissing("-1.0a52.0", (java.lang.CharSequence) "                                                    ", (java.lang.CharSequence[]) strArray13);
        java.lang.Class<?> wildcardClass15 = strArray13.getClass();
        java.lang.Class[] classArray17 = new java.lang.Class[4];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray18 = (java.lang.Class<?>[]) classArray17;
        wildcardClassArray18[0] = wildcardClass2;
        wildcardClassArray18[1] = wildcardClass5;
        wildcardClassArray18[2] = wildcardClass8;
        wildcardClassArray18[3] = wildcardClass15;
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray18);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(bigInteger7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                    -1.0a52.0" + "'", str14, "                                                    -1.0a52.0");
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray17);
        org.junit.Assert.assertNotNull(wildcardClassArray18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;" + "'", str27, "class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(23.0d, 0.0d, (double) 31);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 31.0d + "'", double3 == 31.0d);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10.0a10.0a102.0", (float) 48L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 0, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) ' ', (double) 15);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 48, 0L, 188L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) -1, 0L, (long) 65);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(12, (int) '#', 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 1-1 -1 100 10 -1.0 true-1 -1 100 -1.-1 -1 100 10 -1.0 true-1 -1 100 TRUE-1 -1 1-1 -1 100 10 -1.0 true-1 -1 100-1 -1 100 10 -1.0 true-1 -1 100 A                                                                                             -1A1", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 8, (double) 12, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0##00#0#0004");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 10, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("01a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 17L, (float) 31, 22.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 31.0f + "'", float3 == 31.0f);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 34, 0.0d, (double) 56.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-141");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) -141 + "'", short1 == (short) -141);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.25A0.1-", (float) 408L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 408.0f + "'", float2 == 408.0f);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.Class<?> wildcardClass11 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 102L + "'", long10 == 102L);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1A0A1A0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0A52.0-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                              -1.0a52.0aaaaaaaaaaaaaaaaaaaa                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a52.0aaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                0 10 0 1 10 10 0 1 10 10 0 1 .0a52.                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 408L, (float) 2, (float) 97L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 408.0f + "'", float3 == 408.0f);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 87, (float) 102, (float) 56L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 56.0f + "'", float3 == 56.0f);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10#1#100#0#1010041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1 -1 100 10 -1.0 true-1 -1 100 a#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaa aaaa -aaa", 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 87, (double) 100.0f, (double) 13);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("################################## 10 -1.0 true-1 -1 100ang.string;class [ljava.lang.string;class [ljava.lang.string;", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("          .0a52.0", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -1, 17, 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 188 + "'", int3 == 188);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" a #a #a #a #a #a #a #a #a #a # ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 48, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 110, (float) 52, (float) 185);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 185.0f + "'", float3 == 185.0f);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1.0a52.                                                                                             -1a1", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100", 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52.0-1.0#52....");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 65, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 0 + "'", byte11 == (byte) 0);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaa aaaa -aaa-1 -1 100 10 -1.0 true-1 -1 100 aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("    -1.0A52.0                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("A4#4A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A4#4A is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1 100 -1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 56L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 56L + "'", long3 == 56L);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(56, 185, 10041);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("hi...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(17, (int) (byte) 0, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a 4a 4a 4a 4a 4a 4a 4a 4a 4", 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1 100 -1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 185.0f, 0.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#1#100#0#1010041");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(2, 52, 10041);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("hi!-1-110010-100.0a10.0a-1.0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "100.0 10.0 -1.0100.0 10.0 -1.010");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 100.0 10.0 -1.0100.0 10.0 -1.010");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (byte) 0, (float) 32);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(" #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a # #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                            -11                                                                                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                            -11                                                                                             \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("TRUE-1 -1 100 0.0##########################################-1.0A52.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#-1 -1 100 10 -1.0 true-1 -1 100", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 110, (double) (short) 1, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#####-1 -1 100 10 -1.0 TRUE#####");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(10.0d, 1.0d, (double) 48.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1--1 11-1 1A-1 11-1 1A-1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 110, (int) (short) -1);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("# #...-1 -1 100 10 -1.0 TRUE-1 -1 100", 50);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 4, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(28, 23, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0 100.0 1.0 -1.0", 4.4444444444444445E51d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E51d + "'", double2 == 4.4444444444444445E51d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(22.0d, (double) 32, (double) 20);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(11L, (long) 6, 32L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n25a0.1-#########################################", (double) 9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.0d + "'", double2 == 9.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1 -1-1 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 30, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("         10a-1         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 54, (double) 50, (double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 54.0d + "'", double3 == 54.0d);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 14L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 14.0d + "'", double2 == 14.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) 489, (long) 45);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ', 111, 28);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 0 + "'", short12 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        long[] longArray6 = new long[] { 34, 34, 56, 14, 52, 97 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 25, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[34, 34, 56, 14, 52, 97]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14L + "'", long7 == 14L);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        float[] floatArray3 = new float[] { 10, (short) 10, 102L };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, '#', 34, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 34");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0, 102.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10.0a10.0a102.0" + "'", str5, "10.0a10.0a102.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10a5210a5297");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0a10.0a-1.0", 24);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 24 + "'", int2 == 24);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#', 197, 52);
        java.lang.Class<?> wildcardClass15 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1#1#0       0.25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0##########################################-1.0a0.0##########################################-1.0a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("2");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 2.0f + "'", float1 == 2.0f);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 0, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#1#1" + "'", str10, "0#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 0 + "'", short11 == (short) 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0#1#1#10" + "'", str13, "0#1#1#10");
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 0 + "'", short14 == (short) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0 1 1 10" + "'", str16, "0 1 1 10");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(" aa #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa #a #a #a #a #a #a #a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                 a 4a 4a 4a 4a 4a 4a 4a 4a 4");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 110.0f, (double) 14L, (double) 30);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 14.0d + "'", double3 == 14.0d);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("####################################################-1.0a52");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0#0.0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(97L, 408L, (long) 60);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 60L + "'", long3 == 60L);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 110, 9.7410041040404096E16d, (double) 97.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("##aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 3, (long) 408, (long) 87);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 408L + "'", long3 == 408L);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0a                                                    -1.0", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        int[] intArray3 = new int[] { (byte) 10, (byte) 10, 'a' };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, '4');
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, 97]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10410497" + "'", str5, "10410497");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("52.0a                                                    -1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 6, (long) 31);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31L + "'", long3 == 31L);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("104104970 10 0 1 1-0 10 0 1 110 10 0 1 1a0 10 0 1 110 10 0 1 1a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', (-1), 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 110, (long) 'a', (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 110L + "'", long3 == 110L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 65, 124);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 65");
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
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 55, (double) 60L, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 102, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 102.0d + "'", double3 == 102.0d);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 3, (int) (short) 1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 97, (int) (byte) 1);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 102L + "'", long18 == 102L);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1 100 -1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
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
        java.lang.Class<?> wildcardClass18 = floatArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(52L, 6L, (long) 52);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 6L + "'", long3 == 6L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        double[] doubleArray4 = new double[] { (-1), 100, 1, (-1) };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaa                                                    a-a1a.a0aaa52a.a0aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        long[] longArray4 = new long[] { (-1L), (short) 0, 1L, (byte) 0 };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[-1, 0, 1, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a0a1a0" + "'", str7, "-1a0a1a0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1 0 1 0" + "'", str10, "-1 0 1 0");
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1404140");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1404140.0f) + "'", float1 == (-1404140.0f));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 56, 10);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97a100a10a0a0a102" + "'", str11, "97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100", (long) 34);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 34L + "'", long2 == 34L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 3, (long) 9, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(6L, (long) 50, (long) '4');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', 9, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97410041040404102" + "'", str9, "97410041040404102");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a52", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -141, (short) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0410.04-1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0a52.0-1a0a1a0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(" #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) ' ', (double) (byte) 0, (double) 14L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 -1 100 10 -1.0 true-1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1--1 11-1 1A-1 11-1 1A-1 1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("141-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 56.0f, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("             10410497              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("52.0a                                                    -1.", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 0, 75);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "141004-1" + "'", str7, "141004-1");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1404140#-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 22, (long) 34, 11L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10 -1.0 true-1 -1 100", (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 1-1 1-1 1-1 1-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#######", (short) -141);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -141 + "'", short2 == (short) -141);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    -1.0a52.0", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.0##########################################-1.0a0.0##########################################-1.0a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0##########################################-1.0a0.0##########################################-1.0a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0                                         ", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100a", 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 87, (long) 45, (long) 11);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 87L + "'", long3 == 87L);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a10", (float) 53);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 53.0f + "'", float2 == 53.0f);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#####-1 -1 100 10 -1.0 TRUE#####", (float) 60L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 60.0f + "'", float2 == 60.0f);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 24, (double) 102L, 1.0410497E7d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 24.0d + "'", double3 == 24.0d);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(100.0f, (float) (short) -1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("aaaa1aaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaa1aaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("01a0a0a01a001a79# a# a# a# a# a# a# a# a# a# a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 97.0f, 0.0d, 48.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("#-1-110010-1.0true-1-1100a##-1-110010-1.0true-1-1100a#");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#                                                                   # a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (-1), 100L, 14L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#1#", (double) 31);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 31.0d + "'", double2 == 31.0d);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1#1#0       0.25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0       0.25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" true-1 -1 100 a                                                                                             -1a1##", (long) 12);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 12L + "'", long2 == 12L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" a#a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', 3, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100a1" + "'", str7, "100a1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a1" + "'", str10, "100a1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 1 + "'", short12 == (short) 1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(489, 0, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 489 + "'", int3 == 489);
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a');
        java.lang.Class<?> wildcardClass9 = shortArray4.getClass();
        double[] doubleArray13 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray13, '4');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray13, 'a');
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray13);
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray13);
        java.lang.Class<?> wildcardClass20 = doubleArray13.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray21 = new java.lang.reflect.AnnotatedElement[] { wildcardClass9, wildcardClass20 };
        short[] shortArray26 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(shortArray26, '#');
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.join(shortArray26, 'a');
        java.lang.Class<?> wildcardClass31 = shortArray26.getClass();
        double[] doubleArray35 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str37 = org.apache.commons.lang3.StringUtils.join(doubleArray35, '4');
        java.lang.String str39 = org.apache.commons.lang3.StringUtils.join(doubleArray35, 'a');
        double double40 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray35);
        double double41 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray35);
        java.lang.Class<?> wildcardClass42 = doubleArray35.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray43 = new java.lang.reflect.AnnotatedElement[] { wildcardClass31, wildcardClass42 };
        short[] shortArray48 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.join(shortArray48, '#');
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join(shortArray48, 'a');
        java.lang.Class<?> wildcardClass53 = shortArray48.getClass();
        double[] doubleArray57 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join(doubleArray57, '4');
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join(doubleArray57, 'a');
        double double62 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray57);
        double double63 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray57);
        java.lang.Class<?> wildcardClass64 = doubleArray57.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray65 = new java.lang.reflect.AnnotatedElement[] { wildcardClass53, wildcardClass64 };
        short[] shortArray70 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str72 = org.apache.commons.lang3.StringUtils.join(shortArray70, '#');
        java.lang.String str74 = org.apache.commons.lang3.StringUtils.join(shortArray70, 'a');
        java.lang.Class<?> wildcardClass75 = shortArray70.getClass();
        double[] doubleArray79 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str81 = org.apache.commons.lang3.StringUtils.join(doubleArray79, '4');
        java.lang.String str83 = org.apache.commons.lang3.StringUtils.join(doubleArray79, 'a');
        double double84 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray79);
        double double85 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray79);
        java.lang.Class<?> wildcardClass86 = doubleArray79.getClass();
        java.lang.reflect.AnnotatedElement[] annotatedElementArray87 = new java.lang.reflect.AnnotatedElement[] { wildcardClass75, wildcardClass86 };
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray88 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray21, annotatedElementArray43, annotatedElementArray65, annotatedElementArray87 };
        java.lang.String str89 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray88);
        java.lang.String str90 = org.apache.commons.lang3.StringUtils.join(annotatedElementArray88);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0#1#1#10" + "'", str6, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a1a1a10" + "'", str8, "0a1a1a10");
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0410.04-1.0" + "'", str15, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0a10.0a-1.0" + "'", str17, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(annotatedElementArray21);
        org.junit.Assert.assertNotNull(shortArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray26), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "0#1#1#10" + "'", str28, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0a1a1a10" + "'", str30, "0a1a1a10");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "100.0410.04-1.0" + "'", str37, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "100.0a10.0a-1.0" + "'", str39, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 100.0d + "'", double40 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(annotatedElementArray43);
        org.junit.Assert.assertNotNull(shortArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray48), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0#1#1#10" + "'", str50, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0a1a1a10" + "'", str52, "0a1a1a10");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "100.0410.04-1.0" + "'", str59, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "100.0a10.0a-1.0" + "'", str61, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 100.0d + "'", double62 == 100.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(annotatedElementArray65);
        org.junit.Assert.assertNotNull(shortArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray70), "[0, 1, 1, 10]");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "0#1#1#10" + "'", str72, "0#1#1#10");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "0a1a1a10" + "'", str74, "0a1a1a10");
        org.junit.Assert.assertNotNull(wildcardClass75);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "100.0410.04-1.0" + "'", str81, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "100.0a10.0a-1.0" + "'", str83, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 100.0d + "'", double84 == 100.0d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + (-1.0d) + "'", double85 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass86);
        org.junit.Assert.assertNotNull(annotatedElementArray87);
        org.junit.Assert.assertNotNull(annotatedElementArray88);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 102, (float) 188L, 111.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 188.0f + "'", float3 == 188.0f);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0 10 0 1 10 10 0 1 10 10 0 1 .0a52.", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "0.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010-1.0A52.00.0 # # # # # # # # # #97100100010");
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass13 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" HI!10.0a10.0a102.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(87L, (long) 45, (long) 28);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 87L + "'", long3 == 87L);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0.0" + "'", str3, "0.0");
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 60L, (float) '4', 110.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 110.0f + "'", float3 == 110.0f);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', 87, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 87");
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(408L, (long) '4', 17L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 408L + "'", long3 == 408L);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 110, (float) 87, (float) 28);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 28.0f + "'", float3 == 28.0f);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 1, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10041" + "'", str4, "10041");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 1 + "'", short5 == (short) 1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) (byte) 100, 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', 13, 13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1.0a52.0" + "'", str9, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" a#a ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 65, (int) (short) 0);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (byte) -1, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1.0#52.0" + "'", str11, "-1.0#52.0");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) 'a', 35, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-110#1#100#0#1010041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#1#100#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -141, (long) 197, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 197L + "'", long3 == 197L);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) 'a', (int) (byte) 10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', (int) (byte) 0, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1#1" + "'", str15, "-1#1");
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) -141, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -141 + "'", short3 == (short) -141);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a', 65, 48);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(65, 0, 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 111 + "'", int3 == 111);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, 14.0d, (double) 101);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-110#1#100#0#1010041");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0 10 0 1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#######00.04#0.04##.0#########################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("# ## ## ## ## ## ## ## ## ## #97##00##0#0#0##02", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 60, (double) 55, (double) 65);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 55.0d + "'", double3 == 55.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 34L, (double) 34L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n1 100 -1", 48.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 48.0f + "'", float2 == 48.0f);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                        2");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                         2");
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 31, (float) 52, (float) 50);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) -141, 10, (int) (short) -141);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray4);
        short short17 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray4, 'a', 9, 197);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9");
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
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 10 + "'", short15 == (short) 10);
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 10 + "'", short16 == (short) 10);
        org.junit.Assert.assertTrue("'" + short17 + "' != '" + (short) 0 + "'", short17 == (short) 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 10, (double) 111.0f, (double) 9.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #4#a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaa", 12);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0a10.0a-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(133, (int) ' ', 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 133 + "'", int3 == 133);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaa1aaaa", 110);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 110 + "'", int2 == 110);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 1.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(52L, (long) 60, (long) 18);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 18L + "'", long3 == 18L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) 408, (double) 14);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 408.0d + "'", double3 == 408.0d);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0 10.0 -1.0100.0 10.0 -1.010", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) (byte) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "10a5210a5297");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10a5210a5297");
        } catch (java.io.UnsupportedEncodingException e) {
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(60.0d, (double) 75, 32.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("A4#4A", (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("class [Ljava.lang.String;class [Ljava.lang.String;class java.math.BigIntegerclass [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(185.0f, 0.0f, (float) 5);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 100.0f + "'", number1, 100.0f);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" HI!");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a-1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("444444444444# #...4444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(6, 30, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 56L, 24.0d, 55.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 56.0d + "'", double3 == 56.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -141, (short) -1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 53, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#########################################", 53);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 100 -1" + "'", str6, "1 100 -1");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" #A #A #A #A #A #A #A #A #A #444444444444444444444444444444444444444444444444444444444444-1.0a52.0", (long) 41);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 41L + "'", long2 == 41L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100.0 10.0 -1.0100.0 10.0 -1.010");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10041.0f, (double) 48, (double) 10041);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0 # # # # # # # # # #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("# A# A# A# A# A# A# A# A# A# ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa# AA #A #A #A #A #A #A #A #A #A #a-1-110010-1.0true-1-1100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 8, (float) 4141410L, (float) 56);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 4141410.0f + "'", float3 == 4141410.0f);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(35, 110, 54);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray2, ' ', (int) 'a', 41);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 52.0d + "'", double8 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("001 1- 1-EURT 0.1- 01 ", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        float[] floatArray3 = new float[] { 10, (short) 10, 102L };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a');
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray3, 'a', 0, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[10.0, 10.0, 102.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10.0a10.0a102.0" + "'", str5, "10.0a10.0a102.0");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 10.0f + "'", float6 == 10.0f);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 110L, (float) 124);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 124.0f + "'", float3 == 124.0f);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("001 1- 1-EURT 0.1- 01 ##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        int int8 = org.apache.commons.lang3.math.NumberUtils.min(intArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray2, '4', (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a', 6, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("# AA #A #A #A #A #A #A #A #A #A #a", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("A A A A ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                4#4a                                                ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) (short) 100, (long) 14);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 0, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 -1-1 -1AAAAAAAAAAAAAAAAAAA...", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) -1, (byte) 100, (byte) 0 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aa#aa#aa#aa#aa#aa#aa#aa#aa#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aa#aa#aa#aa#aa#aa#aa#aa#aa#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, -1, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) -1 + "'", byte6 == (byte) -1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 104, (long) ' ', 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 104L + "'", long3 == 104L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ');
        int int9 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1 1" + "'", str8, "-1 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#a #a #a #");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10 10 97");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("141004-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"141004-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0 10.0 -1.0# AA #A #A #A #A #A #A #A #A #A #", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("         10a-1         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        double[] doubleArray4 = new double[] { 35L, 23, 'a', 52.0d };
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray4, 'a', (int) (byte) 0, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" true-1 -1 100 a                                                                                             -1a1##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("class [Ljava.lang.String;class [Bclass [Jclass [F");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"class [Ljava.lang.String;class [Bclass [Jclass [F\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) '4', 110);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
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
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 72, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 72.0d + "'", double3 == 72.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 true-1 -1 100 4                                                                                             -14");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(23, 13, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HHHH!IH1-IH!IH1-IH!IH1-IH!IH1-IH!IH1-IHHHH!!!!!!!!!!!!!!!!!!!!IH!IH1-!!!!!!!!!!!!!!!!!!!II11-1-eurtIH1-I1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100A100A100A10A1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("# a# a# a# a# a# a# a# a# aa# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a# a", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0 10.0 -1.0                                                                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0 10.0 -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, (long) 31, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 31L + "'", long3 == 31L);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a # a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "                                     100a100a100a10a1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                      100a100a100a10a1");
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
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 true", (long) 54);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 54L + "'", long2 == 54L);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("44a4a4a44444a52444444a52444444a52444444a52444444a52444444a52444440a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a1a100a0a10", (long) 124);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 124L + "'", long2 == 124L);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10a10a97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a10a97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 12L, (float) 25, 56.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 12.0f + "'", float3 == 12.0f);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0 0.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 156, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 10 + "'", short1 == (short) 10);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#a #a #a #", (float) 489);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 489.0f + "'", float2 == 489.0f);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 28, 15.0d, (double) 133);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 15.0d + "'", double3 == 15.0d);
    }
}

