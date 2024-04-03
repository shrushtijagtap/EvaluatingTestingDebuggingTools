package org.apache.commons.lang3.math;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test05501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05501");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.#-1.0#0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05502");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05503");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05504");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (byte) 0, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05505");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("44444444444444444444444444444444444444444444444444444444444444444", 1L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05506");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32a0a52", 100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05507");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '4', (int) (short) 10, 1001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test05508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05508");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("44452 9752 9752 97 97299 9752 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05509");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("97.14111.143.21141111E9435.1", (long) (-1));
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
    }

    @Test
    public void test05510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05510");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) -1, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05511");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05512");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("a1.0a-1.0", 507.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 507.0f + "'", float2 == 507.0f);
    }

    @Test
    public void test05513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05513");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#132a0a520.0#100.0#1.0#-1.0#1.0#1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05514");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) '#', (int) (short) 1, 198);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test05515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05515");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 10, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05516");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 507L, (float) (byte) 1, (float) 100L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test05517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05517");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05518");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("44444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05519");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 332, (long) 10, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05520");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.0 100...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05521");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#1 1 0 97#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 1 0 97#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05522");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 198, 100.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 198.0d + "'", double3 == 198.0d);
    }

    @Test
    public void test05523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05523");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (byte) -1, 332, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05524");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("97.0#100.0#3.21041101E9#35.0", (short) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test05525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05525");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10.0f, (double) (byte) 100, (double) 1001);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1001.0d + "'", double3 == 1001.0d);
    }

    @Test
    public void test05526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05526");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0#100.0#");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05527");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05528");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
    }

    @Test
    public void test05529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05529");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#-1.0", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05530");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.", (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) -1 + "'", short2 == (short) -1);
    }

    @Test
    public void test05531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05531");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05532");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 332);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 332 + "'", int2 == 332);
    }

    @Test
    public void test05533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05533");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05534");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1.0A1.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0A1.0A-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05535");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                    .04.04.04404.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05536");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), 10L, (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05537");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) 1, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05538");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05539");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test05540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05540");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1L, 1001.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1001.0d + "'", double3 == 1001.0d);
    }

    @Test
    public void test05541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05541");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 1, (float) 3210411041L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05542");
        float[] floatArray6 = new float[] { (byte) -1, (-1), (short) -1, ' ', (byte) 100, (-1) };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(floatArray6, '#');
        float float9 = org.apache.commons.lang3.math.NumberUtils.min(floatArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a', 10, (int) (byte) 0);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(floatArray6, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join(floatArray6, '4', (int) (short) -1, 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-1.0, -1.0, -1.0, 32.0, 100.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1.0#-1.0#-1.0#32.0#100.0#-1.0" + "'", str8, "-1.0#-1.0#-1.0#32.0#100.0#-1.0");
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1.0a-1.0a-1.0a32.0a100.0a-1.0" + "'", str15, "-1.0a-1.0a-1.0a32.0a100.0a-1.0");
    }

    @Test
    public void test05543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05543");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0A1.0A-1.0", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05544");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#11-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1", (long) (byte) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05545");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#-1-1#11.#");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1-1#11.#");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test05546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05546");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 507L, (double) (byte) 1, (double) '4');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test05547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05547");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test05548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05548");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test05549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05549");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 10L, (float) (short) 1, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test05550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05551");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#1 1 0 97#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#1 1 0 97#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05553");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 1, 1L, (long) (byte) -1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test05554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05554");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"     \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05555");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (-1), (float) 100L, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test05556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05556");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((-1L), (long) 380, (long) (short) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 380L + "'", long3 == 380L);
    }

    @Test
    public void test05557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05557");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
    }

    @Test
    public void test05558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05558");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test05559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05559");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32A0A52", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05560");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(380, 332, 1001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 332 + "'", int3 == 332);
    }

    @Test
    public void test05561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05561");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) ' ', (long) (short) 0, 507L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 507L + "'", long3 == 507L);
    }

    @Test
    public void test05562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05562");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100.041.0410.040.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05563");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 100);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test05564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05564");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("                    .0#.0#.0##0#.0#", (double) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + (-1.0d) + "'", double2 == (-1.0d));
    }

    @Test
    public void test05565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05565");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05566");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("0.0#100.0#1.0#-1.0#1.0#1..0A1A100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05567");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       ", (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 100L + "'", long2 == 100L);
    }

    @Test
    public void test05568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05568");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("                                                                                             32a0a52");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05569");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#11-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05570");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05571");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("", (float) 0);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 0.0f + "'", float2 == 0.0f);
    }

    @Test
    public void test05572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05572");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 100, (short) -1, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05573");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05574");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#-1.0#32.0#100.0#-1.", (short) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05575");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("00                    .0#.0#.0##0#.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0                    .0#.0#.0##0#.0#\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05576");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#", 198.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 198.0d + "'", double2 == 198.0d);
    }

    @Test
    public void test05577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05577");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05578");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.1-#0.001#0.23#0.1-#0.1-#0.1-");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05579");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("4 4   a a a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4 4   a a a\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05580");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, 0, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test05581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05581");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(1001, 0, 1001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1001 + "'", int3 == 1001);
    }

    @Test
    public void test05582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05582");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) (byte) -1, (short) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05583");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 332, 0L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 332L + "'", long3 == 332L);
    }

    @Test
    public void test05584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05584");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 507, 100);
        byte byte15 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 100 + "'", byte10 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 100 + "'", byte15 == (byte) 100);
    }

    @Test
    public void test05585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05585");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("0.04100.041.04-1.041.04100.0                     ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05586");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(10.0f, 0.0f, (float) (-1L));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test05587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05587");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "-1.0#-1.0#-1.0#32.0#100.0#-1.###10a10a-1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0#-1.0#32.0#100.0#-1.###10a10a-1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test05588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05588");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       ", (float) 483);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 483.0f + "'", float2 == 483.0f);
    }

    @Test
    public void test05589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05589");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("32#0#521-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.", (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test05590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05590");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.#-1.0#0.", (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 1 + "'", short2 == (short) 1);
    }

    @Test
    public void test05591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05591");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 332, (long) 1001, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05592");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 'a', (double) (byte) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test05593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05593");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05594");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 1, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test05595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05595");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(100, 92, 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test05596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05596");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("32 0 52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32 0 52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05598");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 0L, (float) 3210411041L, (float) 507);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05599");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(1.0f, (float) 10, (float) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05600");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
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
    public void test05601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05601");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#   4 #", (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05602");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0", (float) 507L);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 507.0f + "'", float2 == 507.0f);
    }

    @Test
    public void test05603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05603");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("3210 110 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05604");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("3240452");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05605");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05606");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) -1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05607");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", 1001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1001 + "'", int2 == 1001);
    }

    @Test
    public void test05608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05608");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05609");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(0, (int) (short) 0, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test05610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05610");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.000\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05611");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 380L, (float) 100L, (float) 332L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 380.0f + "'", float3 == 380.0f);
    }

    @Test
    public void test05612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05612");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100, (float) 1001, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1001.0f + "'", float3 == 1001.0f);
    }

    @Test
    public void test05613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05613");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1 1 0 97");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05614");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1#1#100#0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1#1#100#0#1\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05615");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444", (float) 'a');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 97.0f + "'", float2 == 97.0f);
    }

    @Test
    public void test05616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05616");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.0#100.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05617");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) (byte) 10, (short) (byte) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05618");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 100L, (-1.0f), (float) '4');
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test05619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05619");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong(".04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05620");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0#100.0#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05621");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(332.0f, (float) 0, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05622");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ", (double) 321041104L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.21041104E8d + "'", double2 == 3.21041104E8d);
    }

    @Test
    public void test05623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05623");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(380, 93, 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 380 + "'", int3 == 380);
    }

    @Test
    public void test05624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05624");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(byteArray5, ' ', 1, 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10a1a10a1a100" + "'", str9, "10a1a10a1a100");
    }

    @Test
    public void test05625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05625");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("      a a a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05626");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', (long) '#', 10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05627");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 9744452 9752 9752 97 97299 9752 ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05628");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05629");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) ' ', (int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test05630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05630");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1.0A1.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05631");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.04100.041.04-1.041.04100.0                     ...", 3.210411041E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.210411041E9d + "'", double2 == 3.210411041E9d);
    }

    @Test
    public void test05632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05632");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("10#1-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0#100.0#-1.0#-1.0#-1.0#32.0", (double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test05633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05633");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test05634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05634");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05635");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat(".#a.#a-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".#a.#a-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05636");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test05637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05637");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("--# 79 25");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"--# 79 25\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05638");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray4, ".04100.041.04-1.041.04100.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .04100.041.04-1.041.04100.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 0 + "'", byte8 == (byte) 0);
    }

    @Test
    public void test05639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05639");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("#-1.0#-1.00A1.0A-1.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-14a4a aaaaaa.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ", (double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test05640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05640");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) '#', 1001);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
    }

    @Test
    public void test05641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05641");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test05642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05642");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '#');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', (int) (byte) 100, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.0#100.0#1.0#-1.0#1.0#100.0" + "'", str9, "0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test05643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05643");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05644");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(10.0d, 1001.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1001.0d + "'", double3 == 1001.0d);
    }

    @Test
    public void test05645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05645");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 380, (float) (byte) -1, (float) 105);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 380.0f + "'", float3 == 380.0f);
    }

    @Test
    public void test05646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05646");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("aa10a10a-1", (double) 332);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 332.0d + "'", double2 == 332.0d);
    }

    @Test
    public void test05647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05647");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0a1.0a-1.0#-1.0#1.0.04100.041.04-1.041.04100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05648");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 100, 105);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
    }

    @Test
    public void test05649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05649");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 198, (float) 0, 100.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 198.0f + "'", float3 == 198.0f);
    }

    @Test
    public void test05650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05650");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0A-1.0A-1.0A32.0A100.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05651");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10, (long) 'a', (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05652");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(105, 483, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 483 + "'", int3 == 483);
    }

    @Test
    public void test05653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05653");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05654");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("97.0#100.0#3.21041101E9#35.0444-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05655");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("5 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 235 0 23");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05656");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05657");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#1.0a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05658");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', (int) (short) 1, 507);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 1 + "'", byte7 == (byte) 1);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
    }

    @Test
    public void test05659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05659");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 100, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 1 + "'", byte3 == (byte) 1);
    }

    @Test
    public void test05660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05660");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 1, (short) 1, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05661");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05662");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) '#', 0L, (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05663");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05664");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ", 507);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 507 + "'", int2 == 507);
    }

    @Test
    public void test05665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05665");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(222, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test05666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05666");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (byte) 0, 100.0d, 3.210411008E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05667");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 332L, 100.0d, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05668");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05669");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("32a0a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32a0a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("04.4041004.40414.4044-414.40414.4041004.40");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: multiple points");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05671");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("-1.0#-1.0#-1.0#32.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05672");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444", (long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 10L + "'", long2 == 10L);
    }

    @Test
    public void test05673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05673");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("1.0a1.0...                                                                                          -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05674");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 92, (float) 127, (float) 195);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 92.0f + "'", float3 == 92.0f);
    }

    @Test
    public void test05675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05675");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0100.01.0-1.01.01..0a1a100", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05676");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.-1..1.-1..1-.1..1-.1-.1--1.-1.-1..1.-1.-1.-1.-1..1.-1.                                                                       -1.-1.-1..1.-1..1-.1..1-.1-.1--1.-1.-1..1.-1.-1.-1.-1..1.-1.", (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 10 + "'", short2 == (short) 10);
    }

    @Test
    public void test05677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05677");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat(".a.a-.", (float) 127);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 127.0f + "'", float2 == 127.0f);
    }

    @Test
    public void test05678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05678");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(" 1 0 97");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1 0 97\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05679");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05680");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(0.0f, (float) (short) 1, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05681");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0#1.0#10.0#0.0", 1001.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1001.0f + "'", float2 == 1001.0f);
    }

    @Test
    public void test05682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05682");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("#1 1 0 97#a1.0a-1.0");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: --1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05684");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "32-1.0#32.0#100.0#-1.#######################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32-1.0#32.0#100.0#-1.#######################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 1 + "'", byte9 == (byte) 1);
    }

    @Test
    public void test05685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05685");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4', 0, (int) (byte) 10);
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
    }

    @Test
    public void test05686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05686");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 0, (long) (short) 0, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05687");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0.04100.041.04-1.041.04100.0                     ...", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test05688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05688");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) (byte) -1, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
    }

    @Test
    public void test05689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05689");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0 -1.0 -1.0 32.0 100.0 -1.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05690");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("...0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05691");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                    .04.04.04404.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05692");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05693");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) (byte) 10, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05694");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1#1#100#0#1", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05695");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ', (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
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
    public void test05696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05696");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0#-1.0#-1.0#32.0#100.0#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1.0#-1.0#-1.0#32.0#100.0# is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05698");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("444");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 444.0d + "'", double1 == 444.0d);
    }

    @Test
    public void test05699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05699");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#1.0a1.0a-1.0##############################################################################", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05700");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("4#4# #a#a#a", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05701");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".#.40..#.40#.4.0#.40#.40..#.00 0 . 970", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test05702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05702");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-", 507L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 507L + "'", long2 == 507L);
    }

    @Test
    public void test05703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05703");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 0L, 332.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 332.0d + "'", double3 == 332.0d);
    }

    @Test
    public void test05704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05704");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("hi !");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi !\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05705");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 368, (long) 10, (long) 483);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
    }

    @Test
    public void test05706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05706");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("32#0#52#-1.0#", 198);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198 + "'", int2 == 198);
    }

    @Test
    public void test05707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05707");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(0, (int) 'a', 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05708");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("32 0 5");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05709");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("hi97.04100.043.21041101E9435.0!32A0A52", (long) 195);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 195L + "'", long2 == 195L);
    }

    @Test
    public void test05710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05710");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(380L, (long) 127, (long) (short) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test05711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05711");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.Class<?> wildcardClass5 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05712");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".a.a-.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05713");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("32 0 52", 332L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332L + "'", long2 == 332L);
    }

    @Test
    public void test05714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05714");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("32#0#5                                                                                                                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05715");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 198, (float) 134, 1.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05716");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01#-1-1#11.#1 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 0 0 01 ", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05717");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(127, 1001, 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 127 + "'", int3 == 127);
    }

    @Test
    public void test05718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05718");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1.0A1.0", (float) 198);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 198.0f + "'", float2 == 198.0f);
    }

    @Test
    public void test05719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05719");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05720");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double9 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test05721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05721");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#", 1001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1001 + "'", int2 == 1001);
    }

    @Test
    public void test05722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05722");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 10, 383, 383);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 383 + "'", int3 == 383);
    }

    @Test
    public void test05723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0###########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0###########################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05724");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0A-1.0A-1.0A32.0A100.0A-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05725");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("a                                                                                          ", (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test05726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05726");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 383, (long) 198, 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test05727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05727");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("-1#1#100#0#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05728");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05729");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(507L, 0L, (long) 192);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05730");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) -1, (short) (byte) 1, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05731");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("1041");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05732");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                             32A0A52");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05733");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 93, (float) 10, (float) 127);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 127.0f + "'", float3 == 127.0f);
    }

    @Test
    public void test05734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05734");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', 380L, (long) (byte) 100);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 380L + "'", long3 == 380L);
    }

    @Test
    public void test05735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05735");
        byte[] byteArray3 = new byte[] { (byte) 1, (byte) 100, (byte) 0 };
        byte byte4 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "32#0#521-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 32#0#521-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[1, 100, 0]");
        org.junit.Assert.assertTrue("'" + byte4 + "' != '" + (byte) 100 + "'", byte4 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 100 + "'", byte5 == (byte) 100);
    }

    @Test
    public void test05736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05736");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                        ", 368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 368 + "'", int2 == 368);
    }

    @Test
    public void test05737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05737");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 0, (byte) 0, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test05738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05738");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(10.0f, 3.21041101E9f, (float) 105);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test05739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05739");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("92a10a1", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05740");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) (-1L), (double) 3210411041L, (double) ' ');
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.210411041E9d + "'", double3 == 3.210411041E9d);
    }

    @Test
    public void test05741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05741");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 10, (byte) -1, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test05742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05742");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(1.0f, 0.0f, (float) (-1));
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05743");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(483, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test05744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05744");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(380, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 380 + "'", int3 == 380);
    }

    @Test
    public void test05745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05745");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, 0L, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test05746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05746");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 1L, (float) 321041104L, 332.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 3.21041088E8f + "'", float3 == 3.21041088E8f);
    }

    @Test
    public void test05747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05747");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (byte) 1, 100L, (long) 1001);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test05748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05748");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05749");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger(".0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#.0#.0#.0##0#.0#3240452");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".0#.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05750");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 100L, (float) (byte) -1, (float) (byte) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test05751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05751");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#-1.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05752");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 0, 1.0f, (float) (short) 1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 1.0f + "'", float3 == 1.0f);
    }

    @Test
    public void test05753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05753");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 134, (float) 380L, 3.21041088E8f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 134.0f + "'", float3 == 134.0f);
    }

    @Test
    public void test05754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05754");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a', 1, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1041" + "'", str8, "1041");
        org.junit.Assert.assertTrue("'" + byte9 + "' != '" + (byte) 10 + "'", byte9 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte10 + "' != '" + (byte) 1 + "'", byte10 == (byte) 1);
    }

    @Test
    public void test05755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05755");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("32#-1#-...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32#-1#-...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05756");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 483, 380.0f, (float) 380L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 483.0f + "'", float3 == 483.0f);
    }

    @Test
    public void test05757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05757");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0#-1.0#-1.0#32.0#100.0#-1.###10a10a-1", 134);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 134 + "'", int2 == 134);
    }

    @Test
    public void test05758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05758");
        double[] doubleArray1 = new double[] { 100.0d };
        double double2 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        double double4 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray1);
        double double5 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[100.0]");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test05759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05759");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("52 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-152 97 100");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05760");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a', (int) '#', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray5, '4', 332, 383);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 332");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[10, 1, 10, 1, 100]");
        org.junit.Assert.assertTrue("'" + byte6 + "' != '" + (byte) 100 + "'", byte6 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 100 + "'", byte7 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05761");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                        ", 3.210411041E9d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 3.210411041E9d + "'", double2 == 3.210411041E9d);
    }

    @Test
    public void test05762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05762");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("-1.0#32.0#100.0#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05763");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0100.01.0-1.01.01..0a1a100", (byte) 0);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 0 + "'", byte2 == (byte) 0);
    }

    @Test
    public void test05764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05764");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(195, 0, 383);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 383 + "'", int3 == 383);
    }

    @Test
    public void test05765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05765");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 10, (int) (short) 1, 507);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 507 + "'", int3 == 507);
    }

    @Test
    public void test05766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05766");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05767");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (float) (short) 10);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 10.0f + "'", float2 == 10.0f);
    }

    @Test
    public void test05768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05768");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444-1.0#-1.0#-1.0#32.0#100.0#-1", (float) '#');
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 35.0f + "'", float2 == 35.0f);
    }

    @Test
    public void test05769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05769");
        java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("100");
        org.junit.Assert.assertNotNull(bigDecimal1);
    }

    @Test
    public void test05770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05770");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (byte) 1, (long) 332, (long) ' ');
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 332L + "'", long3 == 332L);
    }

    @Test
    public void test05771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05771");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test05772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05772");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test05773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05773");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 1, (byte) 0, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 0 + "'", byte3 == (byte) 0);
    }

    @Test
    public void test05774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05774");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05775");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05776");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) 0, (short) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05777");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05778");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("0.0#100.0#1.0#-1.0#1.0#100.0");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05779");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("1.0a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1.0a1.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05780");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 10, (short) 0, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05781");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("32");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 32 + "'", short1 == (short) 32);
    }

    @Test
    public void test05782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05782");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(361, 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05783");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(134, 192, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 192 + "'", int3 == 192);
    }

    @Test
    public void test05784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05784");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) -1, (short) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05785");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444.0a.0a-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444.0a.0a-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05786");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("14 4   a a ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"14 4   a a \"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05787");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        byte byte12 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "0.0 100.0 1.0 -1.0 1.0 100.0-1.0a-1.0a-1.0a32.0a100.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 100.0 1.0 -1.0 1.0 100.0-1.0a-1.0a-1.0a32.0a100.0a-1.0");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertTrue("'" + byte12 + "' != '" + (byte) -1 + "'", byte12 == (byte) -1);
    }

    @Test
    public void test05788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05788");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(368, 507, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 507 + "'", int3 == 507);
    }

    @Test
    public void test05789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05789");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05790");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("100.0#-1.0", (long) (short) 1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
    }

    @Test
    public void test05791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05791");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.max((byte) 100, (byte) 100, (byte) 0);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 100 + "'", byte3 == (byte) 100);
    }

    @Test
    public void test05792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05792");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("3210411041");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"3210411041\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05793");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("", (long) 93);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 93L + "'", long2 == 93L);
    }

    @Test
    public void test05794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05794");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0 100...", 483);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 483 + "'", int2 == 483);
    }

    @Test
    public void test05795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05795");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) (byte) 1, (short) (byte) 1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
    }

    @Test
    public void test05796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05796");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05797");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05798");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("10 1 10 1 100", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test05799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05799");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("32a0a5232#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05800");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) 0, (short) 10, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05801");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("32#-1#-...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05802");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("100.0", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05803");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 100, (byte) 10);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) 10 + "'", byte3 == (byte) 10);
    }

    @Test
    public void test05804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05804");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(380L, (long) '4', (long) 93);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 380L + "'", long3 == 380L);
    }

    @Test
    public void test05805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05805");
        short[] shortArray2 = new short[] { (byte) 0, (byte) 1 };
        short short3 = org.apache.commons.lang3.math.NumberUtils.max(shortArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(shortArray2, '4');
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[0, 1]");
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 1 + "'", short3 == (short) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "041" + "'", str5, "041");
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 0 + "'", short6 == (short) 0);
    }

    @Test
    public void test05806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05806");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(100.0d, (double) 137L, (double) 483.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 483.0d + "'", double3 == 483.0d);
    }

    @Test
    public void test05807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05807");
        long[] longArray3 = new long[] { '4', 'a', 100 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(longArray3, ' ');
        long long6 = org.apache.commons.lang3.math.NumberUtils.max(longArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray3, '4', 507, 844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 507");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[52, 97, 100]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52 97 100" + "'", str5, "52 97 100");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test05808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05808");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("4 4   A A A0444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04444-1.0#-1.0#-1.0#32.0#100.0#-1.-444-1.0#-1.0#-1.0#32.0#100.0#-1.1444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.041444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.04100444-1.0#-1.0#-1.0#32.0#100.0#-1..444-1.0#-1.0#-1.0#32.0#100.0#-1.0444-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05809");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 32, (float) (short) 100, (float) (short) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 100.0f + "'", float3 == 100.0f);
    }

    @Test
    public void test05810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05810");
        float[] floatArray4 = new float[] { 100L, (short) 1, 10.0f, (short) 0 };
        float float5 = org.apache.commons.lang3.math.NumberUtils.min(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        float float8 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, 'a');
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[100.0, 1.0, 10.0, 0.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 0.0f + "'", float5 == 0.0f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str7, "100.0a1.0a10.0a0.0");
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + 100.0f + "'", float8 == 100.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100.0a1.0a10.0a0.0" + "'", str10, "100.0a1.0a10.0a0.0");
    }

    @Test
    public void test05811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05811");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int5 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        int int6 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 10, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test05812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05812");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 1, (int) (short) 0, 1001);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1001 + "'", int3 == 1001);
    }

    @Test
    public void test05813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05813");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte(".a.a-.", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05814");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1a1a100a0a1");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05815");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#   4 #", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test05816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05816");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05817");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(1001, 92, 195);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 92 + "'", int3 == 92);
    }

    @Test
    public void test05818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05818");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 100, (short) (byte) 100, (short) (byte) 10);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05819");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        short short8 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', 289, 222);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
        org.junit.Assert.assertTrue("'" + short8 + "' != '" + (short) 10 + "'", short8 == (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test05820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05820");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("10a1                                                                                                ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05821");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) 10, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05822");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("                                                                                 ");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05823");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("97.14111.143.21141111E9435.144444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05824");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaa1.0A1.0A-1.0--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32#0#52aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa--1.0#-1.0#-1.0#32.0#100.0#-1.#####44444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05825");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte9 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        byte byte10 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "#-1.0#1.0a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #-1.0#1.0a1.0a-1.0");
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
    }

    @Test
    public void test05826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05826");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 0, 0.0f, (float) 332L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 332.0f + "'", float3 == 332.0f);
    }

    @Test
    public void test05827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05827");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                                                                                                                                                                                                                                             -1.0#-1.0#-1.0#32.0#100.0#-1.#######################################################################1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05828");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("975297972999752", (byte) 1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 1 + "'", byte2 == (byte) 1);
    }

    @Test
    public void test05829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05829");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min((int) (short) 10, 0, 844);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test05830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05830");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05831");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) 0, (short) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05832");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 10, (byte) -1, (byte) 1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05833");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05834");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("                                                                                             32a0a52");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32a0a52\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05835");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0 100.0 1.0 -1.0 1.0 100.0");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05836");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("4a4a aaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"4a4a aaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05837");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(shortArray1, ' ', (int) (short) 10, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test05838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05838");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) -1, (short) (byte) 0, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05839");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1. 1.0a1.0...");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05840");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0#1.0a1.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#1.0a1.0a-1.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05841");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 0, (short) (byte) 10, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05842");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32a0a52" + "'", str18, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32a0a52" + "'", str20, "32a0a52");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test05843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05843");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) ' ', 507.0f, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05844");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) 10, (short) 0, (short) -1);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 10 + "'", short3 == (short) 10);
    }

    @Test
    public void test05845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05845");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("1.0A1.0A-1.0", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test05846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05846");
        short short3 = org.apache.commons.lang3.math.NumberUtils.max((short) (byte) -1, (short) (byte) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 100 + "'", short3 == (short) 100);
    }

    @Test
    public void test05847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05847");
        byte byte3 = org.apache.commons.lang3.math.NumberUtils.min((byte) 100, (byte) 0, (byte) -1);
        org.junit.Assert.assertTrue("'" + byte3 + "' != '" + (byte) -1 + "'", byte3 == (byte) -1);
    }

    @Test
    public void test05848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05848");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0A1.0A-1.###########################################################################################");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05849");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 198.0f, 0.0d, 3.210411041E9d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 3.210411041E9d + "'", double3 == 3.210411041E9d);
    }

    @Test
    public void test05850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05850");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("                                                                                             32A0A52", (short) (byte) 0);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 0 + "'", short2 == (short) 0);
    }

    @Test
    public void test05851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05851");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410-1.0#-1.0#1.0a1.0a-1.0-143240452410410", 483);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 483 + "'", int2 == 483);
    }

    @Test
    public void test05852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05852");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long10 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        long long11 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        long long12 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a', 137, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(longArray6, '#', (int) (short) 32, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test05853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05853");
        java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("7925");
        org.junit.Assert.assertEquals("'" + number1 + "' != '" + 7925 + "'", number1, 7925);
    }

    @Test
    public void test05854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05854");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".0#.0#.0##0#.0##-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05855");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 3210411041L, (double) 0, (double) 1001.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05856");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.min(longArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, '4', 93, 127);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 93");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
    }

    @Test
    public void test05857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05857");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("44444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05858");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("0.0#100.0#1.0#-1.0#1.0#100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05859");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("HI!32#0#5", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05860");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (short) 100, 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test05861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05861");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, 444.0d, (-1.0d));
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 444.0d + "'", double3 == 444.0d);
    }

    @Test
    public void test05862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05862");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("97.04100.043.21041101E9435.0", 483.0f);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 483.0f + "'", float2 == 483.0f);
    }

    @Test
    public void test05863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05863");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- 0.1-                                                                       .1- 0.001 0.23 0.1- 0.1- 0.1-     .1- 0.001 0.23 0.1- 0.1- 0.1--1.0 -1.0 -1.0 32.0 100.0 -1.0    .1- 0.001 0.23 0.1- 0.1- ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05864");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float7 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, '#', (int) '4', 844);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 3.21041101E9f + "'", float6 == 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 3.21041101E9f + "'", float7 == 3.21041101E9f);
    }

    @Test
    public void test05865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05865");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("      a a a#####################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05866");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("0.#-1.0#0.", (float) (byte) 1);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 1.0f + "'", float2 == 1.0f);
    }

    @Test
    public void test05867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05867");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 10, (double) 380L, (double) 1L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 380.0d + "'", double3 == 380.0d);
    }

    @Test
    public void test05868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05868");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05869");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.##                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"-1.0#-1.0#-1.0#32.0#100.0#-1.##\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05870");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0A1.0A-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05871");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        double double8 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 92, (int) '#');
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 92, 195);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test05872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05872");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       -1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       1 1 0 97", (long) '#');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 35L + "'", long2 == 35L);
    }

    @Test
    public void test05873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05873");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("#################################################################################################################################################################################################################################################################################################", (float) 198);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 198.0f + "'", float2 == 198.0f);
    }

    @Test
    public void test05874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05874");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble("#-1-1#11.#-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"#-1-1#11.#-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05875");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0#100.0#", 289);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 289 + "'", int2 == 289);
    }

    @Test
    public void test05876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05876");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        int int9 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        int int10 = org.apache.commons.lang3.math.NumberUtils.max(intArray3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 198, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', (int) (short) 10, 368);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test05877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05877");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-", (double) 507L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 507.0d + "'", double2 == 507.0d);
    }

    @Test
    public void test05878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05878");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((-1.0d), (double) 361, 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 361.0d + "'", double3 == 361.0d);
    }

    @Test
    public void test05879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05879");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(844, (int) (byte) -1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 844 + "'", int3 == 844);
    }

    @Test
    public void test05880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05880");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441.0a1.0...", (long) 332);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 332L + "'", long2 == 332L);
    }

    @Test
    public void test05881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05881");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double10 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double11 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double12 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4', 332, (int) (short) -1);
        double double17 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double18 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test05882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05882");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) 1, (long) (byte) 0, (long) 198);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 198L + "'", long3 == 198L);
    }

    @Test
    public void test05883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05883");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("32#-1#-...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"32#-1#-...\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05884");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 93L, (float) (byte) 10, (float) 127);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 10.0f + "'", float3 == 10.0f);
    }

    @Test
    public void test05885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05885");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigDecimal bigDecimal1 = org.apache.commons.lang3.math.NumberUtils.createBigDecimal("44444444444444444444444444444444444444444444444444444444444444444.1-#0.001#0.23#0.1-#0.1-#0.1-444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: null");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05886");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 332.0f, (double) 1001, (double) 3210411041L);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 332.0d + "'", double3 == 332.0d);
    }

    @Test
    public void test05887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05887");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001100110011001444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05888");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("a1.0a");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05889");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        float float6 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', (int) (byte) -1, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 3.21041101E9f + "'", float6 == 3.21041101E9f);
    }

    @Test
    public void test05890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05890");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 10, (float) 289, 507.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test05891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05891");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(7925, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7925 + "'", int3 == 7925);
    }

    @Test
    public void test05892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05892");
        byte[] byteArray6 = new byte[] { (byte) 10, (byte) 10, (byte) -1, (byte) 100, (byte) 10, (byte) 1 };
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray6, ' ', 0, 1);
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.max(byteArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray6, '#', 380, 195);
        byte byte16 = org.apache.commons.lang3.math.NumberUtils.min(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[10, 10, -1, 100, 10, 1]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 100 + "'", byte11 == (byte) 100);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + byte16 + "' != '" + (byte) -1 + "'", byte16 == (byte) -1);
    }

    @Test
    public void test05893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05893");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("100.0#-1.0", (double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05894");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("                                                                                 9752 97 97299 9752 ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05895");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 1, 198.0d, (double) 289);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 289.0d + "'", double3 == 289.0d);
    }

    @Test
    public void test05896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05896");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 10, (long) 1001, (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }

    @Test
    public void test05897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05897");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa#1 1 0 97#100.0a1.0a10.0a0.aaaaaaaaaaaaaaaaaaaaaaaa is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05898");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1444-1.0#-1.0#-1.0#32.0#100.0#-1                    .0#.0#.0##0#.0#-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05899");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(380L, 93L, 93L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 93L + "'", long3 == 93L);
    }

    @Test
    public void test05900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05900");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) '4', 198L, (long) 222);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 222L + "'", long3 == 222L);
    }

    @Test
    public void test05901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05901");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min(3.21041088E8f, (float) 195, 0.0f);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 0.0f + "'", float3 == 0.0f);
    }

    @Test
    public void test05902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05902");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger("444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444-1.0#-1.0#-1.0#32.0#100.0#-1.44444444444444444444444444444444444444444444444444444444444444444\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05903");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(383, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 383 + "'", int3 == 383);
    }

    @Test
    public void test05904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05904");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 0, (short) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05905");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("1AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05906");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("-1.0#-1.0#-1.0#32.0#100.0#-1.0", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05907");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  100.0#-1.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05908");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) 361, (double) (byte) 1, (double) 198);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test05909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05909");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("14 4   a a ", 368);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 368 + "'", int2 == 368);
    }

    @Test
    public void test05910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05910");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("1.0a1.0...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05911");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "-1.0#-1.0###########################################################################################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0###########################################################################################");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
    }

    @Test
    public void test05912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05912");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(byteArray2, 'a');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 198, 0);
        byte byte17 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "-1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: -1.0#-1.0#-1.0#32.0#100.0#-1.                                                                       ");
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
    }

    @Test
    public void test05913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05913");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max((double) 100.0f, (double) (byte) -1, (double) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test05914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05914");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(longArray1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', (-1), 198);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
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
    }

    @Test
    public void test05915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05915");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("                     100.0#-1.0                     ");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05916");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("32a-1a-1a100a10a32");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05917");
        float float3 = org.apache.commons.lang3.math.NumberUtils.min((float) 105, (float) 195L, (float) (short) -1);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + (-1.0f) + "'", float3 == (-1.0f));
    }

    @Test
    public void test05918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05918");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a', (int) (byte) 10, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(shortArray1, '#');
        short short11 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10" + "'", str10, "10");
        org.junit.Assert.assertTrue("'" + short11 + "' != '" + (short) 10 + "'", short11 == (short) 10);
    }

    @Test
    public void test05919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05919");
        long[] longArray1 = new long[] { 137 };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(longArray1, ' ');
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[137]");
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 137L + "'", long2 == 137L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "137" + "'", str4, "137");
    }

    @Test
    public void test05920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05920");
        float float1 = org.apache.commons.lang3.math.NumberUtils.toFloat("97.0#100.0#3.21041101E9#35.0444-1.0#-1.0#-1.0#32.0#100.0#-1.");
        org.junit.Assert.assertTrue("'" + float1 + "' != '" + 0.0f + "'", float1 == 0.0f);
    }

    @Test
    public void test05921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05921");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min(0.0d, (double) 361, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test05922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05922");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05923");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max(192, 195, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 195 + "'", int3 == 195);
    }

    @Test
    public void test05924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05924");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 100, (short) 100, (short) 0);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) 0 + "'", short3 == (short) 0);
    }

    @Test
    public void test05925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05925");
        double double3 = org.apache.commons.lang3.math.NumberUtils.max(0.0d, (double) 'a', 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test05926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05926");
        byte byte1 = org.apache.commons.lang3.math.NumberUtils.toByte("HI!32#0#5");
        org.junit.Assert.assertTrue("'" + byte1 + "' != '" + (byte) 0 + "'", byte1 == (byte) 0);
    }

    @Test
    public void test05927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Double double1 = org.apache.commons.lang3.math.NumberUtils.createDouble(".#a.#a-.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".#a.#a-.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05928");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       -1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.-1.0-1.0-1.032.0100.0-1.                                                                       0.04100.041.04-1.041.04100.0                                                                        ", (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test05929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05929");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("-1.0#-1.0#1.0a1.0a-1.0##############################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: -1.0#-1.0#1.0a1.0a-1.0############################################################################## is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05930");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("-1.0#-1.0#aaa14140497-1.0#-1.0#");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05931");
        int int3 = org.apache.commons.lang3.math.NumberUtils.min(10, 1001, 383);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test05932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05932");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((int) (byte) 0, 195, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 195 + "'", int3 == 195);
    }

    @Test
    public void test05933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05933");
        long[] longArray6 = new long[] { ' ', (short) -1, (byte) -1, 100, (byte) 10, ' ' };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(longArray6, '#');
        long long9 = org.apache.commons.lang3.math.NumberUtils.max(longArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(longArray6, 'a');
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, -1, -1, 100, 10, 32]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32#-1#-1#100#10#32" + "'", str8, "32#-1#-1#100#10#32");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32a-1a-1a100a10a32" + "'", str11, "32a-1a-1a100a10a32");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32a-1a-1a100a10a32" + "'", str13, "32a-1a-1a100a10a32");
    }

    @Test
    public void test05934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05934");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("-1.0a-1.0a-1.0a32.0a100.0a-1.07");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05935");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#11-1.54-1.54-1.5444.54155.54-1.44445.1-45.5514#-1.0#1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1.0a1.0a-1.0#-1.0#1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####-1.0#-1.0#-1.0#32.0#100.0#-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05937");
        int int3 = org.apache.commons.lang3.math.NumberUtils.max((-1), (int) (short) 32, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test05938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05938");
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger1 = org.apache.commons.lang3.math.NumberUtils.createBigInteger("                                                                                                                                      -1.0#-1.0#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                                                                                      ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10#100.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05940");
        short[] shortArray1 = new short[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(shortArray1, 'a');
        short short4 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        short short5 = org.apache.commons.lang3.math.NumberUtils.max(shortArray1);
        short short6 = org.apache.commons.lang3.math.NumberUtils.min(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertTrue("'" + short4 + "' != '" + (short) 10 + "'", short4 == (short) 10);
        org.junit.Assert.assertTrue("'" + short5 + "' != '" + (short) 10 + "'", short5 == (short) 10);
        org.junit.Assert.assertTrue("'" + short6 + "' != '" + (short) 10 + "'", short6 == (short) 10);
    }

    @Test
    public void test05941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05941");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max((long) (short) 32, (long) (short) 0, 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test05942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05942");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05943");
        byte[] byteArray4 = new byte[] { (byte) 1, (byte) 0, (byte) 0, (byte) 0 };
        byte byte5 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(byteArray4, ' ');
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "10a1");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 10a1");
        } catch (java.io.UnsupportedEncodingException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[1, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + byte5 + "' != '" + (byte) 1 + "'", byte5 == (byte) 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1 0 0 0" + "'", str7, "1 0 0 0");
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 1 + "'", byte8 == (byte) 1);
    }

    @Test
    public void test05944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Float float1 = org.apache.commons.lang3.math.NumberUtils.createFloat("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05945");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(198L, (long) 1, (long) 507);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 507L + "'", long3 == 507L);
    }

    @Test
    public void test05946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05947");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("-1.0#-1.0#-1.0#32.0#.0#");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Long long1 = org.apache.commons.lang3.math.NumberUtils.createLong("                                                                                                                                                                                                                                                                                                                                                  0.0100.01.0-1.01.0100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"                                                                                                                                                                                                                                                                                                                                                  0.0100.01.0-1.01.0100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05949");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####", 222);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 222 + "'", int2 == 222);
    }

    @Test
    public void test05950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05950");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("0.0 97.0 10.0 507.0 507.0 1001.0");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05951");
        int[] intArray3 = new int[] { (byte) 10, 10, (short) -1 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        int int6 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.Class<?> wildcardClass7 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[10, 10, -1]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10a10a-1" + "'", str5, "10a10a-1");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test05952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05952");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, '#');
        int int13 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) ' ', (-1));
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', (int) (byte) 0, 0);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 195, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32#0#52" + "'", str12, "32#0#52");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test05953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05953");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4444444444444444444444444444444444444444444444444444444444444444444444444444-1.0#-1.0#-1.0#32.0#1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05954");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-", 383);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 383 + "'", int2 == 383);
    }

    @Test
    public void test05955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05955");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        int int21 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32a0a52" + "'", str18, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32 0 52" + "'", str20, "32 0 52");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test05956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05956");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isNumber("4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa4a4a aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05957");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max(507.0f, (float) 100, (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test05958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05958");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 100, (float) 7925, (float) 195);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 7925.0f + "'", float3 == 7925.0f);
    }

    @Test
    public void test05959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05959");
        double double3 = org.apache.commons.lang3.math.NumberUtils.min((double) (-1), (double) 1L, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test05960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05960");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 32, (float) 1, (float) (byte) 0);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test05961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05961");
        short short3 = org.apache.commons.lang3.math.NumberUtils.min((short) (byte) 0, (short) (byte) -1, (short) (byte) 100);
        org.junit.Assert.assertTrue("'" + short3 + "' != '" + (short) -1 + "'", short3 == (short) -1);
    }

    @Test
    public void test05962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05962");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.04100.041.04-1.041.04100.0                     ...", (byte) 100);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 100 + "'", byte2 == (byte) 100);
    }

    @Test
    public void test05963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05963");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Number number1 = org.apache.commons.lang3.math.NumberUtils.createNumber("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: 1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                     is not a valid number.");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05964");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.0100.01.0-1.01.0100.0", (byte) -1);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) -1 + "'", byte2 == (byte) -1);
    }

    @Test
    public void test05965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05965");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("10#1");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05966");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble("                                                                                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05967");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("444-1.0#-1.0#-1.0#32.0#100.0#-1.444-1.0#-1.0#-1.0#32.0#100.0#-1", (float) (short) 100);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 100.0f + "'", float2 == 100.0f);
    }

    @Test
    public void test05968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05968");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) 1 };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(byteArray2, ' ', 0, (int) (byte) 1);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        byte byte8 = org.apache.commons.lang3.math.NumberUtils.max(byteArray2);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(byteArray2, '4');
        byte byte11 = org.apache.commons.lang3.math.NumberUtils.min(byteArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join(byteArray2, '#', (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[10, 1]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
        org.junit.Assert.assertTrue("'" + byte7 + "' != '" + (byte) 10 + "'", byte7 == (byte) 10);
        org.junit.Assert.assertTrue("'" + byte8 + "' != '" + (byte) 10 + "'", byte8 == (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1041" + "'", str10, "1041");
        org.junit.Assert.assertTrue("'" + byte11 + "' != '" + (byte) 1 + "'", byte11 == (byte) 1);
    }

    @Test
    public void test05969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05969");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble("77777777777777777777777777777777777777710a1a10a1a100", (double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05970");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test05971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05971");
        boolean boolean1 = org.apache.commons.lang3.math.NumberUtils.isDigits("0.1-444.0a.0a-.#0.1-#0.1-#0.23#0.001#aaaa44444444444444444444444444444444444444444444444444444444444444444.1-#-1.0#aaa14140497-1.0#-1.0#-1.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test05972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05972");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("00.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-040.1-#0.001#0.23#0.1-#0.1-#0.1--0.1-#0.001#0.23#0.1-#0.1-#0.1-10.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-0410.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-041000.1-#0.001#0.23#0.1-#0.1-#0.1-.0.1-#0.001#0.23#0.1-#0.1-#0.1-00.1-#0.001#0.23#0.1-#0.1-#0.1-                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test05973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05973");
        short short1 = org.apache.commons.lang3.math.NumberUtils.toShort("32-1.0#32.0#100.0#-1.#######################################################################");
        org.junit.Assert.assertTrue("'" + short1 + "' != '" + (short) 0 + "'", short1 == (short) 0);
    }

    @Test
    public void test05974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05974");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, '#', 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test05975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05975");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int1 = org.apache.commons.lang3.math.NumberUtils.createInteger(".04100.041.04-1.041.04100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".04100.041.04-1.041.04100.0\"");
        } catch (java.lang.NumberFormatException e) {
        // Expected exception.
        }
    }

    @Test
    public void test05976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05976");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) (short) 32, (float) (short) 10, (float) 0L);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 32.0f + "'", float3 == 32.0f);
    }

    @Test
    public void test05977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05977");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("                                                                                                                                                                                                                                                                                                                                                                         ", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test05978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05978");
        long[] longArray1 = new long[] { 0L };
        long long2 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long3 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long4 = org.apache.commons.lang3.math.NumberUtils.max(longArray1);
        long long5 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        long long6 = org.apache.commons.lang3.math.NumberUtils.min(longArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(longArray1, '4', (int) (short) 32, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
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
    }

    @Test
    public void test05979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05979");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 1.0f, (-1.0d), (short) 1, (byte) 100 };
        double double7 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(doubleArray6, '4');
        double double12 = org.apache.commons.lang3.math.NumberUtils.max(doubleArray6);
        double double13 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(doubleArray6, ' ', 195, 195);
        double double18 = org.apache.commons.lang3.math.NumberUtils.min(doubleArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = org.apache.commons.lang3.StringUtils.join(doubleArray6, 'a', 0, 222);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[0.0, 100.0, 1.0, -1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str9, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0.04100.041.04-1.041.04100.0" + "'", str11, "0.04100.041.04-1.041.04100.0");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test05980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05980");
        int int1 = org.apache.commons.lang3.math.NumberUtils.toInt("0.0a100.0a1.0a-1.0a1.0a100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test05981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05981");
        double double2 = org.apache.commons.lang3.math.NumberUtils.toDouble(".#.40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.", 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test05982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05982");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt("#a#a aaaaaa#a#a a100.0a1.0a10.0a0.#a#a aaaaaa#a#a aa", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test05983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05983");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 'a', (long) 1, (long) 0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05984");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 0L, (long) 483);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 483L + "'", long3 == 483L);
    }

    @Test
    public void test05985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05985");
        float float3 = org.apache.commons.lang3.math.NumberUtils.max((float) 507L, (float) '4', (float) 105);
        org.junit.Assert.assertTrue("'" + float3 + "' != '" + 507.0f + "'", float3 == 507.0f);
    }

    @Test
    public void test05986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05986");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        byte byte6 = org.apache.commons.lang3.math.NumberUtils.max(byteArray5);
        byte byte7 = org.apache.commons.lang3.math.NumberUtils.min(byteArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join(byteArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "0.0 100.0 1.0 -1.0 1.0 100.0-1.0a-1.0a-1.0a32.0a100.0a-1.0");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 0.0 100.0 1.0 -1.0 1.0 100.0-1.0a-1.0a-1.0a32.0a100.0a-1.0");
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
    public void test05987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05987");
        float[] floatArray4 = new float[] { 'a', 100, 3.21041101E9f, '#' };
        float float5 = org.apache.commons.lang3.math.NumberUtils.max(floatArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ', 507, 137);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(floatArray4, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join(floatArray4, '4', 844, 7925);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 844");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[97.0, 100.0, 3.21041101E9, 35.0]");
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 3.21041101E9f + "'", float5 == 3.21041101E9f);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97.04100.043.21041101E9435.0" + "'", str7, "97.04100.043.21041101E9435.0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97.0 100.0 3.21041101E9 35.0" + "'", str13, "97.0 100.0 3.21041101E9 35.0");
    }

    @Test
    public void test05988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05988");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 198, (long) 'a', (long) 195);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
    }

    @Test
    public void test05989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05989");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1444-1.0#-1.0#-1.0#32.0#100.0#-1                    .0#.0#.0##0#.0#-1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2#1-##1-##--1--1-##--1-##1-#2", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test05990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05990");
        double double1 = org.apache.commons.lang3.math.NumberUtils.toDouble(".#.40..#.40#.4.0#.40#.40..#.00 0 . 970-1.0-1.0-1.032.0100.0-1.0.1-0.0010.230.1-0.1-0.1--1.0-1.0-1.032.0100.0-1.");
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
    }

    @Test
    public void test05991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05991");
        long long2 = org.apache.commons.lang3.math.NumberUtils.toLong("0.04100.041.04-1.041.04100.0                     ...", 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test05992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05992");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) (short) 0, (long) 137, 195L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test05993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05993");
        long long3 = org.apache.commons.lang3.math.NumberUtils.max(0L, 332L, (long) (-1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 332L + "'", long3 == 332L);
    }

    @Test
    public void test05994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05994");
        int[] intArray3 = new int[] { ' ', (short) 0, '4' };
        int int4 = org.apache.commons.lang3.math.NumberUtils.min(intArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ', (int) (byte) 0, 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a', (int) 'a', (int) (short) 1);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(intArray3, 'a');
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join(intArray3, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = org.apache.commons.lang3.StringUtils.join(intArray3, '4', 92, 483);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 92");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 0, 52]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32 0 52" + "'", str10, "32 0 52");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32 0 52" + "'", str12, "32 0 52");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32a0a52" + "'", str18, "32a0a52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32 0 52" + "'", str20, "32 0 52");
    }

    @Test
    public void test05995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05995");
        short short2 = org.apache.commons.lang3.math.NumberUtils.toShort("0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####--1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####1-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####041-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####04100-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####.-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####0-1.0#-1.0#-1.0#32.0#100.0#-1.####0.1-#0.001#0.23#0.1-#0.1-#0.1--1.0#-1.0#-1.0#32.0#100.0#-1.#####", (short) 100);
        org.junit.Assert.assertTrue("'" + short2 + "' != '" + (short) 100 + "'", short2 == (short) 100);
    }

    @Test
    public void test05996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05996");
        byte byte2 = org.apache.commons.lang3.math.NumberUtils.toByte("0.04100.041.04-1.041.04100.0#1 1 0 97#", (byte) 10);
        org.junit.Assert.assertTrue("'" + byte2 + "' != '" + (byte) 10 + "'", byte2 == (byte) 10);
    }

    @Test
    public void test05997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05997");
        long long3 = org.apache.commons.lang3.math.NumberUtils.min((long) 134, (long) ' ', (long) 7925);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 32L + "'", long3 == 32L);
    }

    @Test
    public void test05998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05998");
        int int2 = org.apache.commons.lang3.math.NumberUtils.toInt(".#a.#a-.", 1001);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1001 + "'", int2 == 1001);
    }

    @Test
    public void test05999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test05999");
        long long1 = org.apache.commons.lang3.math.NumberUtils.toLong("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test06000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RandoopRegressionTest11.test06000");
        float float2 = org.apache.commons.lang3.math.NumberUtils.toFloat("1-1.54-1.54-1.5444.54155.54-1.44445.1-45.55145.4445.1-45.1-45.1--1.54-1.54-1.5444.54155.54-1.44444-1.54-1.54-1.5444.54155.54-1.                                                                       ", (float) 198);
        org.junit.Assert.assertTrue("'" + float2 + "' != '" + 198.0f + "'", float2 == 198.0f);
    }
}

