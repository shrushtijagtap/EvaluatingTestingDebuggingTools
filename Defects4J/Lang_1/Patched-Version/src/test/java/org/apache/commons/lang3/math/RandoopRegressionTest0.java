package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0001");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.min(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0002");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0003");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 0, (long) '4', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0004");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', (int) (byte) 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0005");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(" ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0006");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0007");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1.0f), (double) 10L, (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0008");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E51d + "'", double2 == 4.4444444444444445E51d);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0009");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 -1 100 10 -1.0 true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0011");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0013");
        float[] floatArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float1 = org.apache.commons.lang3.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0014");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.min(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0015");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0016");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("\n", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0017");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0018");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0020");
        int[] intArray4 = new int[] { (-1), (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray4, 'a');
        int int7 = org.apache.commons.lang3.math.NumberUtils.min(intArray4);
        java.lang.Object[] objArray8 = new java.lang.Object[] { "100.0410.04-1.0", (byte) -1, int7 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(objArray8, '4', (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1a1" + "'", str6, "-1a1");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[100.0410.04-1.0, -1, -1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[100.0410.04-1.0, -1, -1]");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0021");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, (double) 100L, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0022");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0023");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100, 100.0d, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0024");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(100L, 0L, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0025");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) -1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0026");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0027");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0028");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0029");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0030");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0031");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0032");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10041", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0033");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0034");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0035");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', (long) 'a', (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0037");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("HI!", (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0038");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1", (float) '4');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0039");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0040");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0410.04-1.0", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0041");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0042");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0043");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0044");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1 -1 100 10 -1.0 true-1 -1 100 ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("100.0410.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0410.04-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0046");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 1, (-1.0f), (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0047");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "\r");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ?");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("\r");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0050");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0051");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0052");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) 1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hi!-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!-1 -1 100 10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0054");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0410.04-1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0056");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1a1");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0057");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("# a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0058");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) ' ', 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0059");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#1#100#0#10", 97L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0060");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0061");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0062");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, (int) '4', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0063");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0064");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1, 3, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0065");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0066");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!-1 -1 100 10 -1.0 true-1 -1 100 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0067");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0068");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("9752.01021");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 -1 100 10 -1.0 true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0070");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" HI!", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0071");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10410497", (float) 52);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0410497E7f + "'", float2 == 1.0410497E7f);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0072");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) '#', (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0073");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) '#', (double) (short) 0, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0074");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.max(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0075");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("\r");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0076");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                    ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0077");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("hi!");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0078");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("####################################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0079");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', (int) (byte) 10, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0080");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0081");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((-1.0d), (-1.0d), (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a4#4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: a4#4a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0083");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10041", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0084");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("A #A #A #A #A #A #A #A #A #A #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"A #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0086");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 56, (long) (short) 0, (long) 97);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1 -1 100 10 -1.0 true-1 -1 100 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100 \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0088");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a #a #a #a #a #a #a #a #a #", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0089");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) -1, (double) 'a', (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0091");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0093");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, (float) (-1), (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0094");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 100, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0096");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0097");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.0410497E7f, (double) (short) 0, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0410497E7d + "'", double3 == 1.0410497E7d);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0098");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0099");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a1", 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0100");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(4.4444444444444445E51d, (double) (byte) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0101");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("04141410", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0102");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1 -1 100 10 -1.0 true");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0104");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1, (double) (-1L), (double) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0106");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0107");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("4444444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass2 = bigInteger1.getClass();
        org.junit.Assert.assertNotNull(bigInteger1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0108");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.Class<?> wildcardClass10 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 102L + "'", long8 == 102L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0109");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0110");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                             -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0111");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0112");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 0, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0113");
        org.apache.commons.lang3.math.NumberUtils numberUtils0 = new org.apache.commons.lang3.math.NumberUtils();
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0114");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0115");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0116");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("#-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0118");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 2, (long) (byte) 10, (long) 2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 2L + "'", long3 == 2L);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0119");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" HI!");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0120");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0122");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0123");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) (short) 0, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0124");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10#1#100#0#1010041");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0125");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("# aa #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0126");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0127");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', 0.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("# aa #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aa \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0129");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 4, (float) 97L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 97.0f + "'", float3 == 97.0f);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0130");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 12, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0131");
        long[] longArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long1 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0132");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0133");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0134");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0a10.0a-1.0", (float) 56);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 56.0f + "'", float2 == 56.0f);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0135");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 100, (long) (-1), (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0136");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0##00#0#0004");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0137");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#-1 -1 100 10 -1.0 true-1 -1 100 a", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0138");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), 102L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 102L + "'", long3 == 102L);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0139");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", 52L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 52L + "'", long2 == 52L);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0140");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A #A #A #A #A #A #A #A #A #A #0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0141");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (byte) 100, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0142");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, (long) 4, 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0144");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0145");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0146");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0147");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0148");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0149");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 10, 102L, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 102L + "'", long3 == 102L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0150");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 4.4444444444444445E51d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 4.4444444444444445E51d + "'", double2 == 4.4444444444444445E51d);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0151");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(52L, (long) ' ', (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0152");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 100, 0.0d, (double) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0153");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("HI!", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0154");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.Class<?> wildcardClass5 = floatArray2.getClass();
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.0f + "'", float4 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0155");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0156");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1a0a1a0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0157");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(102, 10041, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("9752.0102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"9752.0102\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0159");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0160");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10041, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10041 + "'", int3 == 10041);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0161");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1a1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0163");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 0L, (float) 52L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 -1-1 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1-1 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0165");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0166");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0167");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 102L, (float) 1L, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0168");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0169");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("10041");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0170");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("\n", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0171");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(1L, (long) 56, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 56L + "'", long3 == 56L);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0172");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '#', (int) (short) 0, 56);
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
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0173");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0174");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0175");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("A #A #A #A #A #A #A #A #A #A #0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0177");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                                            -1a1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a1a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0179");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                            -1A1A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0180");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97410041040404102", (double) 52.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.7410041040404096E16d + "'", double2 == 9.7410041040404096E16d);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0181");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0182");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0183");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0184");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0##########################################-1.0a52.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0185");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 22, 0.0f, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 22.0f + "'", float3 == 22.0f);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100.0410.04-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0410.04-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0187");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, '4', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-1.0a52.0" + "'", str5, "-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0188");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                    -1.0a52.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0189");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0190");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("class [Ljava.laa4#4ava.lang.String;");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0191");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            byte byte1 = org.apache.commons.lang3.math.NumberUtils.max(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0192");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0                                         ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0193");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1 -1-1 -1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1 -1-1 -1");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0194");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 22, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0195");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 100, (-1.0d), (double) 3);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0196");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0197");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 2, (long) 10, (long) 'a');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0199");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1a100a0a10" + "'", str12, "10a1a100a0a10");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0200");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(52.0f, (float) 0, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                    -1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0202");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), (float) 14, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0203");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#-1 -1 100 10 -1.0 true-1 -1 100", (long) ' ');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0204");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10a10a97", (long) 10041);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10041L + "'", long2 == 10041L);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0205");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 0, (float) 52, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0207");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0208");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0209");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0210");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0211");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a1a");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0212");
        short[] shortArray4 = new short[] { (short) 0, (byte) 1, (short) 1, (short) 10 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray4, '#', 0, 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray4, ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray4, '4', 97, 408);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0214");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0215");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0410.04-1.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0216");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0217");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 1, (double) 10, (double) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0218");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("####################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0220");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10041, (long) 17, (long) 102);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 17L + "'", long3 == 17L);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0221");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.min(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("          .0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1a0a1a0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1a0a1a0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0224");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0225");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0227");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("9752.01021");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 9752.01f + "'", float1 == 9752.01f);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0228");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10a10a97", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0229");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#####-1 -1 100 10 -1.0 true#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0230");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0231");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a #a #a #a #a #a #a #a #a #a #97a100a10a0a0a102", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0232");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1 -1 100 10 -1.0 true-1 -1 100 a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0233");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0, (double) 0L, (double) 17);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 17.0d + "'", double3 == 17.0d);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0235");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(22.0f, (float) '4', 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0236");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.Class<?> wildcardClass5 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0237");
        double[] doubleArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double1 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0238");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(3, 0, 408);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0239");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 1, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0240");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 11, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0241");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#1#1#10", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0242");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("##");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0243");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0244");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0245");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1a0a1a0", "");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) -1 };
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        java.lang.Class<?> wildcardClass9 = byteArray6.getClass();
        long[] longArray16 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray16);
        long long18 = org.apache.commons.lang3.math.NumberUtils.max(longArray16);
        long long19 = org.apache.commons.lang3.math.NumberUtils.min(longArray16);
        java.lang.Class<?> wildcardClass20 = longArray16.getClass();
        float[] floatArray23 = new float[] { 0L, 0 };
        float float24 = org.apache.commons.lang3.math.NumberUtils.max(floatArray23);
        float float25 = org.apache.commons.lang3.math.NumberUtils.max(floatArray23);
        java.lang.Class<?> wildcardClass26 = floatArray23.getClass();
        java.lang.reflect.Type[] typeArray27 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass9, wildcardClass20, wildcardClass26 };
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join(typeArray27);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(longArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray16), "[97, 100, 10, 0, 0, 102]");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 102L + "'", long18 == 102L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(floatArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray23), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float24 + "' != '" + 0.0f + "'", float24 == 0.0f);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "class [Ljava.lang.String;class [Bclass [Jclass [F" + "'", str28, "class [Ljava.lang.String;class [Bclass [Jclass [F");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0246");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) 22, (long) 48);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 48L + "'", long3 == 48L);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0247");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("class [Ljava.laa4#4ava.lang.String;", 35.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 35.0d + "'", double2 == 35.0d);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0248");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A                                                                                             -1A1", (double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0249");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1.0410497E7f, (double) 1.0f, (double) 48L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0251");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0a52.0", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0252");
        float[] floatArray2 = new float[] { 0L, 0 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', (int) (short) 100, (int) (byte) -1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 0.0f + "'", float8 == 0.0f);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0253");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(14.0f, (float) 100L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 14.0f + "'", float3 == 14.0f);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0254");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0255");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aa#aa", (float) 9);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 9.0f + "'", float2 == 9.0f);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 100 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0257");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ", 102);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 102 + "'", int2 == 102);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0258");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a #a #a #a #a #a #a #a #a #", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0259");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("####################################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0260");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0261");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A52.0", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0263");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a52.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0264");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10#1#100#0#10", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0265");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                            -1a1a", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0266");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 34, (double) 22, (double) (short) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 34.0d + "'", double3 == 34.0d);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: HI! is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0268");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 100, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0269");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1 -1 100 10 -1.0 TRUE-1 -1 100 A#", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0270");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0271");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0272");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1 100 -1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0273");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(41, 56, 56);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0274");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                    -1.0a52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                    -1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0276");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a52");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0277");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0278");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10#1#100#0#10" + "'", str9, "10#1#100#0#10");
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0279");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 -1 100 10 -1.0 true-1 -1 100 hi!-1 -1 100 10 -1.0 true-1 -1 100HI!", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0280");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("9752.0102", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0281");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, 100L, (long) 13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0282");
        short[] shortArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            short short1 = org.apache.commons.lang3.math.NumberUtils.max(shortArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0283");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1 -1 100 10 -1.0 true-1 -1 100 a                                                                                             -1a1##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0285");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1 -1 100 10 -1.0 TRUE-1 -1 100 HI!-1 -1 100 10 -1.0 TRUE-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 TRUE-1 -1 100 HI!-1 -1 100 10 -1.0 TRUE-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0286");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0410497E7d, (double) 12, (double) 22);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0287");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                    ", 10041L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10041L + "'", long2 == 10041L);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0288");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10041, (double) 41, (double) 12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0289");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a###a");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0290");
        int[] intArray1 = new int[] { 2 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(intArray1, '4', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[2]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0291");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(8, 2, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0292");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("97a100a10a0a0a102");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0293");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 41, (long) 1, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 41L + "'", long3 == 41L);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0294");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0 10.0 -1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0295");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 1", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0296");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (-1), 102L, (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(" HI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" HI!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0298");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#1#1", (long) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0299");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0300");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0#1#1#0#1#1#", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0301");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0302");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #a #aa #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0303");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) 408);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 408L + "'", long3 == 408L);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0304");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 8, 52.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 52.0f + "'", float3 == 52.0f);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0305");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("hi!-1 -1 100 10 -1.0 true-1 -");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0306");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0307");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 14L, 10.0f, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0309");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0310");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 9.0f, (double) (byte) 10);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0311");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("          .0a52.0          .0a52.0          .0a52.0          .0a52.0          .0a52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0312");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0313");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1 -1 100 10 -1.0 true-1 -1 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0314");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("# aa #a #a #a #a #a #a #a #a #a #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" aa #a #a #a #a #a #a #a #a #a #\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0316");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 4, (double) (byte) 1, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0317");
        double[] doubleArray4 = new double[] { (-1), 100, 1, (-1) };
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray4, '#', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 1.0, -1.0]");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0318");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(22.0f, 1.0f, (float) 2L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0319");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 11, 100L, (long) 32);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0320");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 54, 0.0d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0321");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0322");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1 100 -1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 100 -1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0324");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(5, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0325");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0326");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10#1#100#0#10hi!-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0327");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("##", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("0 1 1 10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0 1 1 10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0329");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) ' ', (double) 56L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0330");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100.0410.04-1.0                                         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0331");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa", (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + (-1.0f) + "'", float2 == (-1.0f));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0332");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0333");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1", (float) 408L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 408.0f + "'", float2 == 408.0f);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0334");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1 ", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0335");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) 0, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0336");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("52.0a                                                    -1.0", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0337");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 41, (float) 2L, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0338");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#########");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"########\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0339");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 17, 9752.01f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0340");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("04141410", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4141410L + "'", long2 == 4141410L);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0341");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) 35);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0342");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 65, (float) 102, (float) 12);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 102.0f + "'", float3 == 102.0f);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0343");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 25, (long) (byte) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0344");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 17L, (float) 197, (float) 10041);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0345");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                            -1a1a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0346");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int1 = org.apache.commons.lang3.math.NumberUtils.max(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Array must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0347");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0348");
        long[] longArray6 = new long[] { 34, 34, 56, 14, 52, 97 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 25, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[34, 34, 56, 14, 52, 97]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14L + "'", long7 == 14L);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0349");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0350");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0351");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  44444444", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0353");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ", (double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0354");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0355");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("04141410");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0356");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0357");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.25a0.1-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0358");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0359");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n#-1 -1 100 10 -1.0 true-1 -1 100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("52.0a                                                    -1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52.0a                                                    -1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0361");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 34.0d, (double) 54);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0362");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 1-1 1-1 1-1 1-1 1-10.0a0.0-1 1-1 1-1 1-1 1-1 1-1 ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0363");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1 -1 1--1 11-1 1A-1 11-1 1A-1 1", (long) 102);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 102L + "'", long2 == 102L);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0364");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0          ...", 48L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 48L + "'", long2 == 48L);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0365");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0366");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 188, (float) ' ', (float) 35);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0367");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0368");
        double[] doubleArray3 = new double[] { 100L, 10.0f, (-1.0f) };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[100.0, 10.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100.0410.04-1.0" + "'", str5, "100.0410.04-1.0");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a10.0a-1.0" + "'", str7, "100.0a10.0a-1.0");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0369");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, 1.0d, (double) 10L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0370");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("          .0 52.0          .0 52.0          .0 52.0          .0 52.0          .0 52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0##########################################-1.0a52.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0##########################################-1.0a52.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0372");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1-1 100 10 -1.0 true-1 -1 100 a#", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0373");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10 10 97", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0374");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0375");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#########");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0376");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(100, 41, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa################################## 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0378");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0379");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 10, 35, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0380");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, 11L, (long) 13);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 11L + "'", long3 == 11L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#-1 -1 100 10 -1.0 true-1 -1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0382");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, (-1.0f), (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0383");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 100, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0384");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0 10.0", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0385");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) '4', (float) 31);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0386");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 53, (double) 13, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0387");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 -1 100 10 -1.0 true", 52.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 52.0f + "'", float2 == 52.0f);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: empty String");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0389");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                            -1A1A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0390");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 110, 1.0410497E7d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0391");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 56, (float) 10041, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0392");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(102, 8, 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0393");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi!-1 -1 100 10 -1.0 true-1 -1 100", (float) 110);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 110.0f + "'", float2 == 110.0f);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0394");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10a-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10a-1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length string");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0397");
        float[] floatArray1 = new float[] { (byte) 0 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', (int) (short) 10, (int) (short) 10);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 2, 65);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0398");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10 -1.0 true-1 -1 100", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0399");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10.0a10.0a102.0", 4141410L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 4141410L + "'", long2 == 4141410L);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0400");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0401");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(" #a #a #a #a #a #a #a #a #a #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0402");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a4#4a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0403");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                # aa #a #a #a #a #a #a #a #a #a #                                ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                 # aa #a #a #a #a #a #a #a #a #a #                                ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1 100 -1" + "'", str6, "1 100 -1");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0404");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 97, 65);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
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
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 100 + "'", byte17 == (byte) 100);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0405");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("001 1- 1-eurt 0.1- 01 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0406");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0407");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-10a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0408");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, (long) 25, (long) 25);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0409");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!-1 -1 100 10 -1.0 true-1 -1 100", (double) 56L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 56.0d + "'", double2 == 56.0d);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0410");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 197, (double) 0, (double) 12);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 197.0d + "'", double3 == 197.0d);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0411");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0", (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0412");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" a #a #a #a #a #a #a #a #a #a # ", 32L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 32L + "'", long2 == 32L);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0413");
        long[] longArray6 = new long[] { 97L, 100L, (byte) 10, 0, (short) 0, 102 };
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0414");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(10, (int) (byte) -1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0a1a1a10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1a1a10\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0416");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0 # # # # # # # # # #97100100010", (float) 35L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0417");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 3, (float) (-1L), 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0418");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0 # # # # # # # # # #97100100010");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0419");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0420");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 9, (double) 1.0410497E7f, (double) 56);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 9.0d + "'", double3 == 9.0d);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0421");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 97, (long) 97, (long) 188);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0422");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0423");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(22, 54, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0424");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0                                         ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0425");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0426");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0                                         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + (-1.0f) + "'", float1 == (-1.0f));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0427");
        int[] intArray2 = new int[] { (-1), (byte) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray2, '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1a1" + "'", str4, "-1a1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1a1" + "'", str7, "-1a1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1#1" + "'", str9, "-1#1");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0428");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, (float) 9, (float) 197);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 9.0f + "'", float3 == 9.0f);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#-1 -1 100 10 -1.0 true-1 -1 100 a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10410497-1a1a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10410497-1a1a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0431");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0432");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0433");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0434");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), 0.0f, (float) 17);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 17.0f + "'", float3 == 17.0f);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0435");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, (float) 45, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0436");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".0a52.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0437");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0438");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1 -1 100 10 -1.0 TRUE-1 -1 100 HI!-1 -1 100 10 -1.0 TRUE-1 -1 100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0439");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("# AA #A #A #A #A #A #A #A #A #A #a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" AA #A #A #A #A #A #A #A #A #A #a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0440");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 48, (double) 2);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0441");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0 0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0442");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 1, (double) 48, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 48.0d + "'", double3 == 48.0d);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0443");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####################################################");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaa                                                    -1.0a52.0aaaaaaaaaaaaaaaaaaaa");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray11, strArray13);
        double[] doubleArray17 = new double[] { (-1), '4' };
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray17);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray17, 'a');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(doubleArray17, 'a', 65, (int) (short) 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray17, '#');
        short[] shortArray31 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(shortArray31, '4');
        short short34 = org.apache.commons.lang3.math.NumberUtils.min(shortArray31);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.join(shortArray31, 'a');
        short short37 = org.apache.commons.lang3.math.NumberUtils.min(shortArray31);
        java.lang.Object[] objArray38 = new java.lang.Object[] { byteArray5, strArray13, '#', 110.0f, "true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", shortArray31 };
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join(objArray38, 'a');
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 0 + "'", byte7 == (byte) 0);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 52.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1.0a52.0" + "'", str20, "-1.0a52.0");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1.0#52.0" + "'", str26, "-1.0#52.0");
        org.junit.Assert.assertNotNull(shortArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray31), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "10041" + "'", str33, "10041");
        org.junit.Assert.assertTrue("'" + short34 + "' != '" + (short) 1 + "'", short34 == (short) 1);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "100a1" + "'", str36, "100a1");
        org.junit.Assert.assertTrue("'" + short37 + "' != '" + (short) 1 + "'", short37 == (short) 1);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[[10, 1, 100, 0, 10], [aaaaaaaaaaaaaaaaaaa,                                                     , -, 1, ., 0, a, 52, ., 0, aaaaaaaaaaaaaaaaaaaa], #, 110.0, true-1 -1 100 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa, [100, 1]]");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0444");
        long[] longArray5 = new long[] { (short) 100, 100L, 100, 10L, (short) 1 };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray5, '4', 10, (-1));
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray5, 'a');
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray5);
        java.lang.Class<?> wildcardClass14 = longArray5.getClass();
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[100, 100, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100a100a100a10a1" + "'", str11, "100a100a100a10a1");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0445");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("#########################################-1.0a52\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#########################################-1.0a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0446");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray3, ".0a52.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .0a52.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0447");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 52, (float) 3, (float) 2560);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0f + "'", float3 == 3.0f);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0          ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0449");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(54, 110, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 110 + "'", int3 == 110);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0450");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0451");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4#4a");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                   97a100a10a0a0a102");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                   97a100a10a0a0a102\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0453");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1098504, 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1098504 + "'", int3 == 1098504);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0454");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(" 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100 10 -1.0 true-1 -1 100#-1 -1 100 10 -1.0 true-1 -1 100", (double) 48L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 48.0d + "'", double2 == 48.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0455");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0##########################################-1.0a52.0", (long) 6);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 6L + "'", long2 == 6L);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0456");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0 10.0 -1.0# AA #A #A #A #A #A #A #A #A #A #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0457");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 188, (long) 48, (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 188L + "'", long3 == 188L);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0458");
        double[] doubleArray2 = new double[] { (-1), '4' };
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double6 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double7 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray2, 'a', 8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
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
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0459");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0a52.0 .0a52.0 .0a52.0 .0a52.0 .0a52.0 0#1#1", (double) 102.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 102.0d + "'", double2 == 102.0d);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0460");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, (double) (byte) 0, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0461");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("          .0A52.0          .0A52.0          .0A52.0          .0A52.0          .0A52.0       0#1#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0462");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("97410041040404102", (double) 10L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 9.7410041040404096E16d + "'", double2 == 9.7410041040404096E16d);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0463");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10041aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0464");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 2L, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 2.0f + "'", float3 == 2.0f);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0465");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0466");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0##00#0#0004", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0467");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a52", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0468");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 100, (byte) 0, (byte) 10 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray5, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 0.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 100, 0, 10]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10#1#100#0#10" + "'", str8, "10#1#100#0#10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10 1 100 0 10" + "'", str10, "10 1 100 0 10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0469");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("52.0a                                                    -1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: A blank string is not a valid number");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("hi!-1 -1 100 10 -1.0 true-1 -");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!-1 -1 100 10 -1.0 true-1 -\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0472");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0473");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(32, 197, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1#1#0       0.25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#1#0       0.25a0.          0.25a0.          0.25a0.          0.25a0.          0.25a0.          \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                              -1.0a52.0aaaaaaaaaaaaaaaaaaaa                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                              -1.0a52.0aaaaaaaaaaaaaaaaaaaa                           \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0477");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(34.0d, 12.0d, 9.7410041040404096E16d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 12.0d + "'", double3 == 12.0d);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0478");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a0a1a0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0a52.0-1.0", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0479");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0480");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0481");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(32L, 32L, (long) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0482");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:           .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0A          .0a52.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) -1 + "'", byte4 == (byte) -1);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0483");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10041L, (float) 100L, (float) 6);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 6.0f + "'", float3 == 6.0f);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0484");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 10, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0485");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) (byte) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0486");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("1a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a9710a10a97");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0487");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1 -1 100 10 -1.0 true-1 -1 100 ", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0488");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(14, (int) (short) 10, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0489");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "10a10a97");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10a10a97");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10a-1" + "'", str5, "10a-1");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0490");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 408L, (float) 56, (float) 15);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 15.0f + "'", float3 == 15.0f);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0492");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0493");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(2, 102, 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 188 + "'", int3 == 188);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0494");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1004100410041041", 65);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0495");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                    -1a1aaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0496");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             -1a1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0497");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1 100 -1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0498");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0499");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1 -1 100 10 -1.0 true-1 -1 100 0.0##########################################-1.0a52.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest0.test0500");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }
}

