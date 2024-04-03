package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06001");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32A0A52", (long) 101);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 101L + "'", long2 == 101L);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06002");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                        321041104");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0410.0a100.0a1.0a-1.0a1.0a100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0410.0a100.0a1.0a-1.0a1.0a100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06004");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 0, 321041104L, (long) 101);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 321041104L + "'", long3 == 321041104L);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06005");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("11 0 0 0.1 0 0 001 0 0 0a1 0 0 011 0 0 0.1 0 0 001 0 0 0a1 0 0 0-1 0 0 011 0 0 0.1 0 0 00", 361.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 361.0d + "'", double2 == 361.0d);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06006");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) -1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06007");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(368, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 368 + "'", int3 == 368);
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06008");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(380L, (long) 1001, (long) 105);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 105L + "'", long3 == 105L);
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06009");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 100, (float) (short) -1, (float) 332);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06010");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06011");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("32-1.0#32.0#100.0#-1.#######################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 32-1.0#32.0#100.0#-1.####################################################################### is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06012");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0A-1.0A-1.0A32.0A100.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0A-1.0A-1.0A32.0A100.0A-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06013");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 92, (float) 1001, 127.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1001.0f + "'", float3 == 1001.0f);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06014");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 1, (short) 10, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06015");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06016");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1041#1 1 0 97#1041#1 132101523212-12-1-001-0132                           1041#1 1 0 97#1041#1 1 ", (float) 222L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 222.0f + "'", float2 == 222.0f);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06017");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06018");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06019");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                    .04.04.04404.0100.0#1.0#10.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06020");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                                                                                                         -1.0#-1.0#-1.0#32.0#100.0#-1.0                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06021");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06022");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06023");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a000000000000000000000000000000000000000000000000000000000000000000000000", (long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06024");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(910, 483, 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 910 + "'", int3 == 910);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06025");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 198, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#1" + "'", str10, "10#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1" + "'", str12, "10a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06026");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06027");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 380, 137);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 10 + "'", byte15 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 10 + "'", byte16 == (byte) 10);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06028");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06029");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 361, (long) 332, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 361L + "'", long3 == 361L);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06030");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("97.04100.043.21041101E9435.0", 137L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06031");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Sign character in wrong position");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06032");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1001, 483, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1001 + "'", int3 == 1001);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06033");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                             32a0a#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06034");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!0044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06035");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("52 97 100", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06036");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06037");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        // The following exception was thrown during execution in test generation
        try {
            float float3 = org.apache.commons.lang3.math.NumberUtils.max(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06038");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06039");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0A32.0A100.0A-1.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06040");
        float[] floatArray6 = new float[] { (byte) 0, 'a', 10, 507, 507L, 1001 };
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[0.0, 97.0, 10.0, 507.0, 507.0, 1001.0]");
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1001.0f + "'", float7 == 1001.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0 97.0 10.0 507.0 507.0 1001.0" + "'", str9, "0.0 97.0 10.0 507.0 507.0 1001.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06041");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber(".0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06042");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 483, 321041104L, (long) 383);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 383L + "'", long3 == 383L);
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06043");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06044");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 93, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 93.0f + "'", float3 == 93.0f);
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06045");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(3.21041104E8d, 0.0d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06046");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06047");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, (int) (short) 0, 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 342 + "'", int3 == 342);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06048");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 195, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06049");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0a1.0a10.0a0.################################", (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06050");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0#1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.##                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.##                                                                          \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06052");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 100, 0.0d, (double) 198.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06053");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06054");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) -1, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06055");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06056");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06057");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 127, (float) (byte) 100, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06058");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 483, (float) 507, (float) 101L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06059");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 105, 844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 105");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06060");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 361L, 0.0d, (double) 383);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 383.0d + "'", double3 == 383.0d);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06061");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', 1L, 195L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 195L + "'", long3 == 195L);
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06062");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("...0a1a100");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06063");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#-1.0", (double) 105L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 105.0d + "'", double2 == 105.0d);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06064");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06065");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("10#10#-1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06066");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 105L, (float) (byte) 1, 1001.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1001.0f + "'", float3 == 1001.0f);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06067");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".a.a-.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06068");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("     a a ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06069");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(222L, (long) 10, 3210411041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06070");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) ' ', 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1041" + "'", str9, "1041");
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06071");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 289, (long) 844);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06072");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 0, 222);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "0" + "'", str5, "0");
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06073");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06074");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                             0.#-1.0#0                                              ", (short) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06075");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1A32A0A52A10A10", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06076");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (byte) 10, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) (byte) 100, 0);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 289, 93);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 383, 192);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("10014#4# #a#a#a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10014#4# #a#a#a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("      a a a-1.0#-1.0#aaa11097-1.0#-1.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      a a a-1.0#-1.0#aaa11097-1.0#-1.0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06079");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1001.0f, 361.0d, (double) 7925.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 7925.0d + "'", double3 == 7925.0d);
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06080");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1001.0f, 101.0f, 10.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06081");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (byte) 10, (double) (short) 100, (double) 222);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 222.0d + "'", double3 == 222.0d);
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06082");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 383, 0.0d, (double) 196);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06083");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(" -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06084");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("444-1.0#-1", 383);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 383 + "'", int2 == 383);
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06085");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("hi!00");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06086");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 332, 332);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06087");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 507L, 483.0d, (double) '#');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 507.0d + "'", double3 == 507.0d);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06088");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 32, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("14 4   a a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"14 4   a a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06090");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', 368, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06091");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 321041104L, (float) 10, (float) 844);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06092");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                ", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06093");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a10010a1a10a1a100101 1 0 97", 342);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 342 + "'", int2 == 342);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06094");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06095");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 101, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("32#0#5                                                                                                                                                              10#132#0#5                                                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32#0#5                                                                                                                                                              10#132#0#5                                                                                                                                                              \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06097");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".#-1.0#0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06098");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.Class<?> wildcardClass6 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06099");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 80, 332);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 80");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06100");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10014#4# #a#a#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06101");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1-#0.1-444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06102");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06104");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, ' ', 0, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06105");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(380, 196, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06106");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(" -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                    .04.04.04404.0100.0#1.0#10.0#0.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06107");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', (int) (byte) 100, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str12, "0.0 100.0 1.0 -1.0 1.0 100.0");
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06108");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', 910, 195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 910 + "'", int3 == 910);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06109");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1444-1.0#-1.0#-1.0#32.0#100.0#-1                    .0#.0#.0##0#.0#-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1", (double) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06110");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("################################################################################################################################################################################################################################################################################################################-1-##--1-##1-#2#1-##1-##--1-");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06111");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("25 0 23", (float) 195L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 195.0f + "'", float2 == 195.0f);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06112");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#1.0#10.0#0.                                                                                   ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06113");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(192, 332, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06114");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str15, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06115");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0a1.0...");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06116");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("10 1 10 1 100", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06117");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#10#-1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06118");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', (int) ' ', 192);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0a1" + "'", str9, "0a1");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06119");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06120");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                              ", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                      -1.0#-1.0#-1.0#32.0#.0#                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                      -1.0#-1.0#-1.0#32.0#.0#                                                                                                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06122");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4# #a#a#a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06123");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06124");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06125");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(222L, 0L, (long) 361);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06126");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1A32A0A52A10A10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06127");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("04.4041004.40414.4044-414.4.0a.0a-.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06128");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#3240452", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06129");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 196, (long) 105, 483L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 483L + "'", long3 == 483L);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06130");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0", (long) 368);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 368L + "'", long2 == 368L);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06131");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10a.a04100a.a041a.a04a-a1a.a041a.a04100a.a0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06132");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 483L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 483L + "'", long3 == 483L);
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06133");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 0, (double) 100, 105.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06134");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("32 0 52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06135");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06136");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06137");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) -1, (int) (byte) -1);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06138");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 222L, (float) 80);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06139");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97.14111.143.21141111E9435.1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06140");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 32, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 32 + "'", short3 == (short) 32);
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06141");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 507L, (double) 289, (double) 288);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 507.0d + "'", double3 == 507.0d);
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06142");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0#1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06143");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray1, '4', (int) 'a', (int) (short) 1);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                         is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06145");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("      a a a#####################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"      a a a#####################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06146");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0                                                                         is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06147");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 0, (byte) 1, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06148");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 483, (long) 134, (long) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06149");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 105, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                    .04.04.04404.0100.0#1.0#10.0#0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06151");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 380, (long) 92, 195L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 380L + "'", long3 == 380L);
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06152");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("hi 9752 97 97299 9752 !");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi 97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06153");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##############################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##############################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06154");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0#100.0#1.0#-1.0#1.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06155");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06156");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 10, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06157");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(198L, (long) 342, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06158");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.                                                        a1.0a-1.0#100.0#32.0#-1.0#-1.0#-1.0#-1.#100.0#32.0#-1.0#-1.0#0.1--1.0#0.1-#0.1-#0.23#0.001#0.1-#-1.#100.0#32.0#-1.0#-1.0#1-1.0", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06159");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06160");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(80, 101, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06161");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a', 127, 368);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str13, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06163");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(483L, 321041104L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06164");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06165");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06166");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#3240452");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06167");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt(".1-#0.001#0.23#0.1-#0.1-#0.1-#####.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06168");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#-1.0#1.0#-1.0#1.0#1.0", 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 3.21041101E9f + "'", float2 == 3.21041101E9f);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06169");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06170");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("32444-1.0#-1.0#-1.0#32.0#100.0#-1                    .0#.0#.0##0#.0#52", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06171");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 32, 383.0d, (double) 3210411041L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06172");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 9752 97 97299 9752 ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"9752 97 97299 9752 ########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06173");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06174");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10a1a10a1a100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06175");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                      -1.0#-1.0#-1.0#32.0#.0#                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06176");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "444-1.0#-1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 444-1.0#-1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a1a10a1a100" + "'", str9, "10a1a10a1a100");
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06179");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#', (int) (short) 0, 137);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0.0" + "'", str13, "0.0");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06180");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06181");
        int[] intArray6 = new int[] { (short) -1, ' ', (byte) 0, '4', (short) 10, 10 };
        int int7 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 32, 0, 52, 10, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1a32a0a52a10a10" + "'", str9, "-1a32a0a52a10a10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-143240452410410" + "'", str11, "-143240452410410");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-143240452410410" + "'", str13, "-143240452410410");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06182");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, 'a', (int) (byte) 10, 7925);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06184");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", 100.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06185");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06186");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1a32a0a52a10a10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06187");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 7925, 100);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 0 + "'", short4 == (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06188");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#-1.0#1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06190");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#-1.0#aaa14140497-1.0#-1.0#aaaa44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444.0a.0a-.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06191");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 100, 0L, (long) 380);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 380L + "'", long3 == 380L);
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06192");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                     100.0#-1.0                     ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06193");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06194");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(483.0f, (float) 101L, (float) 383L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06195");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(3.21041101E9f, (float) 105, 92.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 92.0f + "'", float3 == 92.0f);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06196");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 100, 1001, 332);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06197");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06198");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 100, (long) (short) 32, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06199");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0410.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06200");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(380.0f, (float) 361L, (float) 101);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 101.0f + "'", float3 == 101.0f);
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06201");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, (long) 100, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06202");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 100 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 100 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06204");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 483L, (double) 195L, (double) 92.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 92.0d + "'", double3 == 92.0d);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06205");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 93, (double) 100L, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06206");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("...0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06207");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06208");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1a1a100a0a--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06209");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0#-1.0#-1.0#32.0#100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06210");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".-a0.a0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06212");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1.0f, (double) (short) 100, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06213");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.", 483L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 483L + "'", long2 == 483L);
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06214");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(507.0f, (float) 192, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06215");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("92#10#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06216");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 380, 195);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06217");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int16 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06218");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 10, (int) (byte) -1);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.Class<?> wildcardClass10 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06219");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.-1.#100.0#32.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.-1.0#100.0#32.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.-1.0#100.0#32.0#-1.0#-1.0#32.0-1.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.0#100.0#32.0#-1.0#-1.0#-1.-1.0#100.0#32.0#-1.0#-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06221");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06222");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) (byte) 0, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06223");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("04 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06224");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("00                    .0#.0#.0##0#.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0                    .0#.0#.0##0#.0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06225");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 0, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06226");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06227");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 195, 195L, 321041104L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 195L + "'", long3 == 195L);
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06228");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                                                                                                                                                                                                                                          92a10a1                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06229");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                      -1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06231");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1#.#0#A#1#.#0#A#-#1#.#0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06232");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(844, 196, 7925);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7925 + "'", int3 == 7925);
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06233");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4#4# #a#a#a4444 4a4a4a", (float) 100L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06234");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("5 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 23", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06235");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 361, (int) ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 93, 0);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10 1" + "'", str14, "10 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06236");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("aaa1041aaa", (float) 361L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 361.0f + "'", float2 == 361.0f);
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1.0a1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a1.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06238");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 0 + "'", byte6 == (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1 0 0 0" + "'", str8, "1 0 0 0");
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04                    .04.04.04404.04");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06240");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("44-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06241");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.0100.01.0-1.01.01..0a1a100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06242");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06243");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, 195);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, (int) ' ');
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) 'a', (int) (short) 1);
        double double27 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06244");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hi 9752 97 97299 9752 !");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06245");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 100, (long) 251, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06246");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str10, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 -1.0 -1.0 32.0 100.0 -1.0" + "'", str12, "-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str16, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06247");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06248");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 583, 101);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32 0 52" + "'", str8, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06249");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06250");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a4a4a4 4444", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06251");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#10");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06252");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06253");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06254");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong(".0a.0a-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a.0a-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06255");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1, (long) 250, (long) 222);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06256");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06257");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 1, (short) 32);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06258");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06259");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("10 1 10 1 100", (float) 101L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 101.0f + "'", float2 == 101.0f);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06261");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(162, 162, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06262");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4a4a aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4a4a aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06263");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("32a-1a-1a100a10a32");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("32-1.0#32.0#100.0#-1.#######################################################################32-1.0#3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32-1.0#32.0#100.0#-1.#######################################################################32-1.0#3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06265");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06266");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 7925.0f, (double) 93, (double) 3.21041088E8f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 93.0d + "'", double3 == 93.0d);
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06267");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10A10", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06268");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (byte) 10, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06269");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0a1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06270");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits(".0#.0#.0##0#.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06271");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06272");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, ' ', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str16, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06273");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("7925.0#.0#.0##0#.0#10 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1 10010 1 10 1", (double) 198L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06274");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("00                    .0.0.00.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06275");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06276");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06277");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("#################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06278");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(80, (int) (short) 0, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06279");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 7925, (double) 1, 444.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06280");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0#100.0#1.0#-1.0#1.0#1..0a1a100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06281");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(507L, 0L, 195L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 507L + "'", long3 == 507L);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06282");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaa1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06283");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06284");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.-1..1.-1..1-.1..1-.1-.1--1.-1.-1..1.-1.-1.-1.-1..1.-1.                                                                       -1.-1.-1..1.-1..1-.1..1-.1-.1--1.-1.-1..1.-1.-1.-1.-1..1.-1.");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06285");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10, (float) 250, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 250.0f + "'", float3 == 250.0f);
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06286");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4 4   a a a0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06287");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06288");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0100.01.0-1.01.0100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06289");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.1-444.0a.0a-.#0.1-#0.1-#0.23#0.001#aaaa44444444444444444444444444444444444444444444444444444444444444444.1-#-1.0#aaa14140497-1.0#-1.0#-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06290");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, 0, 361);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06291");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#3240452", 288);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 288 + "'", int2 == 288);
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06292");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("3249741", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06293");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1001, (float) 1001, (float) (byte) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06294");
        int[] intArray3 = new int[] { ' ', 'a', (byte) 1 };
        int int4 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 97, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06295");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06296");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', (int) (byte) 0, (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06297");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06298");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(835, 583, 457);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 457 + "'", int3 == 457);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06299");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06300");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0#1.0#10.0#0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06301");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.1-444.0a.0a-.#0.1-#0.1-#0.23#0.001#aaaa44444444444444444444444444444444444444444444444444444444444444444.1-#-1.0#aaa14140497-1.0#-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06302");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 1, (double) 3.21041088E8f, 383.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06303");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 198, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 198");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06305");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06306");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1", (long) 80);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80L + "'", long2 == 80L);
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06307");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06308");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0A1.0A-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06309");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 361, 0.0f, (float) (byte) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06310");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 844, (long) 289, 321041104L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 321041104L + "'", long3 == 321041104L);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06311");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 0, (long) 332, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 332L + "'", long3 == 332L);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06312");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1.#-1.#-1.1.-..1.#-1.1-#.1..-.1.1-#.1-#.1-##-1.#-1.#-1.1.-..1.#-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06313");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.##                                                                                                                                                                                                                                                                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06314");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 332, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 332 + "'", int3 == 332);
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06315");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06316");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, (float) 368L, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 368.0f + "'", float3 == 368.0f);
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0#-1.0#-1.0#32.0#100.0#-1.##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06318");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 457, 321041104L, (long) 1001);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 321041104L + "'", long3 == 321041104L);
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06319");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 0, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06320");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("      a a a#####################################################################################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06321");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) (short) 100, 910);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06322");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.04100.041.04-1.041.04100.0                     ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06323");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06324");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        float float18 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float19 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str17, "100.0 1.0 10.0 0.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 100.0f + "'", float19 == 100.0f);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06325");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) -1, (long) 1001, (long) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1001L + "'", long3 == 1001L);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06326");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 368L, 134.0f, 134.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 368.0f + "'", float3 == 368.0f);
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.041.0410.040.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06328");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  ", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06329");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 92, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.0f + "'", float13 == 0.0f);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100.0#1.0#10.0#0.0" + "'", str15, "100.0#1.0#10.0#0.0");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06330");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a a a#####################################################################################################################################################################################################################################################################################################################################################################0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a", 368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 368 + "'", int2 == 368);
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06331");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06332");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) -1, (float) (byte) 10, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06333");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                             -1.0#-1.0#-1.0#32.0#100.0#-1.#####################################################10a1a10a1a100");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06334");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) 0, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06335");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.                                                                                                                                                                                                                                                                                                                                                                                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.                                                                                                                                                                                                                                                                                                                                                                                             is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06337");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        long long7 = org.apache.commons.lang3.math.NumberUtils.min(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06338");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 288, (double) 198L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 288.0d + "'", double3 == 288.0d);
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06339");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', 361, 192);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (-1), 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.041.0410.040.0" + "'", str16, "100.041.0410.040.0");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06340");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06341");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1 100 0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06342");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0a.a04100a.a041a.a04a-a1a.a041a.a04100a.a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a.a04100a.a041a.a04a-a1a.a041a.a04100a.a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06343");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 32, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06344");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', (int) ' ', (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str14, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06345");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06346");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06347");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) ' ', 288);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("32#-1#-...10 1 10 1 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06349");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("92a10a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06350");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.Class<?> wildcardClass10 = floatArray4.getClass();
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06351");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) (short) 10, 583);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str9, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06352");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("########################################################################################################################################################################################################################   4 #");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06353");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06354");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 507, (int) (byte) 100);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "44452 9752 9752 97 97299 9752 ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 44452 9752 9752 97 97299 9752 ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 10 + "'", byte13 == (byte) 10);
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06355");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.0 100.0 1.0 -1.0 1.0 100.0" + "'", str14, "0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str16, "0.0a100.0a1.0a-1.0a1.0a100.0");
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:                                                                        .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06357");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("44444444444444444444444444444444444444444444444444444444444444444", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06358");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1432404524-1.0 -1.0 -1.0 32.0 100.0 -1.0-1432404524", (long) 80);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 80L + "'", long2 == 80L);
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06359");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hi 9752 97 97299 9752 !444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06360");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("321041104132104110413210411041321041104132104110413210411041321041104132104110413210411041", (double) 198);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.210411041321041E89d + "'", double2 == 3.210411041321041E89d);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06361");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(198L, 0L, (long) 127);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06363");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#-1.0#-1.0#32");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06364");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06365");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.010                                                                                                                                      -1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06366");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(507.0f, (float) '#', 368.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06367");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        float float15 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        float float16 = org.apache.commons.lang3.math.NumberUtils.max(floatArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', 457, (int) ' ');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06368");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10a.a04100a.a041a.a04a-a1a.a041a.a04100a.a", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06369");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 92.0f, 92.0d, (double) 127.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 127.0d + "'", double3 == 127.0d);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06370");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("#######################################################################################################04 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06371");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06372");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 100, (int) '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float14 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100.041.0410.040.0" + "'", str11, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 100.0f + "'", float12 == 100.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str16, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06373");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', (int) ' ', 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0.0a100.0a1.0a-1.0a1.0a100.0" + "'", str15, "0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str17, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06374");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       -1.0 -1.0 -1.0 32.0 100.0 -1.    0.1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.     -1.0 -1.0 -1.0 32.0 100.0 -1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06375");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("001 79 25");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"01 79 25\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06377");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06378");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.551451001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06379");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', 0, 507);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 10 + "'", short14 == (short) 10);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06380");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(583, 1001, 835);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1001 + "'", int3 == 1001);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06381");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06382");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 101L, (float) 332L, (float) 380);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 380.0f + "'", float3 == 380.0f);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06383");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1001L, (float) (-1), (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1001.0f + "'", float3 == 1001.0f);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06384");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 198, (int) (short) 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4', 195, 0);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#1" + "'", str24, "10#1");
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06385");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("5 0 23", (double) 105L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 105.0d + "'", double2 == 105.0d);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06386");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06387");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a-1.0a1.0a-1.0a1.0a1.0", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06388");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(368, 80, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 368 + "'", int3 == 368);
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06389");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 195);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 195.0d + "'", double2 == 195.0d);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06390");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06391");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#100.0#-1a32a0a52a10a10", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06392");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0A1.0A-1.###########################################################################################", (long) 137);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.#100.0#32.0#-1.0#-1.0#-1.0#-1.#100.0#32.0#-1.0#-1.0#0.1--1.0#0.1-#0.1-#0.23#0.001#0.1-#-1.#100.0#32.0#-1.0#-1.0#0.1--1.0#0.1-#0.1-#0.23#0.001#0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.###-1.#100.0#32.0#-1.0#-1.0#-1.0#-1.#100.0#32.0#-1.0#-1.0#0.1--1.0#0.1-#0.1-#0.23#0.001#0.1-#-1.#100.0#32.0#-1.0#-1.0#0.1--1.0#0.1-#0.1-#0.23#0.001#0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06395");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.001#0.1#0.1-#0.1#0.001#0.0", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06396");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, (int) '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str14, "0.04100.041.04-1.041.04100.0");
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06397");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06398");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("32#-1#-...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06399");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06400");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06401");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("04.4041004.40414.4044-414.40414.4041004.4097.04100.043.21041101E9435.0-1.0a-1.0a-1.0a32.0a100.0a-1.004 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A044 4   A A A-4 4   A A A14 4   A A A.4 4   A A A0414 4   A A A.4 4   A A A041004 4   A A A.4 4   A A A04 4   A A A                                                                        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06402");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) 0, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06403");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) -1, (long) 383, 3210411041L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3210411041L + "'", long3 == 3210411041L);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06404");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) (byte) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06405");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) -1, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06406");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 222L, 3.21041088E8f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.21041088E8f + "'", float3 == 3.21041088E8f);
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06407");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(507L, 222L, (long) 192);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 192L + "'", long3 == 192L);
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06408");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06409");
        int[] intArray2 = new int[] { 383, 101 };
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray2, ' ', 92, 188);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[383, 101]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 383 + "'", int3 == 383);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06410");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100.041.0410.040.0" + "'", str9, "100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0 1.0 10.0 0.0" + "'", str12, "100.0 1.0 10.0 0.0");
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06411");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("--# 79 25");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06412");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("           -1.0#-1.0#-1.0#32.0#100.0#-1.            ", 1001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1001 + "'", int2 == 1001);
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06413");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#######################################################################################################################################################################################################################23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.0####.1-#0.001#0.23#0.1-#0.1-#0.1-444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06414");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 32, (-1), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06415");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                        ", 93);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" 9752 97 97299 9752 32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 9752 97 97299 9752 32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06417");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ", 195L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195L + "'", long2 == 195L);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06418");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa1 1 0 97100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06419");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".0a.0a-.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06420");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23", (double) (-1L));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06421");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', (int) (short) 10, (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str19, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06422");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("32-1.0#32.0#100.0#-1.#######################################################################32-1.0#3");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06423");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 127, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 127");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("10 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10 1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06425");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#3240452");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06426");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0#32.0#100.0#-1.#######################################################################");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06427");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("10 1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06428");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06429");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaa1041aaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06430");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06431");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100.0#-1.a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0#-1.a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06432");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a--1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1.0a1.0a-1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06433");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                          92a10a1                                                                                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06434");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 32, (short) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06435");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(127.0f, 0.0f, (float) 910);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06436");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4a4a0.001#0.1#0.1-#0.1#0.001#0.0aaaaaa", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06437");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06438");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06439");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0100.0", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06440");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100.0#1.0#10.0#0.                                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100.0#1.0#10.0#0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06441");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 32, (float) 507, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06442");
        short[] shortArray1 = new short[] { (byte) 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', (int) (short) 100, 0);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#', (int) '4', (int) (short) -1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short14 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', 1001, (int) (byte) 100);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 100 + "'", short6 == (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100" + "'", str8, "100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertTrue("'" + short14 + "' != '" + (short) 100 + "'", short14 == (short) 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06443");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("--1.0#-1.0#-1.0#32.0#0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06444");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06445");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06446");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a', 1001, 483);
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(longArray1, '#', 380, 1);
        long long20 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', 0, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a4a4a4 4444################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a4a4a4 4444################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06448");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1.0A1.0A-1.0", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06449");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 198, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte18 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14a4a aaaaaa.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14a4a aaaaaa.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10#1" + "'", str10, "10#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a1" + "'", str12, "10a1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) 10 + "'", byte17 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte18 + "' != '" + (byte) 1 + "'", byte18 == (byte) 1);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06450");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) 32, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06452");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1.#-1.#-1.1.-..1.#-1.1-#.1..-.1.1-#.1-#.1-##-1.#-1.#-1.1.-..1.#-1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06453");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(93.0f, (float) (-1), (float) 368);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 368.0f + "'", float3 == 368.0f);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06454");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444-1.0#-1", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06455");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0017925");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17925 + "'", int1 == 17925);
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06456");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (byte) 1, (float) 1001);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1001.0f + "'", float3 == 1001.0f);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06457");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("92#10#1", (float) 332);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332.0f + "'", float2 == 332.0f);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06458");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(380.0f, (float) 101, (float) 483);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06459");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06460");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("104144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444", (float) 332);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 332.0f + "'", float2 == 332.0f);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06461");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, 93.0d, 1001.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06462");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 162, (double) 368, (double) 457);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 162.0d + "'", double3 == 162.0d);
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06463");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(383.0d, 0.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 383.0d + "'", double3 == 383.0d);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06464");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1...0a1a1003210411041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444.1-30.00130.2330.1-30.1-30.1-444.02.02-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444.1-30.00130.2330.1-30.1-30.1-444.02.02-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06466");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3.21041088E8f, (-1.0d), (double) 483);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06467");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06468");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.1-A0.1A0.1", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06469");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!0044444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("4 4   a a a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 4 4   a a a is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06471");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 483, (float) (short) -1, 483.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06472");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(number1);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06473");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06474");
        float[] floatArray0 = new float[] {};
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(floatArray0, '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray0, ' ', 100, (int) 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06475");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(1.0d, 289.0d, (double) 332);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06476");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 378, 507);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 378");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32 0 52" + "'", str14, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32#0#52" + "'", str16, "32#0#52");
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06477");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, (float) 483L, (float) ' ');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06478");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(383, 361, 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06479");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06480");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06481");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) (byte) -1, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32a0a52" + "'", str12, "32a0a52");
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06482");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aaaa0aaaaaaaaaa0a   a a a a  a a aaaaa0aaaaaaaaaa0aa 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4 444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 4   444  a a  a a  a a aa a   a a  aa444  a a  a a  a a aa a   a a  a 444  a a  a a  a a aa a   a a  a000000000000000000000000000000000000000000000000000000000000000000000000", 380.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 380.0d + "'", double2 == 380.0d);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06483");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) -1, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                       #-1.0#1.0a1.0a-1.0                                                                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-1.0#1.0a1.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06485");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 1, 105, 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 192 + "'", int3 == 192);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#54155.54-1.54444.1-45.55145.4445.1-45.1-45.1-1#0.1-#4155.54-1.54444.1-45.55145.4445.1-45.1-45.1-11#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-#0.1-a0.1a0.1#0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06487");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06488");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".a.a-.", 195.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 195.0f + "'", float2 == 195.0f);
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06489");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10, (double) 483, 105.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06490");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("3249741");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06491");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("14 4   a a a");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06492");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(483.0f, (float) 93L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06493");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0#aaa14140497-1.0#-1.0#1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#aaa14140497-1.0#-1.0#1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1.0A1.0...1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06494");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 9744452 9752 9752 97 97299 9752");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444-1.0#-1.0#-1.0#32.0#100.0#-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06496");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.##");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                                                        -1.0#-1.0#-1.0#32.0#100.0#-1.##");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06497");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                  0.0100.01.0-1.01.0100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06498");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06499");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("32#0#52");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest12.test06500");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 368.0f, (float) 137);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }
}

