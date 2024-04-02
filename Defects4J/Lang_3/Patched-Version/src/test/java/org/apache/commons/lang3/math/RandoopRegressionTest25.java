package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test12501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12501");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 10, (long) 111100103, (long) 10041);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test12502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12502");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1061, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1061 + "'", int3 == 1061);
    }

    @Test
    public void test12503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12503");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 1072L, (double) 111100103, (double) 1072L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1072.0d + "'", double3 == 1072.0d);
    }

    @Test
    public void test12504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12505");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA-1.0#-1.0.10.0A10.0AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444444444444444444444444444444444444444 0.0 0.100A1HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12506");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0001#01#1-#0#001#001", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12507");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) (byte) 10, 10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', (int) (short) 100, (int) '4');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100.0" + "'", str13, "100.0");
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12508");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 4326);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) 100 + "'", short22 == (short) 100);
    }

    @Test
    public void test12509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12509");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', 678, 4326);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 678");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12510");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                                                                                                                                                                                                                                                                                                                                                                                     ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12511");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 10, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12512");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 10, 0.0f, (float) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12513");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12514");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("AA ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12515");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12516");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1.0 0.0 0.0" + "'", str7, "-1.0 0.0 0.0");
    }

    @Test
    public void test12517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12517");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test12518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12518");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 100, (long) 179, (long) 1072);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test12519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                        1a1a001a1-a0a001                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1a1a001a1-a0a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12520");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) -1, 227L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 227L + "'", long3 == 227L);
    }

    @Test
    public void test12521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12521");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12522");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 10, 0);
        float float20 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 100.0f + "'", float20 == 100.0f);
    }

    @Test
    public void test12523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12523");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                             35#-1#0#03                                                             ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12524");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) (short) 1, (float) 301001111L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0100112E8f + "'", float3 == 3.0100112E8f);
    }

    @Test
    public void test12525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12525");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("          100a1-1.0A0.0A0.0       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12526");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 494, 662);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 494");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
    }

    @Test
    public void test12527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12527");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(200.0d, (double) 200, (double) 67.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test12528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12528");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(" aA#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#                                                                               ", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12529");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a-1a-1a-1a1" + "'", str8, "0a-1a-1a-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#-1#-1#-1#1" + "'", str10, "0#-1#-1#-1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0#-1#-1#-1#1" + "'", str12, "0#-1#-1#-1#1");
    }

    @Test
    public void test12530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12530");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("                                                                              1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12531");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a1-1.0A0.0A0.", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12532");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(3.0100112E8f, (float) 1072L, (float) 114);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.0100112E8f + "'", float3 == 3.0100112E8f);
    }

    @Test
    public void test12533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12533");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("4 A#0#-...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12534");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1068, 727, 3883);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 727 + "'", int3 == 727);
    }

    @Test
    public void test12535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12535");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("0.0a0.0a0.1-1a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0a0.0a0.1-1a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12536");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1079#25#001#01#1-#00179#25#001#01#1-#00110079#25#001#01#1-#00179#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#00179#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#00179#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#00179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#00179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#00179#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#00179#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#00179#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a", (float) 227);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 227.0f + "'", float2 == 227.0f);
    }

    @Test
    public void test12537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12537");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"00#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhha135\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12538");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 1044, (long) 0, (long) (byte) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(".A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..301001111     100a1-1.0A0.0A0.0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: .A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..301001111     100a1-1.0A0.0A0.0         is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12540");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12541");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) (byte) 100, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12542");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
    }

    @Test
    public void test12543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12543");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("...100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001a-1.0a0.0a0.004041-453 4a1a0.001a#a01", (-1.0d));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test12544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12544");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.00110096E8d, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.00110096E8d + "'", double3 == 1.00110096E8d);
    }

    @Test
    public void test12545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12545");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12546");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 1068, 114);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12547");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) -1, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12548");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 546, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 546");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0" + "'", str17, "-1.0");
    }

    @Test
    public void test12549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12549");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("        0.0A0.0A0.1-1A001       ", 0.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test12550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12550");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12551");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) '4', (-1));
        java.lang.Class<?> wildcardClass17 = shortArray6.getClass();
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100404-141004141" + "'", str12, "100404-141004141");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12552");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 1, (double) 1059L, 1072.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test12553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12553");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 546, (float) 500, (float) 627);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 627.0f + "'", float3 == 627.0f);
    }

    @Test
    public void test12554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12554");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 111100103L, (double) 811, (double) 4330.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 811.0d + "'", double3 == 811.0d);
    }

    @Test
    public void test12555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12555");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.Class<?> wildcardClass10 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10041" + "'", str8, "10041");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12556");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "hhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: hhhhhhhhhh");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12557");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("35#-1#0#00.0a0.0a0.1-hhhhhhhhhhh-1.0 0.0 0.01### 1###                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 35#-1#0#00.0a0.0a0.1-hhhhhhhhhhh-1.0 0.0 0.01### 1###                        is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12558");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0", 111100103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111100103 + "'", int2 == 111100103);
    }

    @Test
    public void test12559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12559");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        float float13 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0410.0" + "'", str12, "10.0410.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test12560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12560");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("035#-1#0#035#-1#0#035#-1#0#0############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHHHHHHHHHHHHHHHHHHHH1### 1###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12561");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0A0.0A0.1-A10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010A7920AA....A10A100A-1A");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12562");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         0.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.04100#-1#10#100#52#97 #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", 811.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 811.0d + "'", double2 == 811.0d);
    }

    @Test
    public void test12563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12563");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test12564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12564");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ', 1733, 10001000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1733");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100#1" + "'", str6, "100#1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#1" + "'", str8, "100#1");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
    }

    @Test
    public void test12565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12565");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float14 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 100.0f + "'", float13 == 100.0f);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 100.0f + "'", float14 == 100.0f);
    }

    @Test
    public void test12566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12566");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 100, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12567");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(599, 592, 1068);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 592 + "'", int3 == 592);
    }

    @Test
    public void test12568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12568");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a1-a001a01a....aa0297a01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001a-1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a1-a001a01a....aa0297a01001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001a-1.0a0.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12569");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 132, (double) 74, (double) 1051L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 74.0d + "'", double3 == 74.0d);
    }

    @Test
    public void test12570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12570");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                                                                      32#0#0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12571");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 149L, 301001111L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12572");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12573");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 1059, 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1059 + "'", int3 == 1059);
    }

    @Test
    public void test12574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12574");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(627, 1733, 111100103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 627 + "'", int3 == 627);
    }

    @Test
    public void test12575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12575");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1072, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (-1), 67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12576");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 100, (int) '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long17 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354-14040" + "'", str15, "354-14040");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test12577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12577");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "354-14040" + "'", str14, "354-14040");
    }

    @Test
    public void test12578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("##-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12579");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a#-#0#-#0#001#-#0#-#0#0010.001#-#0#-#0#0011#-#0#-#0#        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12580");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0A0.0A0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12581");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(229L, 0L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12582");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1041004-1" + "'", str21, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) -1 + "'", byte22 == (byte) -1);
    }

    @Test
    public void test12583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12583");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("a#4A 41a-1.0a0.0a0.0.1 41.141. 41.1 41. 41. 1a-1.0a0.0a0.03hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH       100a1-1.0A0.0A0.0        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12584");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#Hi!1001010010100101001010010100101001010010100101004 a10010100101001010010100101001010010100101001015#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12585");
        long[] longArray0 = new long[] {};
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray0, 'a', (int) (byte) 100, 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray0, '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray0, ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Array cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test12586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12586");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
    }

    @Test
    public void test12587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12587");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10a100a-1" + "'", str13, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test12588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12588");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4330L, (float) 229L, (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test12589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12589");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                              1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1004-1410410045249735#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12590");
        float[] floatArray2 = new float[] { (-1L), (byte) -1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', (int) (short) 100, (int) '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1.0 -1.0" + "'", str4, "-1.0 -1.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test12591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12591");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test12592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12592");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test12593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12593");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12594");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 494, 1);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test12595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12595");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) ' ', (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double19 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0#0.0#0.0" + "'", str18, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test12596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12596");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3000#000#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101000101010011hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh135");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12597");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("035#-1#0#035#-1#0#035#-1#0#0############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101001000#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHHHHHHHHHHHHHHHHHHHH1### 1##");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12598");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12599");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0410.0" + "'", str10, "10.0410.0");
    }

    @Test
    public void test12600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12600");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 1, (byte) 0, (byte) 10, (byte) 0, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', (int) 'a', (int) (byte) -1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 1, 0, 10, 0, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 10 + "'", byte11 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 10 + "'", byte12 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test12601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12601");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 500L, (double) (byte) 0, (double) 200.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12602");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 3883, 494);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 100 -1" + "'", str13, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12603");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("4 A4#a35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###                       100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A", (float) 1051);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1051.0f + "'", float2 == 1051.0f);
    }

    @Test
    public void test12604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12604");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("  #  3      #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               # ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12605");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("79#25#001#01#1-#001A1.A.A.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12606");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4a3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#403hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4.3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12607");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12608");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#a#a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12609");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 678, (double) 4330.0f, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4330.0d + "'", double3 == 4330.0d);
    }

    @Test
    public void test12610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12610");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1, (float) 200L, (float) 310);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 310.0f + "'", float3 == 310.0f);
    }

    @Test
    public void test12611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12611");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, 310);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test12612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12612");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 1072, (int) (short) 0);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test12613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12613");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 699, (float) 727, 1.11100104E8f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.11100104E8f + "'", float3 == 1.11100104E8f);
    }

    @Test
    public void test12614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12614");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100A10h...", (float) 276);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 276.0f + "'", float2 == 276.0f);
    }

    @Test
    public void test12615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12615");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1733, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test12616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12616");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0#-1.0                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12617");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("A#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12618");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.Class<?> wildcardClass10 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12619");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', (int) (byte) 1, 114);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35 -1 0 0" + "'", str11, "35 -1 0 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35 -1 0 0" + "'", str13, "35 -1 0 0");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12620");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a', 10001000, (int) (byte) 100);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ');
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100.0" + "'", str18, "100.0");
    }

    @Test
    public void test12621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12621");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a1aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh.0A0.0A0.h");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12622");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                                                                                                                                                           100A10h...", 227L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 227L + "'", long2 == 227L);
    }

    @Test
    public void test12623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12623");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#Hi!1001010010100101001010010100101001010010100101004a10010100101001010010100101001010010100101001015#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12624");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("  ###1 ###", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12625");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 0L, (long) 699);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12626");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35a-1a0a0" + "'", str14, "35a-1a0a0");
    }

    @Test
    public void test12627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12627");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 1, (int) (byte) 1);
        short short13 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 10" + "'", str6, "100 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a10" + "'", str8, "100a10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 10 + "'", short13 == (short) 10);
    }

    @Test
    public void test12628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12628");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(intArray1, '#', (int) '#', 10001000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test12629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12629");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1-AA0.0A0.0A0.1");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12630");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short24 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) 100, 132);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100a0a-1a100a1a1" + "'", str23, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test12631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12631");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
    }

    @Test
    public void test12632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12632");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("                                          100a0a-1a100a1a1                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12633");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1051, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12634");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0h0.0haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0h0.0haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12635");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             A0.0A0.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12636");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0#-1.0.10.0a10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12637");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 10041, (int) (short) 1);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test12638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12638");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 114, (double) 4330L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12639");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 1, (float) 74, (float) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 74.0f + "'", float3 == 74.0f);
    }

    @Test
    public void test12640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12640");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12641");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444100A10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12642");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("hhhhhhhhhhh-1.0a0.0a0.00#0#1-#53");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12643");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(627.0f, (float) 149L, 1068.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 149.0f + "'", float3 == 149.0f);
    }

    @Test
    public void test12644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12644");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("        0.0a0.0a0.1-1a001       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12645");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 67, (float) 100, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12646");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                                                  a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35                                                                   ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                                   a#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35                                                                   ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
    }

    @Test
    public void test12647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12647");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(207, 1042, 10001000);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10001000 + "'", int3 == 10001000);
    }

    @Test
    public void test12648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12648");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10#100#-1" + "'", str13, "10#100#-1");
    }

    @Test
    public void test12649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12649");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "1### 1###a");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 1### 1###a");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) -1 + "'", byte20 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) 100 + "'", byte21 == (byte) 100);
    }

    @Test
    public void test12650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12650");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440A.A0AAA0A.A0AAA0A.A1A-AAA100101001010010100101100#100A.A0AAA0A.A0AAA0A.A1A-AAA100101001010010100101");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12651");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                          100a0a-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12652");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a-1.0a0.0a0.0100#-1#10#100#52#974#a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12653");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100#0#-1#100#1#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12654");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh..");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12655");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short23 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 0, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) -1 + "'", short23 == (short) -1);
    }

    @Test
    public void test12656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12656");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("925001011-", (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test12657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12657");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", (double) 1051);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1051.0d + "'", double2 == 1051.0d);
    }

    @Test
    public void test12658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12658");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1a", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12659");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test12660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12660");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("001010010100101001010010100101001010010100101001010010100101001010010100101001010010100", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12661");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12662");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 727, 627.0f, (float) 10);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 727.0f + "'", float3 == 727.0f);
    }

    @Test
    public void test12663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12663");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#0.0#0.010044-414104100452497354#4-414#404#4004.404A404.404A404.414-4354#4-414#404#4004.4010044-");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12664");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 67.0f, (double) 1.11100104E8f, (double) (-1));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.11100104E8d + "'", double3 == 1.11100104E8d);
    }

    @Test
    public void test12665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12665");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("10100a10100a10100a10100a10100a10100a10100a10100a10100301001111");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12666");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("       100a1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12667");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), (float) 1068, (float) 229L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1068.0f + "'", float3 == 1068.0f);
    }

    @Test
    public void test12668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12668");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("a10H35#-1#0#", (short) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test12669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12669");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) '#', (int) (byte) 0);
        double double17 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test12670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12670");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long7 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.Class<?> wildcardClass9 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 35L + "'", long6 == 35L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 35L + "'", long7 == 35L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test12671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12671");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" a a a4 ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12672");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) 0, 1042, 494);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12673");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(229, 10, 1072);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test12674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12674");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("--0-111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12675");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, (long) 10001000, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10001000L + "'", long3 == 10001000L);
    }

    @Test
    public void test12676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12676");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (-1), (float) 100L, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12677");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("a#aaa ", (double) 1.0001E7f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0001E7d + "'", double2 == 1.0001E7d);
    }

    @Test
    public void test12678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12678");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("a a a4 35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12679");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1072, (int) (short) 100);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test12680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12680");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 4 A#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#3hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1004 a.0A0.0A0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12681");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("53");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 53L + "'", long1 == 53L);
    }

    @Test
    public void test12682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12682");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(276, (int) (short) 1, 500);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 500 + "'", int3 == 500);
    }

    @Test
    public void test12683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12683");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double10 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double14 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1.0a0.0a0.0" + "'", str19, "-1.0a0.0a0.0");
    }

    @Test
    public void test12684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12684");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(627, 599, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test12685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12685");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short22 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short23 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short22 + "' != '" + (short) -1 + "'", short22 == (short) -1);
        org.junit.Assert.assertTrue("'" + short23 + "' != '" + (short) 100 + "'", short23 == (short) 100);
    }

    @Test
    public void test12686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("a#aaa a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#aaa a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12687");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(1.0d, (double) 74.0f, (double) 67);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 74.0d + "'", double3 == 74.0d);
    }

    @Test
    public void test12688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12688");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 111100103, (long) 770, 243L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 243L + "'", long3 == 243L);
    }

    @Test
    public void test12689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12689");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100AhhhhhhhhhhH-1.0A0.0A0.00#0#1-#53");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100AhhhhhhhhhhH-1.0A0.0A0.00#0#1-#53\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12690");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #aHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #aHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12691");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (-1L));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12692");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        short short20 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', (int) 'a', (int) (byte) 10);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100 0 -1 100 1 1" + "'", str19, "100 0 -1 100 1 1");
        org.junit.Assert.assertTrue("'" + short20 + "' != '" + (short) 100 + "'", short20 == (short) 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
    }

    @Test
    public void test12693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12693");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) 'a', 310, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 310 + "'", int3 == 310);
    }

    @Test
    public void test12694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12694");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double9 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', (int) (short) -1, (-1));
        double double14 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double15 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double16 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test12695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12695");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4 aA#4#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12696");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 276, 546);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 276");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
    }

    @Test
    public void test12697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12697");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(149, (int) (short) 10, 111100103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test12698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12698");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100a1" + "'", str12, "100a1");
    }

    @Test
    public void test12699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12699");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 10, 0);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', 227, 1066);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 227");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12700");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, (int) (short) -1);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', 10001000, 1051);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test12701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12701");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short24 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short25 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short26 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a0a-1a100a1a1" + "'", str19, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100a0a-1a100a1a1" + "'", str21, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100a0a-1a100a1a1" + "'", str23, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short24 + "' != '" + (short) 100 + "'", short24 == (short) 100);
        org.junit.Assert.assertTrue("'" + short25 + "' != '" + (short) -1 + "'", short25 == (short) -1);
        org.junit.Assert.assertTrue("'" + short26 + "' != '" + (short) -1 + "'", short26 == (short) -1);
    }

    @Test
    public void test12702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12702");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     CLASS[lJAVA.LANG.sTRING;CLASS...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12703");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a', (int) (short) 100, (int) (short) 100);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.Class<?> wildcardClass20 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test12704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12704");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 770, (long) 1, (long) 10001000);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10001000L + "'", long3 == 10001000L);
    }

    @Test
    public void test12705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12705");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                         10001000                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0001E7d + "'", double1 == 1.0001E7d);
    }

    @Test
    public void test12706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12706");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a#-#0#-#0#001#-#0#-#0#0010.001#-#0#-#0#0011#-#0#-#0#        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12707");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', 592, 905);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 592");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1004-14104100452497" + "'", str26, "1004-14104100452497");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1004-14104100452497" + "'", str29, "1004-14104100452497");
    }

    @Test
    public void test12708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12708");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 1, (byte) 10, (byte) -1, (short) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        short short10 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, -1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0 10 1 10 -1 1" + "'", str9, "0 10 1 10 -1 1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0a10a1a10a-1a1" + "'", str13, "0a10a1a10a-1a1");
    }

    @Test
    public void test12709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12709");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) ' ', 599, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test12710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12710");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 10, (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) ' ', (int) (byte) 1);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10a100a-1" + "'", str17, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
    }

    @Test
    public void test12711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12711");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ', (int) '#', 0);
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#');
        float float18 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 10.0f + "'", float15 == 10.0f);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0#10.0" + "'", str17, "10.0#10.0");
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 10.0f + "'", float18 == 10.0f);
    }

    @Test
    public void test12712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12712");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10, (long) (byte) 1, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test12713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12713");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int27 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str29 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        int int30 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "100 -1 10 100 52 97" + "'", str29, "100 -1 10 100 52 97");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test12714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12714");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.A0.0A0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12715");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("        0.0A0.0A0.1-1a001       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh30.0a0.0a0.1-a1 .14 .14 1.14 .141.14 1.0.0a0.0a0.1-a14 A4#a", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12716");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12717");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 10, (short) (byte) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12718");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test12719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12719");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhh100 7920AA....                                                                                          1-4001401");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12720");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test12721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12721");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#A#A0.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh35 -1 0 0", (float) 1044);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1044.0f + "'", float2 == 1044.0f);
    }

    @Test
    public void test12722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12722");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaa0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12723");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(". 0        .A.A.1-1A1    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \". 0        .A.A.1-1A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12725");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) 301001111L, 727.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12726");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 535);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 535 + "'", int2 == 535);
    }

    @Test
    public void test12727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12727");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 4326.0f, (double) 1068L, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 4326.0d + "'", double3 == 4326.0d);
    }

    @Test
    public void test12728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12728");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("hhhhhh");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12729");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "35#-1#0#0" + "'", str12, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35 -1 0 0" + "'", str14, "35 -1 0 0");
    }

    @Test
    public void test12730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12730");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("", (double) 67);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 67.0d + "'", double2 == 67.0d);
    }

    @Test
    public void test12731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12731");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(678, 727, 1059);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 678 + "'", int3 == 678);
    }

    @Test
    public void test12732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12732");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("...hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12733");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal(" 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12734");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12735");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (short) 10, (double) (short) -1, (double) 905);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 905.0d + "'", double3 == 905.0d);
    }

    @Test
    public void test12736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12736");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1, (float) 132, (float) 905);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test12737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12737");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(599L, 0L, (long) 905);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 905L + "'", long3 == 905L);
    }

    @Test
    public void test12738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12738");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("100 7920AA.... 1-4001401");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 7920AA.... 1-4001401\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12739");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(74, 229, 290);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 290 + "'", int3 == 290);
    }

    @Test
    public void test12740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12740");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 132, (long) 492, 243L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 492L + "'", long3 == 492L);
    }

    @Test
    public void test12741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12741");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', (int) (short) 100, (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray1, ' ', 811, (int) '4');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test12742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12742");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#000#0011a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100010a10a100a11ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh35#-1#0#00.0A0.0A0.1-4444444 a", (long) 546);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 546L + "'", long2 == 546L);
    }

    @Test
    public void test12743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12743");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12744");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a', 0, (int) (byte) 0);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4', 74, 229);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 74");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test12745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12745");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3.0100112E8f, (double) 811, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12746");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("925001011-00110#100#-11.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12747");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0a10.0" + "'", str10, "10.0a10.0");
    }

    @Test
    public void test12748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12748");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int19 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1004-14104100452497" + "'", str14, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100a-1a10a100a52a97" + "'", str16, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "100 -1 10 100 52 97" + "'", str22, "100 -1 10 100 52 97");
    }

    @Test
    public void test12749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12749");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test12750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12750");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#035#0#-1#a5#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#a-1.0a0.0a0.0100#97#52#100#10#-1#10100-11000100#10");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12751");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0A0.0A0.1-1#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 0.0A0.0A0.1-1#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12752");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                          .0A0.0A0.                             0.0 0.        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                          .0A0.0A0.                             0.0 0.        0.0A0.0A0.1-1a001     111100103444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12753");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1000100035#-1#0#", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12754");
        short[] shortArray6 = new short[] { (short) 0, (short) 10, (short) 1, (byte) 10, (byte) -1, (short) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 500, (int) (byte) 10);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[0, 10, 1, 10, -1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 10 + "'", short12 == (short) 10);
    }

    @Test
    public void test12755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12755");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("a a a4 35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhh-1.0 0.0 0.01### 1###", (long) 546);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 546L + "'", long2 == 546L);
    }

    @Test
    public void test12756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12756");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         792#0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0         792#0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0                35 -1 0 0          100a1-1.0A0.0A0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12757");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1#1#0#10#0#1", 243);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 243 + "'", int2 == 243);
    }

    @Test
    public void test12758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12758");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.00.0 0.0 0.1-10aaa100.0a1a4 a10aaa100.0a1a4 a10aaa100.0ahHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12759");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "35 -1 0 0Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 35 -1 0 0Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
    }

    @Test
    public void test12760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12760");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(4326.0f, 492.0f, (float) '#');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 35.0f + "'", float3 == 35.0f);
    }

    @Test
    public void test12761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12761");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', 0, 207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0435.0" + "'", str6, "-1.0435.0");
    }

    @Test
    public void test12762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12762");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("100 7920AA....                                                                                          1-4001401");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12763");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((-1L), 10L, (long) 599);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test12764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12764");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 727, 0.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test12765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12765");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) 100 + "'", short16 == (short) 100);
    }

    @Test
    public void test12766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12766");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12767");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
    }

    @Test
    public void test12768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12768");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("32#0#0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32#0#0#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12769");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("79a25a001a01a1-a001", (long) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12770");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 0.0f, (float) 592);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12771");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#Hi!1001010010100101001010010100101001010010100101004a10010100101001010010100101001010010100101001015#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#Hi!1001010010100101001010010100101001010010100101004a10010100101001010010100101001010010100101001015#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12772");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "aaaaaa-35#-1#0#00.0A0.0A0.1-aaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaa-35#-1#0#00.0A0.0A0.1-aaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10 100 -1" + "'", str13, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1041004-1" + "'", str15, "1041004-1");
    }

    @Test
    public void test12773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12773");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) ' ', (long) 662, 10001000L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test12774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12774");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) ' ', (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 10, (-1));
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0a0.0a0.0" + "'", str8, "-1.0a0.0a0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1.0#0.0#0.0" + "'", str10, "-1.0#0.0#0.0");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0#0.0#0.0" + "'", str18, "-1.0#0.0#0.0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12775");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0aa0a1-a5311a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0a0.1-aa479a25a001a01a1-a0010.0a0.0aa0a1-a5311a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a0011a001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12776");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("       100A0A-1A100A1A1                                          ", (long) 1066);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1066L + "'", long2 == 1066L);
    }

    @Test
    public void test12777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12777");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12778");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 207, (float) 10041L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test12779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12779");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#A4#          100A1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12780");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12781");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("Hi!1001010010100101001010010100101001010010100101004 a1001010010100101001010010100101001010010100101", 1059);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1059 + "'", int2 == 1059);
    }

    @Test
    public void test12782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12782");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("000#000#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101000101010011hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh135", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test12783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12783");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 10041.0f, 1.00110096E8d, (double) 67.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 67.0d + "'", double3 == 67.0d);
    }

    @Test
    public void test12784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12784");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1 1 0 10 0 1", (float) 727);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 727.0f + "'", float2 == 727.0f);
    }

    @Test
    public void test12785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12785");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                                             .0A0.0A0.                                              ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12786");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("h35-10############################################################################################################################################################################################################################################035#-1#0#035#-1#0#035#-1#0#0############################################################################################################################################################################################################################################", (double) 227);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 227.0d + "'", double2 == 227.0d);
    }

    @Test
    public void test12787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12787");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) 'a', 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long15 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long16 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35#-1#0#0" + "'", str14, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test12788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12788");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("###1###1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"###1###1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12789");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 179, (int) ' ');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100a-1a10a100a52a97" + "'", str15, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test12790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12790");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "aaaaaa100#-1#10#100#52#974444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaa100#-1#10#100#52#974444444");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10a100a-1" + "'", str6, "10a100a-1");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) -1 + "'", byte7 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12791");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 100, (short) 100, (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12792");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("hh0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0", 4322);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4322 + "'", int2 == 4322);
    }

    @Test
    public void test12793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12793");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) '4', (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte25 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte26 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte27 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10#100#-1" + "'", str24, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte25 + "' != '" + (byte) -1 + "'", byte25 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte26 + "' != '" + (byte) 100 + "'", byte26 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte27 + "' != '" + (byte) 100 + "'", byte27 == (byte) 100);
    }

    @Test
    public void test12794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12794");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray1, 'a', 10, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test12795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12795");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 1042, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1042 + "'", int3 == 1042);
    }

    @Test
    public void test12796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12796");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1051, 100L, 500L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1051L + "'", long3 == 1051L);
    }

    @Test
    public void test12797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12797");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12798");
        short[] shortArray5 = new short[] { (byte) 0, (short) -1, (byte) -1, (byte) -1, (short) 1 };
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray5, '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray5, 'a', 811, 0);
        short short15 = org.apache.commons.lang3.math.NumberUtils.max(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[0, -1, -1, -1, 1]");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0a-1a-1a-1a1" + "'", str8, "0a-1a-1a-1a1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0#-1#-1#-1#1" + "'", str10, "0#-1#-1#-1#1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + short15 + "' != '" + (short) 1 + "'", short15 == (short) 1);
    }

    @Test
    public void test12799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12799");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(310.0f, (float) 770, (float) 10001000);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 310.0f + "'", float3 == 310.0f);
    }

    @Test
    public void test12800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12800");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (byte) 10, (-1));
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
    }

    @Test
    public void test12801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12801");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 149, (long) 3883, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 3883L + "'", long3 == 3883L);
    }

    @Test
    public void test12802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12802");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 3883, (int) (byte) 10);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32#0#0#1" + "'", str14, "32#0#0#1");
    }

    @Test
    public void test12803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12803");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("a10H35#-1#0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12804");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 227L, 243.0f, (float) 546L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 546.0f + "'", float3 == 546.0f);
    }

    @Test
    public void test12805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12805");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) 'a', 0);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte23 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10a100a-1" + "'", str16, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10#100#-1" + "'", str18, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10#100#-1" + "'", str20, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte23 + "' != '" + (byte) -1 + "'", byte23 == (byte) -1);
    }

    @Test
    public void test12806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12806");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100#0#-1#100#1#1" + "'", str9, "100#0#-1#100#1#1");
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) -1 + "'", short10 == (short) -1);
    }

    @Test
    public void test12807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12807");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', 10);
        int int20 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 0, (int) (short) 0);
        int int25 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int26 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int27 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test12808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12808");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10041L, (float) 1, (float) 1068);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test12809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12809");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 482, (long) '#', 1051L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 35L + "'", long3 == 35L);
    }

    @Test
    public void test12810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12810");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong(" a#0#-#0#-#1100#0#-#0#-#100.0100#0#-#0#-#100#0#-#0#-#10100#0#-1#35", (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test12811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12811");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 535, (double) 1068.0f, (double) 10001000L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 535.0d + "'", double3 == 535.0d);
    }

    @Test
    public void test12812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12812");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("class[Ljava.lang.String;class...", (float) 1066L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1066.0f + "'", float2 == 1066.0f);
    }

    @Test
    public void test12813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12813");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', 546, 1059);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 546");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100" + "'", str20, "100");
    }

    @Test
    public void test12814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12814");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("0A.A0AAA0A.A0AAA0A.A1A-AAA100101001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh...101");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12815");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12816");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 0);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        short short18 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 100, 699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a0a-1a100a1a1" + "'", str17, "100a0a-1a100a1a1");
        org.junit.Assert.assertTrue("'" + short18 + "' != '" + (short) -1 + "'", short18 == (short) -1);
    }

    @Test
    public void test12817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12817");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12818");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, 1.11100104E8f, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test12819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12819");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "354-14040" + "'", str12, "354-14040");
    }

    @Test
    public void test12820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12820");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4#4...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12821");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray6, '4');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, '#', (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray6, ' ', 200, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 200");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1004-14104100452497" + "'", str16, "1004-14104100452497");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test12822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12822");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 0, (int) (byte) -1);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', (int) 'a', 492);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#0#-1#100#1#1" + "'", str10, "100#0#-1#100#1#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) -1 + "'", short11 == (short) -1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
    }

    @Test
    public void test12823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12823");
        short[] shortArray6 = new short[] { (byte) 10, (short) 100, (byte) 100, (short) 1, (byte) 100, (byte) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ');
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 100 1 100 10" + "'", str9, "10 100 100 1 100 10");
    }

    @Test
    public void test12824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12824");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("110011-0001");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"110011-0001\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12825");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("79a25a001a01a1-a001", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12826");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12827");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0.");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12828");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test12829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12829");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long8 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ', (int) 'a', 10);
        long long13 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "35#-1#0#0" + "'", str16, "35#-1#0#0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "35#-1#0#0" + "'", str18, "35#-1#0#0");
    }

    @Test
    public void test12830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12830");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                               100#1                                                ", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12831");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("925001011-00110#100#-11.0 0.0 0.0-1.0A0.0A0.0001#01#1-#0#001#001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12832");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("792#0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                                                                                                                                                                 ", (double) 546);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 546.0d + "'", double2 == 546.0d);
    }

    @Test
    public void test12833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12833");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444444 0.0 0.100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12834");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 111100103L, (double) 100.0f, 200.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test12835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12835");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100#0#-1#100#1#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12836");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(10041L, (long) '4', (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12837");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 699, 0L, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12838");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12839");
        java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444401001010010100101001010010100101001010010100101001010010100101001014444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(bigInteger1);
    }

    @Test
    public void test12840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12840");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444444444444444444aa.aaa.a", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test12841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12841");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#Hi!1001010010100101001010010100101001010010100101004a10010100101001010010100101001010010100101001015#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#0010.0a0.0a0.1-a#479#25#001#01#1-#001", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test12842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12842");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("HHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12843");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 727, 74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1072, 4326);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1072");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12844");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "...HHHH...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...HHHH...");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test12845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12845");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                            4#AAAAAAAA                                                              HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH1###41###");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12846");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("1-a100101001010010100101001010010100101001010010100101001010010100101001010010100101001010");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12847");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 100, (int) ' ');
        short short13 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', (int) (short) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + short13 + "' != '" + (short) 100 + "'", short13 == (short) 100);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test12848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12848");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-35#-1#0#00.0A0.0A0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12849");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int14 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int15 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int20 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int21 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100a-1a10a100a52a97" + "'", str17, "100a-1a10a100a52a97");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100a-1a10a100a52a97" + "'", str19, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test12850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12850");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(shortArray6, 'a', 811, 811);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100a0a-1a100a1a1" + "'", str10, "100a0a-1a100a1a1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test12851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12851");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("                                          100a0a-1a100a1a1                                        ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12852");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("7920AA....                         HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test12853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12853");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 227, 1044);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1044 + "'", int3 == 1044);
    }

    @Test
    public void test12854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12854");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 905, 227L, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 905L + "'", long3 == 905L);
    }

    @Test
    public void test12855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12855");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("-1.0A0.0A0.0100 1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12856");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("41004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404              a#479#25#001#01#1-#001             ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 41004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404                4354 4-414 404 4041004A414-414.404A404.404A404.404              a#479#25#001#01#1-#001              is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                                                                                                                                                                                                                                                                                                                                                 35 -1 0 0                                                                                                                                                                                                                                                                                                                                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35 -1 0 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12858");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "AAa.0A0.0100a10.0-1.0A0.0A0.0100a10.0-1.0-1-1.0-1.0A0.0A0.0100a10.0-1.0A0.0A0.0100a10.0-1.0-10a.14a.14a1.14a.141.14a1.1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: AAa.0A0.0100a10.0-1.0A0.0A0.0100a10.0-1.0-1-1.0-1.0A0.0A0.0100a10.0-1.0A0.0A0.0100a10.0-1.0-10a.14a.14a1.14a.141.14a1.1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) -1 + "'", byte11 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) -1 + "'", byte13 == (byte) -1);
    }

    @Test
    public void test12859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12859");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort(" AA4 A A A ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12860");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
    }

    @Test
    public void test12861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12861");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a", 546.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 546.0d + "'", double2 == 546.0d);
    }

    @Test
    public void test12862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12862");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a', 500, 207);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test12863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12863");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("100#0#-1#100#1#                                                                                     ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test12864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12864");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float4 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + (-1.0f) + "'", float4 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
    }

    @Test
    public void test12865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12865");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 4326, (float) 905, (float) 1061);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 905.0f + "'", float3 == 905.0f);
    }

    @Test
    public void test12866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12866");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("       a#4", (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12867");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1066.0f, (float) (short) -1, (float) 1072L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12868");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test12869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("                                                                                          A0.0A0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                          A0.0A0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12870");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test12871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12871");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(535.0d, (double) (byte) -1, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test12872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12872");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.100a1hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh 0.0 44444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12873");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', 0, 1051);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test12874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12874");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 10" + "'", str6, "100 10");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 10 + "'", short7 == (short) 10);
    }

    @Test
    public void test12875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12875");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', 200, (int) (byte) 1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100.0" + "'", str12, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100.0" + "'", str14, "100.0");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test12876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12876");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short12 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100#1" + "'", str10, "100#1");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 100 + "'", short11 == (short) 100);
        org.junit.Assert.assertTrue("'" + short12 + "' != '" + (short) 100 + "'", short12 == (short) 100);
    }

    @Test
    public void test12877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12877");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa01001111a0.0a0.");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12878");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hhhhhhhhhh100a1-1.0A0.0A0.", (long) (byte) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12879");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100404-141");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100404-141\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12880");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1041004-10.0 0.0 0.1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-10.0 0.0 0.1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12881");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) '4', 74, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 74 + "'", int3 == 74);
    }

    @Test
    public void test12882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12882");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("792#0011111111111111111111111111111HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH                                                                                                                                                                                                                 ", (long) 1068);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1068L + "'", long2 == 1068L);
    }

    @Test
    public void test12883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12883");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4#AAAAAAAA", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12884");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("#############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################100#-1#10#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12885");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("a1.A.A.1079#25#001#01#1-#001 79#25#001#01#1-#00110079#25#001#01#1-#001 79#25#001#01#1-#001-79#25#001#01#1-#0011100101001010010100101001010010100101001010010100101001010010100101001010010100101001010079#25#001#01#1-#001        79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001A79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001179#25#001#01#1-#001a79#25#001#01#1-#00100179#25#001#01#1-#001       79#25#001#01#1-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHA79#25#001#01#1-#001479#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001001079#25#001#01#1-#001.79#25#001#01#1-#00100179#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001##79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#001079#25#001#01#1-#001#79#25#001#01#1-#001-79#25#001#01#1-#001#79#25#001#01#1-#00100179#25#001#01#1-#001hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh79#25#001#01#1-#0013079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a79#25#001#01#1-#001179#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001.79#25#001#01#1-#00114179#25#001#01#1-#001.79#25#001#01#1-#0011479#25#001#01#1-#001 79#25#001#01#1-#001179#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001079#25#001#01#1-#001a79#25#001#01#1-#001079#25#001#01#1-#001.79#25#001#01#1-#001179#25#001#01#1-#001-79#25#001#01#1-#001a");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test12886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12886");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 10, (long) 500, (long) 1042);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1042L + "'", long3 == 1042L);
    }

    @Test
    public void test12887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12887");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        float float11 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test12888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12888");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("100a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4# 100a1-1.0a0.0a0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4# 100a1-1.0a0.0a0.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12889");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("35 -1 0 0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test12890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12890");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 149, (int) ' ');
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041004-1" + "'", str10, "1041004-1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10a100a-1" + "'", str12, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12891");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (byte) 100, (int) (short) 1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long11 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test12892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12892");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("          100a1-1.0A0.0A0.0                35 -1 0 0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"          100a1-1.0A0.0A0.0                35 -1 0 0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12893");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("AA4 A A A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AA4 A A A\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12894");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 1059, 310);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test12895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12895");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', 100, (int) 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1059, (-1));
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double19 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0 0.0 0.0" + "'", str6, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1.0 0.0 0.0" + "'", str12, "-1.0 0.0 0.0");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1.0a0.0a0.0" + "'", str18, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test12896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12896");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(111100103L, 0L, (long) 67);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 111100103L + "'", long3 == 111100103L);
    }

    @Test
    public void test12897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12897");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double5 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        double double6 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 1061, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test12898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12898");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1", (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test12899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12899");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1041004-10.0 0.0 0.1-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-10.0 0.0 0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12900");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("hhhhhhhhhh100a1-1.0A0.0A0.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12901");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0#52#974#a", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test12902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12902");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("        0.0a0.0a0.1-1a001       hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test12903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12903");
        int[] intArray6 = new int[] { 100, (-1), (short) 10, 100, '4', 'a' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray6, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray6, '4', (int) '#', (int) '#');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        int int15 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int16 = org.apache.commons.lang3.math.NumberUtils.max(intArray6);
        int int17 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        int int18 = org.apache.commons.lang3.math.NumberUtils.min(intArray6);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray6, 'a');
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[100, -1, 10, 100, 52, 97]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100#-1#10#100#52#97" + "'", str8, "100#-1#10#100#52#97");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100a-1a10a100a52a97" + "'", str14, "100a-1a10a100a52a97");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100a-1a10a100a52a97" + "'", str20, "100a-1a10a100a52a97");
    }

    @Test
    public void test12904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12904");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (short) 10, (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 0, 0);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
    }

    @Test
    public void test12905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12905");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', (int) (byte) 10, 4230);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) -1 + "'", byte19 == (byte) -1);
    }

    @Test
    public void test12906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12906");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa4#aaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12907");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) (short) 10, (float) 'a', (-1.0f));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12908");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 100, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12909");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0100#10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12910");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 482, (long) 100, (long) 4330);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test12911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12911");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) 'a', (int) 'a');
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', 67, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "A0aa0a0aa0Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: A0aa0a0aa0Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh1a001.0 0.0 44444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10a100a-1" + "'", str11, "10a100a-1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) 100 + "'", byte16 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte17 + "' != '" + (byte) -1 + "'", byte17 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test12912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12912");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12913");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh100A1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12914");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("1-#531a0011041004-1                ", (double) 1072);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1072.0d + "'", double2 == 1072.0d);
    }

    @Test
    public void test12915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12915");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#00.0A0.0A0.1-4444444 A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12916");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-###-#-##                                           01-###-#-", (float) 770);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 770.0f + "'", float2 == 770.0f);
    }

    @Test
    public void test12917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12917");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 10, (short) 0, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test12918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12918");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10.0 10.0" + "'", str10, "10.0 10.0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10.0a10.0" + "'", str12, "10.0a10.0");
    }

    @Test
    public void test12919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12919");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 10, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test12920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12920");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4');
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 100 -1" + "'", str9, "10 100 -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1041004-1" + "'", str11, "1041004-1");
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) 100 + "'", byte14 == (byte) 100);
    }

    @Test
    public void test12921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12921");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(0L, 4326L, (long) 1061);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test12922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12922");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(464, 464, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 464 + "'", int3 == 464);
    }

    @Test
    public void test12923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12923");
        float[] floatArray2 = new float[] { (-1L), '#' };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, '#', 0, 0);
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[-1.0, 35.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 35.0f + "'", float8 == 35.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test12924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12924");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(shortArray2, '#', (int) (short) 100, 1);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100 1" + "'", str7, "100 1");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 1 + "'", short9 == (short) 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10041" + "'", str15, "10041");
    }

    @Test
    public void test12925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12925");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray1, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0" + "'", str10, "100.0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test12926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12926");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0100#-1#10#100#52#97 #40.04-1.040.0100#-1#10#100#52#97 #40.04-1.040.0100", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12927");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12928");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '#', 1072, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray3, 'a', 227, 10041);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 227");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.0a0.0a0.0" + "'", str6, "-1.0a0.0a0.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test12929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12929");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("35#-1#0#00.0A0.0A0.1-Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                          .0A0.0A0. ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12930");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("4 #                             #-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #a-1.0a0.0a0.0100#-1#10#100#52#97 #ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi!", 1059);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1059 + "'", int2 == 1059);
    }

    @Test
    public void test12931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12931");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("10100", (long) 227);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10100L + "'", long2 == 10100L);
    }

    @Test
    public void test12932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12932");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12933");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test12934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12934");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("10100100000192001011001101100111000001i!", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12935");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a0a-1a100a1a14#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#a4#          100a1-1.0a0.0a0.0        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12936");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10001000", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10001000 + "'", int2 == 10001000);
    }

    @Test
    public void test12937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12937");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 492, (float) (short) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 492.0f + "'", float3 == 492.0f);
    }

    @Test
    public void test12938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12938");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("35#-1#0#00.0A0.0A0.1-4444444 A", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test12939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(" 0.0 0.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" 0.0 0.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12940");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"354-140400.0a0.0a0.1-a10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010a100 10a10a100a-1ahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12941");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(699.0f, (float) 811, (float) 'a');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 811.0f + "'", float3 == 811.0f);
    }

    @Test
    public void test12942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12942");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', (int) (short) 100, 114);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "354-14040" + "'", str7, "354-14040");
    }

    @Test
    public void test12943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12943");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("### 1###");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"## 1###\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12944");
        short[] shortArray2 = new short[] { (byte) 100, (byte) 10 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short9 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short10 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 10]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100 10" + "'", str4, "100 10");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100 10" + "'", str6, "100 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100a10" + "'", str8, "100a10");
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 10 + "'", short9 == (short) 10);
        org.junit.Assert.assertTrue("'" + short10 + "' != '" + (short) 10 + "'", short10 == (short) 10);
    }

    @Test
    public void test12945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12945");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test12946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 100 10100 hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH100a1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12947");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) '#', 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray2, '4', 727, (int) '#');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray2, ' ');
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10.0 10.0" + "'", str17, "10.0 10.0");
    }

    @Test
    public void test12948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12948");
        float[] floatArray1 = new float[] { 100.0f };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4', (int) ' ', 1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray1, '4');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        float float9 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray1);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(floatArray1, ' ', (int) '#', (int) ' ');
        float float15 = org.apache.commons.lang3.math.NumberUtils.min(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray1, '#', 0, 699);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[100.0]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0" + "'", str7, "100.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 100.0f + "'", float15 == 100.0f);
    }

    @Test
    public void test12949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12949");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("  #  3      #                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               # ", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test12950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12950");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                          100a0a-1a100a1a1                                          ...100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001 -1.0 0.0 0.004041-453 4 1 0.001 # 01");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12951");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0A0.0...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12952");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("a135", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12953");
        float[] floatArray2 = new float[] { 10L, (byte) 10 };
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray2, 'a', (int) (byte) 100, (int) '#');
        float float8 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float10 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float11 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        float float12 = org.apache.commons.lang3.math.NumberUtils.max(floatArray2);
        float float13 = org.apache.commons.lang3.math.NumberUtils.min(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[10.0, 10.0]");
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 10.0f + "'", float8 == 10.0f);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 10.0f + "'", float9 == 10.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 10.0f + "'", float10 == 10.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 10.0f + "'", float11 == 10.0f);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 10.0f + "'", float12 == 10.0f);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 10.0f + "'", float13 == 10.0f);
    }

    @Test
    public void test12954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12954");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', 0, (int) (short) -1);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte13 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.Class<?> wildcardClass17 = byteArray3.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) -1 + "'", byte9 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) -1 + "'", byte10 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) 100 + "'", byte12 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte13 + "' != '" + (byte) 100 + "'", byte13 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test12955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12955");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber(" a a a4 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message:  a a a4  is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12956");
        int[] intArray1 = new int[] { (short) -1 };
        int int2 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int5 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int8 = org.apache.commons.lang3.math.NumberUtils.max(intArray1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(intArray1, '4');
        int int12 = org.apache.commons.lang3.math.NumberUtils.min(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1" + "'", str4, "-1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-1" + "'", str7, "-1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1" + "'", str11, "-1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test12957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12957");
        short[] shortArray6 = new short[] { (byte) 10, (short) 100, (byte) 100, (short) 1, (byte) 100, (byte) 10 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, '#', 727, 1068);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 727");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[10, 100, 100, 1, 100, 10]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
    }

    @Test
    public void test12958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12958");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 10, 243L, (long) (short) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test12959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12959");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort(".0 0.0 0.1", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test12960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12960");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444301001111     100a1-1.0A0.0A0.0        ", (double) 905.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 905.0d + "'", double2 == 905.0d);
    }

    @Test
    public void test12961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12961");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (short) 1, (double) (short) -1, 3.01001111E8d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test12962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12962");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 1042L, (float) (-1), (float) 500L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test12963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12964");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, '4', 0, (int) (short) -1);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test12965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12965");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 229, 0.0f, (float) 905);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 905.0f + "'", float3 == 905.0f);
    }

    @Test
    public void test12966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12966");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 4326, 3883L, (long) 630);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 630L + "'", long3 == 630L);
    }

    @Test
    public void test12967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12967");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4#1##1##11--#1##1##11-111-#1##1##11-##1##1##11-hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH4#1##1##11--#1##1##11-111-#1##1##11-##1##1##11-hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh3\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12968");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test12969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12969");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 770, (long) 100, (long) 111100103);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 111100103L + "'", long3 == 111100103L);
    }

    @Test
    public void test12970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12970");
        long[] longArray4 = new long[] { ' ', (byte) 0, (short) 0, 1L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, ' ');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(longArray4, '#', (int) 'a', 207);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[32, 0, 0, 1]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32 0 0 1" + "'", str7, "32 0 0 1");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test12971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12971");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, (float) 490, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 490.0f + "'", float3 == 490.0f);
    }

    @Test
    public void test12972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12972");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test12973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12973");
        short[] shortArray6 = new short[] { (short) 100, (short) 0, (byte) -1, (byte) 100, (byte) 1, (byte) 1 };
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(shortArray6, ' ', 100, 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', 1, 0);
        short short16 = org.apache.commons.lang3.math.NumberUtils.min(shortArray6);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(shortArray6, '4', (int) ' ', 464);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 0, -1, 100, 1, 1]");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + short16 + "' != '" + (short) -1 + "'", short16 == (short) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100404-141004141" + "'", str18, "100404-141004141");
    }

    @Test
    public void test12974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12974");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("5#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4#0.0#0.0#0.1-100#10100#10100#10100#10100#10100#10100#10100#10100#10100\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("35#-1#0#01041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"35#-1#0#01041004-10.0 0.0 0.1-925001011-00110#100#-11.0 0.0 0.0-1hi!\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12976");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short7 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100a1" + "'", str6, "100a1");
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 1 + "'", short7 == (short) 1);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 100 + "'", short8 == (short) 100);
    }

    @Test
    public void test12977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12977");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #A-1.0A0.0A0.0100#-1#10#100#52#97 #AhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHI!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12978");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray4, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long14 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35a-1a0a0" + "'", str11, "35a-1a0a0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "354-14040" + "'", str13, "354-14040");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
    }

    @Test
    public void test12979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12979");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 227, (double) 1.0f, (double) 770.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 770.0d + "'", double3 == 770.0d);
    }

    @Test
    public void test12980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12980");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("h#479#25#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h#479#25#0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12981");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0#10#1#10#-1#10a.a0aAa0a.a0aAa0a.a1a-aaa10010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010aaa100a a10aaa10aaa100aaa-a1aahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh0a.a0aAa0a.a0aAa0a.a1a-aaa100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100101001010010100");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12982");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat(".A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..A..301001111     100a1-1.0A0.0A0.0        ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test12983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12983");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1L), 1.11100104E8f, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.11100104E8f + "'", float3 == 1.11100104E8f);
    }

    @Test
    public void test12984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12984");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(599, 10, 727);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test12985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12985");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(0.0f, 0.0f, 627.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 627.0f + "'", float3 == 627.0f);
    }

    @Test
    public void test12986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12986");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10041, 1066.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10041.0f + "'", float3 == 10041.0f);
    }

    @Test
    public void test12987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12987");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 227, (double) 1066L, (double) 67L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1066.0d + "'", double3 == 1066.0d);
    }

    @Test
    public void test12988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12988");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 10L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test12989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12989");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("35#-1#0#10100#-#0#-#0##100#-#0#-#0#100.0100#-#0#-#0#1100#-#0#-#0#4##", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test12990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12990");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa1 a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a0aa0a4#0#-#0#-#0011#0#-#0#-#0010.001#0#-#0#-#001##0#-#0#-#001HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH3aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa100 ", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test12991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12991");
        short[] shortArray2 = new short[] { (byte) 100, (short) 1 };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(shortArray2, 'a');
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short7 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        short short8 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        short short9 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[100, 1]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100a1" + "'", str4, "100a1");
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 100 + "'", short5 == (short) 100);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 1 + "'", short6 == (short) 1);
        org.junit.Assert.assertTrue("'" + short7 + "' != '" + (short) 100 + "'", short7 == (short) 100);
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 1 + "'", short8 == (short) 1);
        org.junit.Assert.assertTrue("'" + short9 + "' != '" + (short) 100 + "'", short9 == (short) 100);
    }

    @Test
    public void test12992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12992");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("4444435#-1#0#00.0A0.0A0.1-444444", (double) 155);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 155.0d + "'", double2 == 155.0d);
    }

    @Test
    public void test12993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12993");
        double[] doubleArray3 = new double[] { (-1), (byte) 0, 0L };
        double double4 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4');
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        double double8 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', (int) (byte) 100, 10);
        double double13 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray3, '4', (int) (short) 0, (int) (short) 1);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray3, ' ', 1044, 10001000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1044");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[-1.0, 0.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "-1.040.040.0" + "'", str6, "-1.040.040.0");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1.0" + "'", str17, "-1.0");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test12994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12994");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0-1.0A0.0A0.0100 10.0-1.0A0.0A0.0100 10.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test12995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12995");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray3, '4', 0, 630);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) -1 + "'", byte8 == (byte) -1);
    }

    @Test
    public void test12996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12996");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HHHHHHHHHHHHHaHHH       HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHHHaHHHaHHHHaH HHH HHH HHHH HHHHHHH HHHHHaHHHaHHHHaHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHHHHHaHHHaHHHHaHH79H25HHHHHHHHHHHHHH", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test12997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12997");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 100, (byte) -1 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray3, '#', (int) (short) 0, (int) (byte) 1);
        byte byte14 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(byteArray3, 'a', (int) (short) 100, 0);
        byte byte19 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte20 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte21 = org.apache.commons.lang3.math.NumberUtils.min(byteArray3);
        byte byte22 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join(byteArray3, ' ', (int) (byte) 1, 996);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[10, 100, -1]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) -1 + "'", byte5 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10#100#-1" + "'", str7, "10#100#-1");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 100 + "'", byte8 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 100 + "'", byte9 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
        org.junit.Assert.assertTrue("'" + byte14 + "' != '" + (byte) -1 + "'", byte14 == (byte) -1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + byte19 + "' != '" + (byte) 100 + "'", byte19 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte20 + "' != '" + (byte) 100 + "'", byte20 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte21 + "' != '" + (byte) -1 + "'", byte21 == (byte) -1);
        org.junit.Assert.assertTrue("'" + byte22 + "' != '" + (byte) 100 + "'", byte22 == (byte) 100);
    }

    @Test
    public void test12998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12998");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("Aaaaaaaa#479#25#001#01#1-#001aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test12999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test12999");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 492, (long) ' ', (long) 770);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 770L + "'", long3 == 770L);
    }

    @Test
    public void test13000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest25.test13000");
        long[] longArray4 = new long[] { '#', (-1), (byte) 0, 0L };
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray4, '#');
        long long8 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray4, '4');
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long12 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        long long13 = org.apache.commons.lang3.math.NumberUtils.max(longArray4);
        long long14 = org.apache.commons.lang3.math.NumberUtils.min(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[35, -1, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35#-1#0#0" + "'", str7, "35#-1#0#0");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "354-14040" + "'", str10, "354-14040");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }
}

